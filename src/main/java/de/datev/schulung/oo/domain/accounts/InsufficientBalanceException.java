package de.datev.schulung.oo.domain.accounts;

public class InsufficientBalanceException extends Exception {
  public InsufficientBalanceException(String message) {
    super(message);
  }
}
