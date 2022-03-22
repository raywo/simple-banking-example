package de.datev.schulung.oo.domain.accounts;

import de.datev.schulung.oo.domain.customers.Customer;

public class Account {
  private final String iban;
  private double balance;
  private Customer owner;


  public Account(String iban, Customer owner) {
    this.iban = iban;
    this.owner = owner;
    this.balance = 0;
  }


  public void deposit(double amount) throws AmountNotAllowedException {
    validateAmount(amount);

    this.balance = this.balance + amount;
  }


  public void withdraw(double amount) throws AmountNotAllowedException, InsufficientBalanceException {
    validateAmount(amount);

    if (amount > this.balance) {
      throw new InsufficientBalanceException("Der Betrag ist zu hoch!");
    }

    this.balance -= amount;
  }


  public void setOwner(Customer owner) {
    this.owner = owner;
  }


  public String getIban() {
    return iban;
  }


  public double getBalance() {
    return balance;
  }


  public Customer getOwner() {
    return owner;
  }


  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("de.datev.schulung.oo.domain.accounts.Account{");
    sb.append("iban='").append(iban).append('\'');
    sb.append(", balance=").append(balance);
    sb.append(", owner=").append(owner);
    sb.append('}');
    return sb.toString();
  }


  private void validateAmount(double amount) throws AmountNotAllowedException {
    if (amount <= 0) {
      throw new AmountNotAllowedException("Der Betrag darf nicht negativ sein!");
    }
  }
}
