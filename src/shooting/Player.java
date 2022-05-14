package shooting;

import ai.Ai;

public class Player {
    int x;
    int y;
    Ai ai=null;
    Bullet[] bullets;

    Player(int x,int y){
        this.x=x;
        this.y=y;
    }
    Player(int x,int y,Ai ai){
        this.x=x;
        this.y=y;
        this.ai=ai;
    }
}
