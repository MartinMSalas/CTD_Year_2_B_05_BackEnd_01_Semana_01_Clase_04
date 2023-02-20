package src.clase04.parte02.test;

import src.clase04.parte02.Item;

public abstract class QualityAnalist {
  private QualityAnalist nextQualityAnalist;

  public QualityAnalist getNextQualityAnalist() {
    return nextQualityAnalist;
  }

  public void setNextQualityAnalist(QualityAnalist nextQualityAnalist) {
    this.nextQualityAnalist = nextQualityAnalist;
  }

  public abstract boolean qualityCheck(Item item);
}
