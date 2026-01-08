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
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Account {
  double balance;
  Currency currency;
  Type type;

  public static enum Currency {
    HKD, USD, CNY, JPY, AUD,;
  }

  public static enum Type {
    CURRENT, SAVING, INVESTMENT,;
  }

  public static void main(String[] args) {
    Account a1 = new Account(40000, Currency.USD, Type.SAVING);
    System.out.println(a1);

    a1.setBalance(100000);
    a1.setCurrency(Currency.HKD);
    a1.setType(Type.INVESTMENT);
    System.out.println(a1);

    Account a2 = new Account(2000, Currency.JPY, Type.CURRENT);
    Account a3 = new Account(2000, Currency.JPY, Type.CURRENT);
    System.out.println(a2);
    System.out.println(a2.equals(a1));
    System.out.println(a2.equals(a3));
    System.out.println(a2.hashCode() == a1.hashCode());
    System.out.println(a2.hashCode() == a3.hashCode());
  }
}
