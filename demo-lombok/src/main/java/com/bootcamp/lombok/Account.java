package com.bootcamp.lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// balance
// Currency
// type (current, saving, etc)
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@Setter
@NoArgsConstructor
@ToString
public class Account {
  double balance;
  Currency currency;
  Type type;

  @Getter
  public static enum Currency {
    HKD, USD, CNY, JPY, AUD,;
  }

  @Getter
  public static enum Type {
    CURRENT, SAVING, INVESTMENT,;
  }

  public static void main(String[] args) {
    // Test case 1
    Account a1 = new Account(40000, Currency.USD, Type.SAVING);
    System.out.println(a1);
    // Expected value
    double expectedBalance = 40000;
    Currency expectedCurrency = Currency.USD;
    Type expectedType = Type.SAVING;
    // Actual value
    double actualBalance = a1.getBalance();
    Currency actualCurrency = a1.getCurrency();
    Type actualType = a1.getType();
    System.out.println("Test for constructor");
    System.out.println(expectedBalance == actualBalance); // true
    System.out.println(expectedCurrency == actualCurrency); // true
    System.out.println(expectedType == actualType); // true


    // Setter
    System.out.println("Test for setter");
    a1.setBalance(100.0);
    System.out.println(100.0 == a1.getBalance());
    System.out.println(Currency.USD == a1.getCurrency());
    System.out.println(Type.SAVING == a1.getType());

    a1.setCurrency(Currency.HKD);
    a1.setType(Type.INVESTMENT);
    System.out.println(100.0 == a1.getBalance());
    System.out.println(Currency.HKD == a1.getCurrency());
    System.out.println(Type.INVESTMENT == a1.getType());

    // Equal
    System.out.println("Test for equals & hashCode");
    Account a2 = new Account(2000, Currency.JPY, Type.CURRENT);
    Account a3 = new Account(2000, Currency.JPY, Type.CURRENT);
    System.out.println(a2);
    System.out.println(a2.equals(a3));
    System.out.println(a2.hashCode() == a3.hashCode());

    // System.out.println(a2.equals(a3));
    // System.out.println(a2.hashCode() == a1.hashCode());
    // System.out.println(a2.hashCode() == a3.hashCode());
  }
}
