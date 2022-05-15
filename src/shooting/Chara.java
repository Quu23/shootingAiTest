package shooting;

import java.util.ArrayList;
import java.util.List;

public class Chara extends Objects{
    List<Bullet> bullets;
    int hp;
    
    Chara(){
        bullets=new ArrayList<>();
    }
    public void moveBullets(Chara c){
        for(int i=0;i<bullets.size();i++){
            bullets.get(i).move(bullets.get(i).getX()+1, bullets.get(i).getY());
            if(bullets.get(i).x>505||bullets.get(i).x<-5||bullets.get(i).y>505||bullets.get(i).y<-5){
                bullets.remove(i);
                c.hp--;
                i--;
                continue;
            }
        }
    }
    public void move(int x,int y){
        if(this.x>-5&&this.x<505){
            this.x=x;
        }
        if(this.y>-5&&this.y<505){
            this.y=y;
        }
    }

}
