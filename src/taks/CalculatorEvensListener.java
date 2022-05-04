package taks;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEvensListener implements ActionListener {
    Calculator calculator;

    CalculatorEvensListener(Calculator calculator) {
        this.calculator = calculator;
    }

    private Float extractFloatValue(final TextField textField) {
        try {
            return Float.valueOf(textField.getText());
        } catch (NumberFormatException e) {
            return (float) 0;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Float x = extractFloatValue(calculator.operand1);
        Float y = extractFloatValue(calculator.operand2);
        calculator.resultTextField.setText(String.valueOf(x + y));
    }
}
