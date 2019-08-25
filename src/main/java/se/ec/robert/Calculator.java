package se.ec.robert;

import java.util.InputMismatchException;

public class Calculator {
  private Addition addition;
  private Subtraction subtraction;
  private Multiplication multiplication;
  private Division division;

  public Calculator() {
    subtraction = new Subtraction();
    addition = new Addition();
    multiplication = new Multiplication();
    division = new Division();
  }


  double makeCalculation(double num1, double num2, char operation) {
    double result = 0;

    switch(operation) {
      case '+':
        result = addition.calculateResult(num1, num2);
        break;
      case '-':
        result = subtraction.calculateResult(num1, num2);
        break;
      case '*':
        result = multiplication.calculateResult(num1, num2);
        break;
      case '/':
        result = division.calculateResult(num1, num2);
        break;
      default:
        result = new Noop().calculateResult(num1, num2);
    }

    return result;
  }
}

interface Operation {
  double calculateResult(double num1, double num2);
}

class Addition implements Operation {
  @Override
  public double calculateResult(double num1, double num2) {
    return num1 + num2;
  }
}

class Subtraction implements Operation {
  @Override
  public double calculateResult(double num1, double num2) {
    return num1 - num2;
  }
}

class Division implements Operation {
  @Override
  public double calculateResult(double num1, double num2) {
    return num1 / num2;
  }
}

class Multiplication implements Operation {
  @Override
  public double calculateResult(double num1, double num2) {
    return num1 * num2;
  }
}

class Noop implements Operation {
  @Override
  public double calculateResult(double num1, double num2) {
    throw new InputMismatchException("That's an invalid operator, bub.");
  }
}