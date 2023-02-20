package src.clase04.parte01;

public abstract class GovernmentEmployee {
  private GovernmentEmployee nextEmployee;
  private int securityLevel;

  public abstract boolean processDocument(Document doc);

  public GovernmentEmployee getNextEmployee() {
    return nextEmployee;
  }

  public void setNextEmployee(GovernmentEmployee nextEmployee) {
    this.nextEmployee = nextEmployee;
  }

  public int getSecurityLevel() {
    return securityLevel;
  }

  public void setSecurityLevel(int securityLevel) {
    this.securityLevel = securityLevel;
  }
}
