public class AnalogCamera extends Camera implements Printable{
  
  String feature3;

  public AnalogCamera(String name, String feature1, String feature2, String feature3){
    super(name, feature1, feature2);
    this.feature3 = feature3;
  }

  public String cameraDetails() {
    return "Name: " + name + ", " +  "Features: " + feature1 + ", " + feature2+ ", " + feature3;  
  }
  
}