import java.util.*;

public class Photographer {

  private ArrayList<Camera> collection;

  public Photographer() {
    this.collection = new ArrayList<Camera>();
  }

  public int collectionCount(){
    return collection.size();
  }

  public void addToCollection(Camera camera) {
    collection.add(camera);
  }

}