import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Toggle implements ItemListener {
    static JLabel text;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Toggle Button");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        Toggle obj = new Toggle();

        JToggleButton button = new JToggleButton("Toggle");
        button.setBounds(120, 50, 150, 50);
        button.addItemListener(obj);
        frame.add(button);

        text = new JLabel("Click the Toggle Button");
        text.setBounds(100, 150, 250, 30);
        frame.add(text);

        frame.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED)
            text.setText("Status: SELECTED");
        else
            text.setText("Status: DESELECTED");
    }
}
