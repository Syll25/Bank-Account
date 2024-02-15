package syll25.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

  @Test
  public void depositsFunds() {
    //given
    BankAccount bankAccount = new BankAccount(3, 4);

    bankAccount.depositFunds(8);
    assertEquals(12, bankAccount.checkSaldo());

    bankAccount.depositFunds(-12);
    assertEquals(-8, bankAccount.checkSaldo());


  }

  @Test
  public void depositsFundsWHenAccountIsEmpty() {
    //given
    BankAccount bankAccount = new BankAccount(3, 0);

    bankAccount.depositFunds(8);
    assertEquals(8, bankAccount.checkSaldo());


  }

  @Test
  public void depositsFundsWHenAccountIsEmpty() {
    //given
    BankAccount bankAccount = new BankAccount(3, 0);

    bankAccount.depositFunds(8);
    assertEquals(8, bankAccount.checkSaldo());


  }

  void fun() {

  }
}
