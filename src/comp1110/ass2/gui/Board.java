package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Group;
public class Board extends Application {
    private static final int BOARD_WIDTH = 933;
    private static final int BOARD_HEIGHT = 700;
    private static final int SQUARE_SIZE = 60;
    private static final int PIECE_IMAGE_SIZE = (int) ((3 * SQUARE_SIZE) * 1.33);
   private Group root =new Group();
    // FIXME Task 7: Implement a basic playable Steps Game in JavaFX that only allows pieces to be placed in valid places
    // Authorship details: Task7 is written by Yiwen Peng (u6071714).

    class Piece extends ImageView {
        Piece(char a1, char a2){
//            char[] string =a.toCharArray();
            if(!(a1>='A'&&a1<='H')){
                throw new IllegalArgumentException("no this picture");
            }else if (a2=='A'||a2=='E'){
                setImage(new Image((getClass().getResource("URI_BASE" + a1+a2 + ".png").toString())));
            }
            else {           throw new IllegalArgumentException("no this picture");
            }  setFitHeight(PIECE_IMAGE_SIZE);
            setFitWidth(PIECE_IMAGE_SIZE);
        }

        Piece(char a1,char a2,char pos){
            this(a1,a2);

            if(pos<'A'||pos>'Y'||pos<'a'||pos>'y'){
                throw new IllegalArgumentException("not the right postion");
            }
            int x = pos-'A';
            int y = pos -'A';
            setLayoutX(x);
            setLayoutY(y);
        }
    }

    // FIXME Task 8: Implement starting placements

    // FIXME Task 10: Implement hints

    // FIXME Task 11: Generate interesting starting placements

    @Override
    public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("IQ game");
    Scene scene= new Scene(root,BOARD_WIDTH,BOARD_HEIGHT);

    primaryStage.setScene(scene);
    primaryStage.show();
    }
}
