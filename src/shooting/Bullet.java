package shooting;

public class Bullet extends Objects{
    Bullet(int x,int y){
        this.setX(x);
        this.setY(y);
    }    
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void move(int x,int y){
        this.setX(x);
        this.setY(y);
    }
}
