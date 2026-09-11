public class Main {
    public static void main(String[] args) {
        DonerDirector director = new DonerDirector();

        Doner classicDoner = director.constructClassicDoner(new Doner.Builder());
        System.out.println("Made by Director (Classic): " + classicDoner);

        Doner studentSpecial = director.constructStudentSpecial(new Doner.Builder());
        System.out.println("Made by Director (Student Special): " + studentSpecial);

        Doner customDoner = new Doner.Builder()
                .withWrap(Doner.WrapType.CheeseLavash)
                .withMeat(Doner.MeatType.MixedMeat)
                .withFries(true)
                .withGarlicSauce(true)
                .withPickles(false)
                .makeSpicy(true)
                .build();
        System.out.println("Custom Doner: " + customDoner);

        Doner modifiedStudentDoner = new Doner.Builder()
                .withWrap(Doner.WrapType.Lavash)
                .withMeat(Doner.MeatType.Beef)
                .withPickles(true)
                .build();

        System.out.println("Modified Student Doner: " + modifiedStudentDoner);
    }
}