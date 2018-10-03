public class VehicleFrame implements Chassis {

  @Override
  public Chassis getChassisType() {
    return this;
  }

  @Override
  public void setChassisType(String vehicleChassis) {

  }

  String vehicleFrameType;

  public String getVehicleFrameType() {
    return vehicleFrameType;
  }

  public void setVehicleFrameType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public String toString() {
    return "Chassis      :"+VehicleFrame.chassis+"\n"
          +"Vehicle      :"+vehicleFrameType;
//    return "VehicleFrame{" +
//        "vehicleFrameType='" + vehicleFrameType + '\'' +
//        '}';
  }

  VehicleFrame(){
    vehicleFrameType= "Unibody";

  }
  VehicleFrame(String vehicleFrameType){
    this.vehicleFrameType= "Unibody";
  }


}
