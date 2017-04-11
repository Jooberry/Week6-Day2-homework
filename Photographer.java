import java.util.*;

public class Photographer {

  private ArrayList<Printable> collection;

  public Photographer() {
    this.collection = new ArrayList<Printable>();
  }

  public int collectionCount(){
    return collection.size();
  }

  public void addCamera(Printable printable) {
    collection.add(printable);
  }

  public void removeCamera() {
    collection.remove(0);
  }

  public String printOutAllCameraDetails() {
    String list = "";
    for(Printable printable : this.collection){
      list += printable.cameraDetails() + "|";
    }
    return list;
  }

}