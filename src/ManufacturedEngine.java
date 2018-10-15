import java.util.Date;

public class ManufacturedEngine implements Engine {
private String engineManufacturer;
  private Date engineManufacturedDate;
  private  String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  ManufacturedEngine(){

    engineManufacturer= "Generic";
    engineManufacturedDate= new Date();
    engineMake= "Generic";
    engineModel = "Generic";
    engineType = "88 AKI";
    engineCylinders=0;
    driveTrain = "2WD: Two-Wheel Drives";


  }
  public ManufacturedEngine(String engineManufacturer,
      Date engineManufacturedDate,
      String engineMake,
      String engineModel,
      int engineCylinders,
      String engineType,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain= driveTrain;
  }

  @Override
  public String toString() {
    return ""+
        //+ "ManufacturedEngine{\n" +
        "engineManufacturer='" + engineManufacturer + '\'' +
        "\n engineManufacturedDate=" + engineManufacturedDate +
        "\n engineMake='" + engineMake + '\'' +
        "\n engineModel='" + engineModel + '\'' +
        "\n engineCylinders=" + engineCylinders +
        "\n engineType='" + engineType + '\'' +
        "\n driveTrain='" + driveTrain + '\'' +
        '}';
  }

  public static void main(String[] args) {
    ManufacturedEngine manu = new ManufacturedEngine();
    System.out.println(manu.toString());
    ManufacturedEngine manu2 = new ManufacturedEngine(
        "Honda",
    new Date(),
     "H-Series",
    "H23A1",
    4,
        "88 AKI",
        "2WD: Two-Wheel Drive"
    );
    System.out.println(manu2.toString());

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
}
