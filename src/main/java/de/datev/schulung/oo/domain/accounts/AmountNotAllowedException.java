package de.datev.schulung.oo.domain.accounts;

public class AmountNotAllowedException extends Exception {
  public AmountNotAllowedException(String message) {
    super(message);
  }
}
