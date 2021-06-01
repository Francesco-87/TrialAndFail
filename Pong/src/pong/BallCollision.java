package pong;

import java.util.Timer;
import java.util.TimerTask;

public class BallCollision {
Timer collision;
    public BallCollision() {
        collision = new Timer();
        collision.scheduleAtFixedRate(new TimerTask() {


            @Override
            public void run() {

                if (VAR.bally +50 >= VAR.HEIGTH){
                    VAR.ballVely = -1;
                }
                if (VAR.bally <= 0){
                    VAR.ballVely = 1;
                }
                if(VAR.ballx +20 >= VAR.WIDTH){
                    VAR.ballx = VAR.WIDTH/2 -10;
                    VAR.bally = VAR.HEIGTH/2 -10;

                    VAR.ballVelx = -1;
                    VAR.playerPoints += 1;
                }

                if(VAR.ballx <= 0){
                    VAR.ballx = VAR.WIDTH/2 -10;
                    VAR.bally = VAR.HEIGTH/2 -10;

                    VAR.ballVelx = -1;
                    VAR.gegnerPoints += 1;
                }

                if(VAR.ballx < VAR.x +25 && VAR.ballx > VAR.x && VAR.bally -20 <= VAR.y +150 && VAR.bally > VAR.y){

                    VAR.ballVelx = 1;
                }
                if(VAR.ballx < VAR.gegnerx && VAR.ballx > VAR.gegnerx -20 && VAR.bally -20 <= VAR.gegnery +150 && VAR.bally > VAR.gegnery){

                    VAR.ballVelx = -1;
                }

            }
        },0, 4);
    }
}

