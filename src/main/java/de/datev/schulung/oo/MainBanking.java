package de.datev.schulung.oo;

import de.datev.schulung.oo.domain.accounts.Account;
import de.datev.schulung.oo.domain.accounts.AmountNotAllowedException;
import de.datev.schulung.oo.domain.customers.Customer;
import de.datev.schulung.oo.domain.accounts.InsufficientBalanceException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainBanking {
  public static void main(String[] args) {
    List<Customer> customerList = new ArrayList<>();
    List<Account> accountList = new ArrayList<>();

    Date dayOfBirth = null;
    Customer customer1 = new Customer("Ray");
    Customer customer2 = new Customer("Ralf", dayOfBirth);

    customerList.add(customer1);
    customerList.add(customer2);
    customerList.add(new Customer("Michael"));
    customerList.add(new Customer("Thomas"));

    for (Customer currentCustomer :customerList) {
      System.out.println(currentCustomer);
    }

    Account account1 = new Account("DE12546", customer1);
    Account account2 = new Account("DE98745", customer2);

    accountList.add(account1);
    accountList.add(account2);

    for (Account account : accountList) {
      System.out.println(account);
    }

    try {
      account1.deposit(34.56);
      System.out.println(account1);
      account1.withdraw(30.00);
      System.out.println(account1);

    } catch (AmountNotAllowedException | InsufficientBalanceException e) {
      System.out.println(e.getMessage());
    }

  }
}
