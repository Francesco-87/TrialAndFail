package pong;

import java.util.Timer;
import java.util.TimerTask;

public class BallMovment {
    Timer move;


    public BallMovment() {

        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                VAR.ballx += VAR.ballVelx;
                VAR.bally += VAR.ballVely;

            }
        },0, 4);
    }
}
