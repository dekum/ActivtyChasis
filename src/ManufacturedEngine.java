import java.util.Date;

public class ManufacturedEngine {
private String engineManufacturer;
  private Date engineManufacturedDate;
  private  String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  ManufacturedEngine(){

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
    return "ManufacturedEngine{" +
        "engineManufacturer='" + engineManufacturer + '\'' +
        ", engineManufacturedDate=" + engineManufacturedDate +
        ", engineMake='" + engineMake + '\'' +
        ", engineModel='" + engineModel + '\'' +
        ", engineCylinders=" + engineCylinders +
        ", engineType='" + engineType + '\'' +
        ", driveTrain='" + driveTrain + '\'' +
        '}';
  }
}
