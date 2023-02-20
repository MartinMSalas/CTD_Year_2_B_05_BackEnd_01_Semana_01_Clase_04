package src.clase04.parte01;

public class MinisterGovernmentEmployee extends GovernmentEmployee {
  @Override
  public boolean processDocument(Document doc) {
    boolean result = false;
    if ( doc.getType() <= 2){
      System.out.println("Minister read the document");
      result = true;
    }
    result = this.getNextEmployee().processDocument(doc);
    return result;
  }
}
