package de.test.visitor;

import de.test.visitor.order.Order;

public interface Visitor {

  public void visit(Order order);

}
