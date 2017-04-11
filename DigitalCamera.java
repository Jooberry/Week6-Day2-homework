public class DigitalCamera extends Camera implements Printable{

  String operatingSystem;

  public DigitalCamera(String name, String feature1, String feature2, String operatingSystem){
    super(name, feature1, feature2);
    this.operatingSystem = operatingSystem;
  }

  public String cameraDetails() {
    return "Name: " + name + ", " +  "Features: " + feature1 + ", " + feature2 + ", " + "Operating system: " + operatingSystem;  
  }
  
}