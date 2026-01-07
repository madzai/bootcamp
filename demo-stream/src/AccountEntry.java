import java.math.BigDecimal;
import java.math.RoundingMode;

public record AccountEntry(Action action, Currency currency, double amount) {
  // private Action action;
  // private Currency currency;
  // private double amount;

  // public AccountEntry(Action action, Currency currency, double amount) {
  // this.action = action;
  // this.currency = currency;
  // this.amount = amount;
  // }

  // public Action getAction() {
  // return this.action;
  // }

  // public Currency getCurrency() {
  // return this.currency;
  // }

  // public double getAmount() {
  // return this.amount;
  // }

  public double amount(Currency currency) {
    if (currency == this.currency)
      return amount;
    if (currency == Currency.USD && this.currency == Currency.HKD)
      return BigDecimal.valueOf(this.amount) //
          .divide(BigDecimal.valueOf(7.85), 2, RoundingMode.HALF_UP) //
          .doubleValue();
    return amount; // TBC
  }

  // public void setAmount(double amount) {
  // this.amount = amount;
  // }

  // equals

  // hashCode

  // toString

  public static enum Action {
    DEBIT, CREDIT,;
  }

  public static enum Currency {
    HKD, USD, CNY,;
  }

  public static void main(String[] args) {
    AccountEntry a1 = new AccountEntry(Action.CREDIT, Currency.USD, 100);
    System.out.println(a1);

    // ! Getter
    System.out.println(a1.action());
    System.out.println(a1.currency());
    System.out.println(a1.amount());

    AccountEntry a2 = new AccountEntry(Action.DEBIT, Currency.HKD, 5000);
    System.out.println(a2);
    System.out.println(a2.amount(Currency.USD));

    // ! one constructor only
    // ! attribute is final -> no setter

  }
}
