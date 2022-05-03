package taks;

import java.awt.*;

public class NewFrame extends Frame {
    TextArea ta;

    public NewFrame(String title) {
        super(title);
        setSize(300, 200);
    }

    public static void main(String[] args) {
        NewFrame nf = new NewFrame("Контрольная работа № 2");
        nf.setVisible(true);
    }
}