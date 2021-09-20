package chatbot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    private JTextArea jta = new JTextArea();
    private JTextField jtf = new JTextField();

    public Frame() throws HeadlessException {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(300, 200, 600, 500);
        frame.setVisible(true);
        frame.setTitle("ChatBot");
        frame.setLayout(null);
        frame.add(jta);
        frame.add(jtf);
        // for jta
        jta.setSize(frame.getWidth()-20, frame.getHeight()/2);
        jta.setVisible(true);
        jta.setBackground(Color.lightGray);

        // for jtf
        jtf.setBounds(0, 300, frame.getWidth()-20, 100);
        jtf.setVisible(true);
        jtf.setBackground(Color.gray);
        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String gtxt = jtf.getText();
                jta.append("You ->" + gtxt);
                jtf.setText("");
            }
        });







    }
}
