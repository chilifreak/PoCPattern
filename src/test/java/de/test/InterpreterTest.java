package de.test;

import java.util.HashMap;

import org.junit.Test;

import de.test.interpreter.Evaluator;
import de.test.interpreter.Expression;
import de.test.interpreter.Number;

import static junit.framework.Assert.*;

public class InterpreterTest {

  @Test
  public void interpret() {
    String expression = "w x z - +";
    Evaluator sentence = new Evaluator(expression);
    HashMap<String, Expression> variables = new HashMap<String, Expression>();
    variables.put("w", new Number(5));
    variables.put("x", new Number(10));
    variables.put("z", new Number(42));
    int result = sentence.interpret(variables);
    assertEquals(-27, result);
  }

}
