package taks;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calculator extends Frame implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    // constructor
    Calculator() {
        // adding WindowListener to frame
        addWindowListener(this);

        // setting the size, layout and visibility of frame
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    //главный метод
    public static void main(String[] args) {
        new Calculator();
    }
}
