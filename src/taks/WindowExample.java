package taks;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// class which inherits the Frame class
public class WindowExample extends Frame {
    // class constructor
    WindowExample() {
        // adding WindowListener to the Frame
        // and using the windowClosing() method of WindowAdapter class
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        // setting the size, layout and visibility of frame
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    // main method
    public static void main(String[] args) {
        new WindowExample();
    }
}