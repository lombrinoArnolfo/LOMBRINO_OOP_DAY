
package calculator;

public class Calculator {
  private double operand1;
    private double operand2;
    private char operator;

    public Calculator() {
        operand1 = 0;
        operand2 = 0;
        operator = ' ';
    
    
        
    }
      public void setOperand1(double operand) {
        operand1 = operand;
    }

    public void setOperand2(double operand) {
        operand2 = operand;
    }

    public void setOperator(char op) {
        operator = op;
    }
      public double calculate() {
        double result = 0;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        return result;
    }
} 

 