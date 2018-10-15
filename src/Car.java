import java.util.Arrays;
import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public String getExteriorFeatures(){
    String returnString ="";
    for(Feature ex: feature){
      if (ex instanceof  ExteriorFeature){
        returnString += ex.toString();


      }else
      {
        returnString += "";

      }


    }
  return returnString;
  }
  public String getInteriorFeatures(){
    String returnString ="";
    for(Feature ex: feature){
      if (ex instanceof  InteriorFeature){
        returnString += ex.toString()+"\n";


      }else
      {
        returnString += "";

      }



    }
    return returnString;

  }

  public Car(String vehicleManufacturer, Date vehicleManufacturedDate,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, Engine vehicleEngine, Feature[] features, int carAxle) {
    super(vehicleManufacturer, vehicleManufacturedDate, vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain, vehicleEngine);
    //this.feature = feature;
    this.carAxle = carAxle;
    this.feature = new Feature[]{
        new ExteriorFeature("Wood Panels"),
        new ExteriorFeature("Moonroof"),
        new InteriorFeature("AM/FM Radio"),
        new InteriorFeature("Air Conditioning")
    };

  }

  public Car(Feature[] feature, int carAxle) {
    this.feature = feature;
    this.carAxle = carAxle;
  }
  public Car(){
    super();
    feature = new Feature[]{
        new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Fearures")
    };

//feature = new Feature[]{ new ExteriorFeature("Wood Panels"),
//    new ExteriorFeature("Moonroof"),
//    new InteriorFeature("AM/FM Radio"),
//    new InteriorFeature("Air Conditioning")
//
//    };
  }
  public static  void main(String args[]){

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

  @Override
  public String toString() {
    return super.toString()+
        "\nfeature=" + getExteriorFeatures()+"\n"
        + getInteriorFeatures()+"\n"+
        "\n carAxle=" + carAxle +
        '}';
  }
}
