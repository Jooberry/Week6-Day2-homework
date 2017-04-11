import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  AnalogCamera analogCamera;
  DigitalCamera digitalCamera;
  Printable printable;

  @Before
  public void before(){
    photographer = new Photographer();
    analogCamera = new AnalogCamera("Nikon 34T", "Noise reduction filter", "Hi-resolution", "AnalogShake");
    digitalCamera = new DigitalCamera("Sony ILCE5100L", "No Noise Reduction", "Lo-resolution", "Android");
  }

  @Test
  public void collectionStartsEmpty(){
    assertEquals(0, photographer.collectionCount());
  }

  @Test
  public void canAddCamera(){
    photographer.addCamera(printable);
    assertEquals(1, photographer.collectionCount());
  }

  @Test
  public void canRemoveCamera(){
    photographer.addCamera(printable);
    photographer.removeCamera();
    assertEquals(0, photographer.collectionCount());
  }

  @Test
  public void printOutAllCameraDetails(){
    photographer.addCamera(analogCamera);
    photographer.addCamera(digitalCamera);
    assertEquals( "Name: Nikon 34T, Features: Noise reduction filter, Hi-resolution, AnalogShake|Name: Sony ILCE5100L, Features: No Noise Reduction, Lo-resolution, Operating system: Android|", photographer.printOutAllCameraDetails());
  }

}