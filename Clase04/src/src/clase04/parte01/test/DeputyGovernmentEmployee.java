package src.clase04.parte01.test;

import src.clase04.parte01.Document;
import src.clase04.parte01.GovernmentEmployee;

public class DeputyGovernmentEmployee extends GovernmentEmployee {
  public DeputyGovernmentEmployee() {
    super();
  }

  @Override
  public boolean processDocument(Document doc) {
    boolean result = false;
    if (doc.getType() == 1){
      System.out.println("Deputy read the document");
      result = true;
    }
    result = this.getNextEmployee().processDocument(doc);

    return result;
  }
}
