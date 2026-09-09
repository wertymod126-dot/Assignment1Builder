public class Main {
    public static void main(String[] args) {
        DonerDirector director = new DonerDirector();

        Doner classicDoner = director.constructClassicDoner(new DonerBuilder());
        System.out.println("Made by Director (Classic): " + classicDoner);

        Doner studentSpecial = director.constructStudentSpecial(new DonerBuilder());
        System.out.println("Made by Director (Student Special): " + studentSpecial);

        Doner customDoner = new DonerBuilder()
                .withWrap(WrapType.CheeseLavash)
                .withMeat(MeatType.MixedMeat)
                .withFries(true)
                .withGarlicSauce(true)
                .withPickles(false)
                .makeSpicy(true)
                .build();

        System.out.println("Custom Doner: " + customDoner);

        Doner modifiedCustomDoner = director.constructStudentSpecial(new DonerBuilder()
                .withMeat(MeatType.Beef)
                .withPickles(false)
        );


        System.out.println("Modified Custom Doner: " + modifiedCustomDoner);

    }
}