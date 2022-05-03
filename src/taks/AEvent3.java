package taks;

import java.awt.*;

class AEvent3 extends Frame {
    TextField testField;

    AEvent3() {
        testField = new TextField();
        testField.setBounds(60, 50, 170, 20);
        Button button = new Button("click me");
        button.setBounds(50, 120, 80, 30);

        button.addActionListener(e -> testField.setText("hello"));
        add(button);
        add(testField);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AEvent3();
    }
}
