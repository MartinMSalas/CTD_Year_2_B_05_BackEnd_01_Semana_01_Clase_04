package src.clase04.parte01;

public class Document {
  private int type;
  private String content;

  public Document(int type, String content) {
    this.type = type;
    this.content = content;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
