package src.clase04.parte01;

public class PresidentGovernmentEmployee extends GovernmentEmployee {
  @Override
  public boolean processDocument(Document doc) {
    boolean result = false;
    if(doc.getType()<=3){
      System.out.println("President read the document");
      result = true;
    }

    return true;
  }
}
