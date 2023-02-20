package src.clase04.parte02.test;

import src.clase04.parte02.Item;

public class LotQualityAnalist extends QualityAnalist {

  @Override
  public boolean qualityCheck(Item item) {
    boolean result = false;
    if (item.getLot()>=1000 && item.getLot()<=2000){
      result = this.getNextQualityAnalist().qualityCheck(item);
    }
    return result;
  }
}
