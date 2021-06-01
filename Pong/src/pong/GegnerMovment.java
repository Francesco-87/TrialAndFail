package pong;

import java.util.Timer;
import java.util.TimerTask;

public class GegnerMovment {
    Timer move;

    public GegnerMovment() {
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                    if(VAR.bally == VAR.gegnery) {
                    }
                    else if(VAR.bally > VAR.gegnery +75) {

                        if (VAR.gegnery <= VAR.HEIGTH - 200) {
                            VAR.gegnery += 2;

                        }
                    }
                else if(VAR.gegnery < VAR.gegnery +75){

                    if(VAR.gegnery >= 20){
                        VAR.gegnery -=2;
                    }
                }
        }
    },0,6);
}
    }

