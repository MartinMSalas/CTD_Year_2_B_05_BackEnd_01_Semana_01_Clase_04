package src.clase04.parte02;

public class Item {

  private String name;
  private int lot;
  private int weight;
  private String packaging; // Excellent, good, bad

  public Item(String name, int lot, int weight, String packaging) {
    this.name = name;
    this.lot = lot;
    this.weight = weight;
    this.packaging = packaging;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLot() {
    return lot;
  }

  public void setLot(int lot) {
    this.lot = lot;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getPackaging() {
    return packaging;
  }

  public void setPackaging(String packaging) {
    this.packaging = packaging;
  }
}
