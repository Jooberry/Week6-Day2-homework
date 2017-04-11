import java.util.HashMap;
import java.util.*;

public class Photographer {

  private ArrayList<Printable> collection;
  private HashMap<String, Integer> journal;

  public Photographer() {
    this.collection = new ArrayList<Printable>();
    this.journal = new HashMap<String, Integer>();
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

  public int journalCount() {
    return journal.size();
  }

  public void addPhoto(String date, Integer photo) {
    journal.put(date, photo);
  }

}