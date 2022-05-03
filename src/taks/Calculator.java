package taks;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/***
 * Разработать приложение, реализующее калькулятор. Приложение должно иметь три строки редактирования
 * (TextField) – для двух операндов и результата.
 * Набор флажков (CheckboxGroup) определяет, какое арифметическое действие необходимо выполнить: суммирование,
 * вычитание, деление, умножение, очистку окон редактирования.
 */
public class Calculator extends Frame {

    // constructor
    Calculator() {
        // создаем фрейм окна
        Frame frame = new Frame("Контрольная работа № 2");
//        добавляем WindowListener для закрытия фрейма
//        frame.addWindowListener(new MyWindowListener());
        // устанавливаем размер, лэйаут и видимость фрейма
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        //добавляем 3 кнопки с лэйблом
        addLabelAndButton(frame, "Операнд1", 50);
        addLabelAndButton(frame, "Операнд2", 100);
        TextField resultTextField = addLabelAndButton(frame, "Результат", 150);

        //добавляем чекбоксы
        Checkbox checkbox1 = new Checkbox("+");
        checkbox1.setBounds(50, 200, 50, 50);
        frame.add(checkbox1);

        Checkbox checkbox2 = new Checkbox("-");
        checkbox2.setBounds(100, 200, 50, 50);
        frame.add(checkbox2);

        Checkbox checkbox3 = new Checkbox("*");
        checkbox3.setBounds(150, 200, 50, 50);
        frame.add(checkbox3);

        Checkbox checkbox4 = new Checkbox("/");
        checkbox4.setBounds(200, 200, 50, 50);
        frame.add(checkbox4);

        Button button = new Button("Вычислить");
        button.setBounds(50, 250, 100, 30);
        frame.add(button);
        button.addActionListener(e -> resultTextField.setText("result"));
    }

    private static TextField addLabelAndButton(Frame frame, String labelName, int y) {
        Label label = new Label(labelName);
        TextField textField = new TextField();
        label.setBounds(50, y, 100, 30);
        textField.setBounds(150, y, 100, 30);
        frame.add(label);
        frame.add(textField);
        return textField;
    }

    class MyWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            dispose();
            System.exit(0);
        }
    }

    //главный метод
    public static void main(String[] args) {
        new Calculator();
    }
}
