package src.clase04.parte02;

import src.clase04.parte02.test.QualityAnalist;

public class WeightQualityAnalist extends QualityAnalist {
  @Override
  public boolean qualityCheck(Item item) {
    boolean result = false;
    if (item.getWeight()>=1200 && item.getWeight()<=1300){
      result = this.getNextQualityAnalist().qualityCheck(item);
    }
    return result;
  }
}
