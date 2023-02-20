package src.clase04.parte02.test;

import src.clase04.parte02.Item;

public class ContainerQualityAnalist extends QualityAnalist {
  @Override
  public boolean qualityCheck(Item item) {
    boolean result = false;
    if (item.getPackaging().equals("excellent") || item.getPackaging().equals("good")){
      result = true;
    }
    return result;

  }
}
