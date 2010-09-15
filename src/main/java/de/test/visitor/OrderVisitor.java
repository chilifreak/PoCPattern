package de.test.visitor;

import java.math.BigDecimal;

import de.test.visitor.order.Order;

public class OrderVisitor
  implements Visitor {

  private BigDecimal overseaShippingCost;

  public BigDecimal getOverseaShippingCost() {
    return overseaShippingCost;
  }

  public void setOverseaShippingCost(BigDecimal overseaShippingCost) {
    this.overseaShippingCost = overseaShippingCost;
  }

  @Override
  public void visit(Order order) {
    overseaShippingCost = order.getShippingCosts().add(new BigDecimal("10.5"));
  }

}
