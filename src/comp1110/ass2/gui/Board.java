package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.Node;

import java.nio.file.attribute.GroupPrincipal;

public class Board extends Application {
    private static final int BOARD_WIDTH = 933;
    private static final int BOARD_HEIGHT = 700;
    private static final int SQUARE_SIZE = 60;
    private static final int PIECE_IMAGE_SIZE = (int) ((3 * SQUARE_SIZE) * 1.33);
   private Group root =new Group();
   private Group controls= new Group();
    // FIXME Task 7: Implement a basic playable Steps Game in JavaFX that only allows pieces to be placed in valid places
    // Authorship details: Task7 is written by Yiwen Peng (u6071714);


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
            // to find the  position and need to fix it
            int x = pos-'A';
            int y = pos -'A';
            int o= pos;
            setLayoutX(x);
            setLayoutY(y);
            setRotate(90*o);
        }
    }
    double mouseY,mouseX;
    class moveablePiece extends Piece{

        moveablePiece(char a1, char a2) {
            super(a1, a2);
            //enevt handlers
            setOnScroll(e->{
                hideCompletion();//hide the completion message
                rotate();
            });
            setOnMousePressed(e->{
                mouseX = e.getSceneX();
                mouseY = e.getSceneY();
            });

        }
        private void hideCompletion(){

        }
        private void rotate() {

            setRotate((getRotate()+90)%360);

        }

    }


    // FIXME Task 8: Implement starting placements

    // FIXME Task 10: Implement hints

    // FIXME Task 11: Generate interesting starting placements

    @Override
    public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("IQ game");
    Scene scene= new Scene(root,BOARD_WIDTH,BOARD_HEIGHT);
ImageView img=new ImageView(new Image(getClass().getResource("assets/AA.png").toString()));
root.getChildren().add(img);
    primaryStage.setScene(scene);
    primaryStage.show();
    }
}
