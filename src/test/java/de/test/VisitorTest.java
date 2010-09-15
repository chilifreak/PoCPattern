package de.test;

import java.math.BigDecimal;

import org.junit.Test;

import de.test.visitor.OrderVisitor;
import de.test.visitor.order.Order;

import static junit.framework.Assert.*;

public class VisitorTest {

  @Test
  public void calculateShippingCost() {
    // create order
    Order order = new Order();
    order.setAmount(10);

    assertEquals("Got wrong order shippingCosts", new BigDecimal("35.00"), order.getShippingCosts());

    // create visitor
    OrderVisitor visitor = new OrderVisitor();

    // visit
    order.accept(visitor);

    BigDecimal shippingCosts = visitor.getOverseaShippingCost();

    assertEquals("Got wrong shipping costs", new BigDecimal("45.50"), shippingCosts);

  }
}
