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
    analogCamera = new AnalogCamera("Sony ILCE5100L", "No noise reduction", "Lo-resolution");
    digitalCamera = new DigitalCamera("Nikon 34T", "Noise Reduction Filter", "Hi-resolution");
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
    
  }

}