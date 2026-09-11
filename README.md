# Software Design Patterns - Assignment 1 (Builder Pattern)

**Author:** Shangerey Adilbek SE-2513

# 1. Project Description:
The product I used for this assignment is Doner ordering system. The doner structure system customization heavily benefits from the Builder creational design pattern. 

The Doner is an intricate object that consists of many options (such as pickles, fries, onions, tomatoes, and sauces) and essential elements (wrap and meat types). Without using builder pattern, it would be necessary to have either an enormous constructor  for constructing various versions of the Doner or use setter methods to make an object partially completed. With the help of the DonerBuilder class, a client can create a highly customizable order easily.


## 2. Clean Code Principles Applied (Section 3 Answers)

Below are the five Clean Code principles applied in this implementation, complete with justifications and code excerpts.

### Principle 1: Meaningful, Intention-Revealing Names
**Justification:** Variable names should explicitly state what they represent so other developers do not have to guess their purpose. Instead of using generic boolean names like `flag1` or `sauce`, the variables are named as clear true/false statements.

<img width="575" height="220" alt="изображение" src="https://github.com/user-attachments/assets/5762858b-8f17-4cd8-8925-e48eba95e270" />

### Principle 2: No Magic Strings or Numbers
**Justification:** Hardcoding strings like "Beef" or "Lavash" can lead to typos and runtime errors. By using Enums for WrapType and MeatType, the code enforces type safety and makes valid options immediately obvious to the client.

<img width="295" height="270" alt="изображение" src="https://github.com/user-attachments/assets/b0919563-ca70-4e62-90a6-e0159160384a" />

### Principle 3: Validated Construction
**Justification:**An object should not be allowed to instantiate in an invalid state. A doner without meat or a wrap is not a valid doner. The build() method calls a private validateOrder() method that checks these required fields before the Doner is ever created, throwing a clear IllegalStateException if requirements aren't met.


<img width="711" height="371" alt="изображение" src="https://github.com/user-attachments/assets/58165dd0-3b7c-4e2e-a04b-5bef09ff8c60" />

### Principle 4: Small Methods Doing One Thing
**Justification:** Methods should be short and focused on a single task. In the Builder, each setter method does exactly one thing: updates a specific ingredient state and returns the builder instance to maintain the fluent API

<img width="554" height="356" alt="изображение" src="https://github.com/user-attachments/assets/e91e0071-f6a4-49c3-8b06-e7d90ac4b815" />

### Principle 5: Small Methods Doing One Thing
**Justification:** Classes should adhere to the Single Responsibility Principle (SRP) by maintaining a single, well-defined purpose while following uniform indentation, naming conventions, and structural layout across all files. Instead of creating a monolithic class that handles data holding, step-by-step assembly, validation, and standard recipe configurations all in one place, the codebase is partitioned into small, focused classes (Doner, DonerBuilder, and DonerDirector).


<img width="326" height="171" alt="изображение" src="https://github.com/user-attachments/assets/c0b756d9-c32c-4133-8551-1ed643694041" />


