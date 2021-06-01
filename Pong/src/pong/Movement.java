package pong;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {

    Timer move;

    public Movement() {
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(VAR.moveup == true){

                    if(VAR.y >= 15){
                        VAR.y -=2;
                    }

                }
                else if(VAR.movedown == true){

                    if(VAR.y <= VAR.HEIGTH - 200){
                        VAR.y +=2;
                    }
                }


            }
        },0,6);
    }
}
