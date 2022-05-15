package shooting;

import ai.Ai;

public class Player extends Chara{
    Ai ai=null;

    Player(int x,int y){
        this.x=x;
        this.y=y;
        this.hp=1;
        this.width=5;
    }
    Player(int x,int y,Ai ai){
        this.x=x;
        this.y=y;
        this.ai=ai;
        this.hp=1;
        this.width=5;
    }
}
