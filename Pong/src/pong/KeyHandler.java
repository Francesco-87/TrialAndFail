package pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_W){
            VAR.moveup = true;
        }
        else if(e.getKeyCode() == KeyEvent.VK_S){
            VAR.movedown = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_W){
            VAR.moveup = false;
        }
        else if(e.getKeyCode() == KeyEvent.VK_S){
            VAR.movedown = false;
        }
    }
}
