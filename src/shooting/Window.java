package shooting;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Window extends Application{

    GraphicsContext g ;
    static Player player;
    static Enemy enemy;

    @Override
    public void start(Stage stage) throws Exception {
        Group root =  new Group();

        Canvas canvas = new Canvas(500,500);
        g=canvas.getGraphicsContext2D();

        root.getChildren().add(canvas);

        stage.setTitle("Shooting");
        Scene scene = new Scene(root,500,500,Color.WHITE);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    public static void run(String[] args,Player p,Enemy e){
        player=p;
        enemy =e;
        launch(args);
    }
}
