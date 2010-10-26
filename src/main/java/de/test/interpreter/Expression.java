package de.test.interpreter;

import java.util.HashMap;

public interface Expression {

  public int interpret(HashMap<String, Expression> variables);

}
