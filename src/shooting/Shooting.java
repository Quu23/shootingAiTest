package shooting;

public class Shooting {

    public static void main(String[] args) {
        Player player = new Player(100, 200);
        Enemy enemy = new Enemy();
        Window.run(args,player,enemy);

    }
}
