package taks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Outer implements ActionListener {
    AEvent2 obj;

    Outer(AEvent2 obj) {
        this.obj = obj;
    }

    public void actionPerformed(ActionEvent e) {
        obj.tf.setText("welcome");
    }
}
