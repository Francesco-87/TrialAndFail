package pong;

import javax.swing.*;

public class GUI {

    public GUI() {

        VAR.jf1 = new JFrame();
        VAR.jf1.setSize(VAR.WIDTH, VAR.HEIGTH);
        VAR.jf1.setTitle("Welcome to Pong");
        VAR.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VAR.jf1.setLayout(null);
        VAR.jf1.setResizable(false);
        VAR.jf1.setVisible(true);
        VAR.jf1.setLocationRelativeTo(null);
        VAR.jf1.addKeyListener(new KeyHandler());
        VAR.jf1.requestFocus();

        Draw lbldraw = new Draw();
        lbldraw.setBounds(0,0,VAR.WIDTH, VAR.HEIGTH);
        lbldraw.setVisible(true);
        VAR.jf1.add(lbldraw);

    }
}
