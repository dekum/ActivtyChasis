import java.util.Date;

public class Vehicle implements Engine, Chassis  {
  private Date vehicleManufacturedDate;
  private  String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;
  private String engineManufacturer;
  private Date engineManufacturedDate;
  private  String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;


  public Vehicle(String vehicleManufacturer,Date vehicleManufacturedDate,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }
  public Vehicle(){
    vehicleManufacturer = "Generic";
    vehicleManufacturedDate = new Date();
    vehicleMake = "Generic";
    vehicleModel = "Generic";
    vehicleType = "None";
    vehicleEngine= new ManufacturedEngine();
    //Chassis vehicleFrame;
    //String vehicleType = "null"


//    setEngineManufacturer("Generic");
//    setEngineManufacturedDate(new Date() );
//    setEngineMake("Generic");
//    setEngineModel("Generic");
//    setEngineType("88 AKI");
//    setEngineCylinders(0);
    driveTrain = " 2WD: Two-Wheel Drive";
    //vehicleEngine.setEngineCylinders(4);
//setEngineCylinders(4);

  }

  @Override
  public Chassis getChassisType() {
    return null;
  }

  @Override
  public void setChassisType(String vehicleChassis) {

  }

  @Override
  public void setEngineCylinders(int engineCylinders) {

  }

  @Override
  public void setEngineManufacturedDate(Date date) {

  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

  }

  @Override
  public void setEngineMake(String engineMake) {

  }

  @Override
  public void setEngineModel(String engineModel) {

  }

  @Override
  public void setDriveTrain(String driveTrain) {

  }

  @Override
  public void setEngineType(String fuel) {

  }

  public static  void main(String args[]){
 // Vehicle veh1 = new Vehicle();
   // System.out.println(veh1.toString());
    //Vehicle veh2 = new Vehicle();
    //System.out.println(veh2.toString());
    //ManufacturedEngine vehicleEngine= new ManufacturedEngine();


    //ManufacturedEngine jer = new ManufacturedEngine();

    Vehicle veh2 = new Vehicle(
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
            "2WD: Two-Wheel Drive")

    );
    System.out.println("\n \n");
    System.out.println(veh2);

  }

  @Override
  public String toString() {
    return "Vehicle\n" +
        "vehicleManufacturedDate=" + vehicleManufacturedDate + "\n" +
        "vehicleManufacturer='" + vehicleManufacturer + "\n"+
        "vehicleMake='" + vehicleMake  + "\n" +
        "vehicleModel='" + vehicleModel + "\n" +
       // ", vehicleFrame=" + vehicleFrame + "\n" +
        "vehicleType='" + vehicleType + "\n" +

        //", vehicleEngine=" +
        vehicleEngine // This calls vechicleEngine's toString
       // ", AAAdriveTrain='" + driveTrain + "\n" +
        ;
  }
}
