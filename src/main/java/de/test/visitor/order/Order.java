package de.test.visitor.order;

import java.math.BigDecimal;

import de.test.visitor.OrderVisitor;

public class Order {

  private BigDecimal shippingOneItem = new BigDecimal("3.50");
  private int amount;

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public BigDecimal getShippingCosts() {
    return new BigDecimal(amount).multiply(shippingOneItem);
  }

  public void accept(OrderVisitor visitor) {
    visitor.visit(this);
  }
}
