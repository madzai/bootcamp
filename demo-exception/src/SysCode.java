public enum SysCode {
  NULL_PARAM(10000, "Parameter cannot be NULL"), //
  NOT_FOUND(10001, "Not Found."), //
  CONNECT_FAIL(10002, "Connection Fail."), //
  ;

  private String message;
  private int code;

  private SysCode(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public int getCode() {
    return this.code;
  }
}
