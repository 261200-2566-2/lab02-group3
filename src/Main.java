public class Main {
    public static void main(String[] args) {


        AirPurifier a = new AirPurifier("sPeCIAl","12345");
        a.printField();
        a.setTurnOn();
        a.printField();

        AirPurifier b = new AirPurifier("696969");
        b.setTurnOn();
        b.setTurnOff();
        b.printField();

        AirPurifier c = new AirPurifier();
        System.out.println(AirPurifier.getTotal());

        System.out.println(AirPurifier.mostPopularModel());

    }
}