package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Cursor;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.Node;

import java.nio.file.attribute.GroupPrincipal;

public class Board extends Application {
    // the canves size
    private static final int BOARD_WIDTH = 933;
    private static final int BOARD_HEIGHT = 700;
    // the board
    private static final int START_X=50;
    private static final int START_Y=200;
    private static final int SPACE=50;
    private static final int r =18;
    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    // FIXME Task 7: Implement a basic playable Steps Game in JavaFX that only allows pieces to be placed in valid places
    private void makeBoard(){
        for (int row =0;row<5;row++){
            for (int col=0;col<5;col++){
                double x;
                if (row%2==0){
                    x=START_X*(col+1)+SPACE*col;
                }else{
                    x =START_X+SPACE*(1+col)+START_X*(col+1);
                }
                double y =START_Y+SPACE*row;
                //start at (50,200);
                Circle circle = new Circle(x, y, r);
                circle.setFill(Color.GRAY);
                root.getChildren().add(circle);
            }
        }

    }

        // FIXME Task 8: Implement starting placements

        // FIXME Task 10: Implement hints

        // FIXME Task 11: Generate interesting starting placements

        @Override
        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("IQ game");
            Scene scene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);
            ImageView bg = new ImageView(new Image((getClass().getResource(URI_BASE + "locations" + ".png").toString())));
            bg.setFitHeight(600);
            bg.setFitWidth(800);
//
            for (char z = 'A'; z <= 'H'; z++) {
                DraggableImageView img = new DraggableImageView(new Image((getClass().getResource(URI_BASE + z+ "A.png").toString())));
                img.setX(0);
                img.setY(0);
                img.setFitWidth(200);
                img.setFitHeight(200);

                root.getChildren().add(img);

            }
            makeBoard();

//        root.getChildren().add(bg);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
public static void main(String[] args){
            launch(args);
}
}

