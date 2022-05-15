package shooting;

public class Objects {
    int x;
    int y;
    int width;
    public boolean isHitObj(Objects o) {
        if(this.x*this.x+o.x*o.x < (this.width+o.width)*(this.width+o.width)){
            return true;
        } 
        return false;
    }
}
