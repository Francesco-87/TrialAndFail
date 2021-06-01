package pong;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {

protected void paintComponent(Graphics g){

    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g;

    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    g.setColor(Color.BLACK);
    g.fillRect(0,0, VAR.WIDTH, VAR.HEIGTH);

    g.setColor(Color.WHITE);

    for(int i = 0; i <= 30; i++){
        g.fillRect(VAR.WIDTH/2 -10, i *20, 10, 10 );
    }

    g.fillRect(VAR.x, VAR.y, 25,150);
    g.fillRect(VAR.gegnerx, VAR.gegnery, 25,150);

    g.drawString("" + VAR.playerPoints, VAR.WIDTH/2 - 95, 20);
    g.drawString("" + VAR.gegnerPoints, VAR.WIDTH/2 + 85, 20);

    g.fillRect(VAR.ballx, VAR.bally, 20, 20);


    repaint();



}

}
