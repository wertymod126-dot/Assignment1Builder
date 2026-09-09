public class Main {
    public static void main(String[] args) {
        DonerDirector director = new DonerDirector();

        DonerBuilder classicBuilder = new ClassicDonerBuilder();
        director.setBuilder(classicBuilder);
        Doner classicDoner = director.constructDoner();
        System.out.println("Made by Director classic doner " + classicDoner);



        DonerBuilder studentBuilder = new StudentSpecialBuilder();
        director.setBuilder(studentBuilder);
        Doner studentSpecial = director.constructDoner();

        System.out.println("Made by Director student special doner: " + studentSpecial);
    }
}
