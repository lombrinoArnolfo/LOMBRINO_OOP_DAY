import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CalculatorGUI extends JFrame implements ActionListener{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField displayField;
    private Calculator calculator;

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorGUI calculatorGUI = new CalculatorGUI();
            calculatorGUI.setVisible(true);
            }
        });
       
    }
    
}
 public CalculatorGUI() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        calculator = new Calculator();

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {"7", "8", "9", "/",
                                 "4", "5", "6", "*",
                                 "1", "2", "3", "-",
                                 "C", "0", "=", "+"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        displayField = new JTextField();
        displayField.setEditable(false);

        add(displayField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "C":
                displayField.setText("");
                break;
            case "=":

                String input = displayField.getText();
                String[] parts = input.split("\\+|-|\\*|/"); 
                if (parts.length == 2) {
                    double operand1 = Double.parseDouble(parts[0]);
                    double operand2 = Double.parseDouble(parts[1]);
                    char operator = input.charAt(parts[0].length());

                    calculator.setOperand1(operand1);
                    calculator.setOperand2(operand2);
                    calculator.setOperator(operator);

                    double result = calculator.calculate();
                    displayField.setText(String.valueOf(result));
                } else {
                    displayField.setText("Invalid input");
                }
                break;
            default:
                displayField.setText(displayField.getText() + actionCommand);
                break;
        	}
    	}