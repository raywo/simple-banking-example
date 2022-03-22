package de.datev.schulung.oo.domain.customers;

import java.util.Date;

public class Customer {
  private String name;
  private Date dayOfBirth;


  public Customer(String name) {
    this.name = name;
  }


  public Customer(String name, Date dayOfBirth) {
    this.name = name;
    this.dayOfBirth = dayOfBirth;
  }


  public String getName() {
    return this.name;
  }

  public Date getDayOfBirth() {
    return this.dayOfBirth;
  }


  public void setName(String name) {
    this.name = name;
  }


  public void setDayOfBirth(Date dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
  }


  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("de.datev.schulung.oo.domain.customers.Customer{");
    sb.append("name='").append(name).append('\'');
    sb.append(", dayOfBirth=").append(dayOfBirth);
    sb.append('}');
    return sb.toString();
  }
}
