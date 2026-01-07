public class Address {
  private String line1;
  private String line2;

  public Address(String line1, String line2) {
    this.line1 = line1;
    this.line2 = line2;
  }

  public String getLine1() {
    return this.line1;
  }

  public String getLine2() {
    return this.line2;
  }

  @Override
  public String toString() {
    return "Address(" //
        + "line1=" + this.line1 //
        + ",line2=" + this.line2 //
        + ")";
  }
}
