package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
public class Board extends Application {
    private static final int BOARD_WIDTH = 933;
    private static final int BOARD_HEIGHT = 700;
   private Group root =new Group();
    // FIXME Task 7: Implement a basic playable Steps Game in JavaFX that only allows pieces to be placed in valid places


    // FIXME Task 8: Implement starting placements

    // FIXME Task 10: Implement hints

    // FIXME Task 11: Generate interesting starting placements

    @Override
    public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("IQ game");
    Scene scene= new Scene(root,BOARD_WIDTH,BOARD_WIDTH);
    primaryStage.setScene(scene);
    primaryStage.show();
    }
}
