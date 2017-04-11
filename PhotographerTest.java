import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  Camera camera;

  @Before
  public void before(){
    photographer = new Photographer();
    camera = new Camera();
  }

  @Test
  public void canAddCamera(){
    photographer.addToCollection(camera);
    assertEquals(1, photographer.collectionCount());
  }



}