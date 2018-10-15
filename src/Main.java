import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //• Write a static main method that creates two objects, one with the default constructor and the other with the
        //  constructor with parameters. Give sample data for the parameters
        VehicleChassis myVc = new VehicleChassis();
        System.out.println(myVc.toString());
        myVc.setChassisType("chazzz");
        System.out.println(myVc.toString());
        System.out.println(myVc);

        VehicleChassis myVc2 = new VehicleChassis("chas");
        System.out.println(myVc2.toString());

        VehicleFrame myVF = new VehicleFrame("DaChzz");
        myVF.setChassisType("DaChazz");
        myVF.getChassisType();
        System.out.println(myVF);
        ManufacturedEngine myME = new ManufacturedEngine();
        Car c1 = new Car(
            "Honda",
            new Date(),
            "Honda",
            "Prelude",
            null,
            "null",
            "",
            new ManufacturedEngine(  "Honda",
                new Date(),
                "H-Series",
                "H23A1",
                4,
                "88 AKI",
                "2WD: Two-Wheel Drive"),
            new Feature[4],
            4
        );
        System.out.println(c1.toString());




    }
}
