public class AnalogCamera implements Printable{
  
  String name;
  String feature1;
  String feature2;

  public AnalogCamera(String name, String feature1, String feature2){
    this.name = name;
    this.feature1 = feature1;
    this.feature2 = feature2;
  }

  public String cameraDetails() {
    return name + feature1 + feature2;  
  }
  
}