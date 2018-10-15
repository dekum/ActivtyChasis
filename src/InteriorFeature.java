public class InteriorFeature implements Feature {
  String interiorFeature;
  InteriorFeature(){
    interiorFeature = "generic";
    }

    InteriorFeature(String interiorFeature){
    this.interiorFeature = interiorFeature;

    }

  public String getInteriorFeature() {
    return interiorFeature;
  }

  public void setInteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }


  @Override
  public String toString() {
    return
        "Interior  " +"["+ interiorFeature +"]";
  }

  public static void main(String[] args) {
    InteriorFeature IF = new InteriorFeature();
    System.out.println(IF.toString());
    InteriorFeature IF2 = new InteriorFeature("Climate Control");
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


