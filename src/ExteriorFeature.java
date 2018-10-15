public class ExteriorFeature implements Feature {
  String ExteriorFeature;
  ExteriorFeature(){
    ExteriorFeature = "generic";
  }

  ExteriorFeature(String ExteriorFeature){
    this.ExteriorFeature = ExteriorFeature;

  }

  public String getExteriorFeature() {
    return ExteriorFeature;
  }

  public void setExteriorFeature(String ExteriorFeature) {
    this.ExteriorFeature = ExteriorFeature;
  }


  @Override
  public String toString() {
    return
        "Exterior: " +"["+ ExteriorFeature +"]";
  }

  public static void main(String[] args) {
    ExteriorFeature IF = new ExteriorFeature();
    System.out.println(IF.toString());
    ExteriorFeature IF2 = new ExteriorFeature("Climate Control");
    System.out.println(IF2.toString());

  }

  @Override
  public String getFeature() {
    return null;
  }

  @Override
  public void setFeature(String feature) {

  }
}