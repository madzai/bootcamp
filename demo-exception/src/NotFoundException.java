public class NotFoundException extends BusinessRuntimeException {
  public NotFoundException(SysCode sysCode) {
    super(sysCode);
  }
}
