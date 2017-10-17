package comp1110.ass2.gui;
import comp1110.ass2.StepsGame;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Cursor;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.Node;

import javax.xml.parsers.SAXParser;
import java.awt.*;
import java.nio.file.attribute.GroupPrincipal;

public class Board extends Application {
    // the canves size
    private static final int BOARD_WIDTH = 1200;
    private static final int BOARD_HEIGHT = 900;
    // the board
    private static final int START_X=50;
    private static final int START_Y=200;
    private static final int SPACE=50;// equall to 2pacing
    private static final int r =12;
    private static  final int WIDTH =(SPACE/2+r+((2*r)+SPACE)*5)*(16/11);
    private static final int HEIGHT=(START_Y+(SPACE/2+r)*4+r)-START_Y+2*r+SPACE;
    private static final String URI_BASE = "assets/";
// Piece
    private static final int Piece_Size=150;
    private final Group root = new Group();
    // FIXME Task 7: Implement a basic playable Steps Game in JavaFX that only allows pieces to be placed in valid places
    class Piece extends ImageView{
        int originx,originy;
        char piece,flip;
                Piece(char piece, char flip){
                    if(!(piece>='A'&&piece<='H')){
                        throw new IllegalArgumentException("no this picture");
                    }else if (flip=='A'||flip=='E'){
                        setImage(new Image((getClass().getResource(URI_BASE+piece+flip+".png").toString())));
                        this.piece = piece;
                        this.flip = flip;
                    }
                    else { throw new IllegalArgumentException("no this picture");
                    }
                    if(flip=='A'){
                        originx=BOARD_WIDTH/8*(piece-'A');
                        originy=0;
            }else{
                originx =BOARD_WIDTH/8*(piece-'A');
                originy= 500;
            }

            setFitHeight(Piece_Size);
            setFitWidth(Piece_Size);
            setLayoutX(originx);
            setLayoutY(originy);
        }
    }
    public class DraggablePiece extends Piece {
        private double mouseX ;
        private double mouseY ;
        public DraggablePiece(char piece,char flip) {
            super(piece,flip);
           setOnScroll(event->rotate());
            setOnMousePressed(event -> {
                mouseX = event.getSceneX() ;
                mouseY = event.getSceneY() ;
            });

            setOnMouseDragged(event -> {
                double deltaX = event.getSceneX() - mouseX ;
                double deltaY = event.getSceneY() - mouseY ;
                relocate(getLayoutX() + deltaX, getLayoutY() + deltaY);
                mouseX = event.getSceneX() ;
                mouseY = event.getSceneY() ;
                event.consume();
            });
            setOnMouseReleased(event -> {
                if(onBoard()){
//                    if((""+this.piece+this.flip).equals("AA")){// CHANGE THIS CONDITION
                        snapToGrid();
//                    }else{
//                        snapToHome();
//                    }
                }else{
                    snapToHome();
                }
            });
// ??? how to change this if click this remove the old one???
            setOnMouseClicked(event ->{
//                root.getChildren().add(new DraggablePiece(this.piece,'E')));
//                root.getChildren().remove(DraggablePiece(this.piece, `this.flip)));
            });
        }
        private boolean onBoard(){
            return getLayoutX()>=(START_X-50)&&getLayoutX()<=(START_X+SPACE/2+r+((2*r)+SPACE)*4+r)-20
                    &&getLayoutY()>=(START_Y-50)&&getLayoutY()<=(START_Y+(SPACE/2+r)*4+r);
        }
        private void snapToHome(){
            setLayoutX(originx);
            setLayoutY(originy);
        }
        private void snapToGrid(){
            double translateX,translateY;
            double centreX,centreY;
            centreX=getLayoutX()+Piece_Size/2;
            centreY=getLayoutY()+Piece_Size/2;
            translateX= (centreX-START_X+WIDTH/24)/(WIDTH/16);
            translateY= (centreY-START_Y+WIDTH/24)/(WIDTH/16);
            setLayoutX((int)translateX*(WIDTH/16)+START_X-Piece_Size/2-r);
            setLayoutY((int)translateY*(WIDTH/16)+START_Y-Piece_Size/2-r);
        }

        private void rotate(){
            setRotate((getRotate()+90)%360);
        }
        // to flip the piece

    }
//    private void flipPiece(){
//        DraggablePiece a=new DraggablePiece('A','A');
//        a.setOnMouseClicked(event -> System.out.println("sadasd")
//               );
//  root.getChildren().add(a);
//    }
    private void makeBoard(){
        for (int row =0;row<5;row++){
            for (int col=0;col<5;col++){
                double x;
                if (row%2==0){
                    x=START_X+((2*r)+SPACE)*col;
                }else{
                    x =START_X+SPACE/2+r+((2*r)+SPACE)*col;
                }
                double y =START_Y+(SPACE/2+r)*row;
                Circle circle = new Circle(x, y, r);
                circle.setFill(Color.GRAY);
                root.getChildren().add(circle);
                // change this root to board
                // add board to root;
            }
        }
    }

    private void makePiece(){
        for (char z = 'A'; z <= 'H'; z++) {
            root.getChildren().add(new DraggablePiece(z,'A'));

        }
    }
        // FIXME Task 8: Implement starting placements

        // FIXME Task 10: Implement hints

        // FIXME Task 11: Generate interesting starting placements

        @Override
        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("IQ game");
            Scene scene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);
            makeBoard();
            makePiece();

            primaryStage.setScene(scene);
            primaryStage.show();
        }

public static void main(String[] args){
            launch(args);
}
}

