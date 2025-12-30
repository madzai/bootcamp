public enum SysCode {
  NULL_PARAM(10000, "Parameter cannot be NULL"), //
  USERNAME_NOT_FOUND(10001, "Username Not Found."), //
  CONNECT_FAIL(10002, "Connection Fail."), //
  ;

  // public static enum NotFound {
  // USERNAME,;
  // }

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
