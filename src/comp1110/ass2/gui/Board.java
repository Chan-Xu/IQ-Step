package comp1110.ass2.gui;
import comp1110.ass2.GameBoard;
import comp1110.ass2.StepsGame;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Group;


import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Board extends Application {


    // the canves size
    private static final int BOARD_WIDTH = 1200;
    private static final int BOARD_HEIGHT = 900;
    // Piece
    private static final int Piece_Size=150;
    // the board
    private static final int START_X=100;
    private static final int START_Y=200;
    private static final int r =12;
    private static  final int WIDTH = Piece_Size*4;
    private static final int Space=Piece_Size/4;
    private static final int PieceR=Piece_Size/3;
    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group peg= new Group();
    private final Group firstImage= new Group();
    private final Group flipImage =new Group();
    private final Group starPiece=new Group();
    private static final char not=' ';
    //to save the flip and rotation
    char[]flipRot = new char[8];
    // save the postion
    char[] pos=new char[8];
    // create an array to save the onboard piece
    String[]onBoardPiece=new String[8];
    private static  final String not_string=" ";
    // FIXME Task 7: Implement a basic playable Steps Game in JavaFX that only allows pieces to be placed in valid places
    // to create a piece class

    class Piece extends ImageView{
        int originx,originy;
        char piece,flip,a,b;
        int index;
        Piece(char piece, char flip){
            if(!(piece>='A'&&piece<='H')){
                throw new IllegalArgumentException("no this picture");
            }else if (flip=='A'||flip=='E'){
                setImage(new Image((getClass().getResource(URI_BASE+piece+flip+".png").toString())));
                this.piece = piece;
                this.flip = flip;
                index=piece-'A';
            }
            else { throw new IllegalArgumentException("no this picture");
            }
//            if(flip=='A'){
                originx=BOARD_WIDTH/8*(piece-'A');
                originy=0;
//            }else{
//                originx =BOARD_WIDTH/8*(piece-'A');
//                originy= 500;
//            }

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
            flipRot[index]=not;
            pos[index]=not;
            onBoardPiece[index]=not_string;
            setOnScroll(event->{
                rotate();

            });
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
            setOnMouseReleased((MouseEvent event) -> {
                if(onBoard()){
                    snapToGrid();
                }
                else {
                    snapToHome();
                }
                if(StepsGame.isPlacementSequenceValid(Board.this.toString(onBoardPiece))){
                    snapToGrid();
                }else{
                    snapToHome();
                }
                System.out.println(Board.this.toString(onBoardPiece));
            });
// ??? how to change this if click this remove the old one???
            setOnMouseClicked(event ->{
                int clickTimes = event.getClickCount();
                if (clickTimes == 2){
                    firstImage.getChildren().remove((0));
                    flipImage.getChildren().add(new DraggablePiece(this.piece,'E'));

                }

            });
        }
        // to check whether the piece is on board
        private boolean onBoard(){
            return getLayoutX()>=(START_X-80)&&getLayoutX()<=(START_X+WIDTH+Space-Piece_Size)
                    &&getLayoutY()>=(START_Y-80)&&getLayoutY()<=(START_Y+(Space*5+r)-Piece_Size);
        }

        // nake the piece come back to the original position
        private void snapToHome(){
            setLayoutX(originx);
            setLayoutY(originy);
            flipRot[index]=not;
            pos[index]=not;
        }
        // make the piece to the nearst position
        private void snapToGrid(){
            double translateX,translateY;
            double centreX,centreY;
            centreX=getLayoutX()+Piece_Size/2;
            centreY=getLayoutY()+Piece_Size/2;
            int setCentreX=(int)(centreX-START_X+PieceR/2)/(Space)*(Space);
            int setX=setCentreX+START_X-Piece_Size/2;
            int setCentreY=(int)(centreY-START_Y+PieceR/2)/(Space)*(Space);
            int setY=setCentreY+START_Y-Piece_Size/2;
            setLayoutX(setX);
            setLayoutY(setY);
            setPosition();
            getFlipRot();
            total();
            System.out.println(""+setX+" "+setY);
        }

        // to rotate the picture
        private void rotate(){
            setRotate((getRotate()+90)%360);
            setPosition();
            getFlipRot();
            total();
        }
        // to flip the piece May be not usrful
//        private DraggablePiece flipPiece(DraggablePiece a){
//            Graphics2D graphics2D;
//            DraggablePiece img;
//            int w= (int) a.getFitWidth();
//            int h= (int) a.getFitHeight();
//            graphics2D= (img = new DraggablePiece(w,h))
//                    return;
//        }

        private void getFlipRot(){
            int rotate=(int)getRotate()/90;
            char val=(char) (flip+rotate);
            flipRot[index]=val;
        }
        private void setPosition(){
            char position='A';
            int x= (int)(getLayoutX()+Piece_Size/2-START_X+PieceR/2)/(Space);
            int y=(int)(getLayoutY()+Piece_Size/2-START_Y+PieceR/2)/(Space)*10;
            if (x+y<26){
                position= (char)('A'+x+y);
            }else{
                position=(char)('A'+x+y+7);
            }
            pos[index]=position;
        }
        private void total(){
            onBoardPiece[index]=(String.valueOf(piece)+String.valueOf(flipRot[index])+String.valueOf(pos[index]));
        }
    }
    public String toString(String[] a){
        StringBuffer valid =new StringBuffer();
        for (int i=0;i<a.length;i++){
            if(a[i].equals(" ")){

            }else{
                valid.append(a[i]);
            }
        }
        String str=valid.toString();
        return  str;
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
                    x=START_X+Space*2*col;
                }else{
                    x =START_X+Space+Space*2*col;
                }
                double y =START_Y+Space*row;
                Circle circle = new Circle(x, y, r);
                circle.setFill(Color.GRAY);
                peg.getChildren().add(circle);

                // change this root to board
                // add board to root;
            }
        }
    }

    private void makePiece(){
        for (char z = 'A'; z <= 'H'; z++) {
            firstImage.getChildren().add(new DraggablePiece(z,'A'));
            //
        }
    }
    // FIXME Task 8: Implement starting placements
    private void star(){
        firstImage.getChildren().remove(0,7);
        ArrayList<String> list=new ArrayList<>();

        list.add("AA");
        list.add("BA");
        list.add("CA");
        list.add("DA");
        list.add("EA");
        list.add("FA");
        list.add("GA");
        list.add("HA");
        int random=(int)(1+Math.random()*7);
        String str =  list.get(random);
        list.remove(random);
        for(String a:list){
            char[] b=a.toCharArray();
            starPiece.getChildren().add(new DraggablePiece(b[0],b[1]));
        }
        char[] boardPiece = str.toCharArray();
        DraggablePiece a =new DraggablePiece(boardPiece[0],boardPiece[1]);
        a.relocate(62,162);

        starPiece.getChildren().add(a);
        makeBoard();

    }
    // FIXME Task 10: Implement hints

    // FIXME Task 11: Generate interesting starting placements

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("IQ game");
        Scene scene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);
        root.getChildren().add(peg);
        root.getChildren().add(firstImage);
        root.getChildren().add(flipImage);
        root.getChildren().add(starPiece);
        makeBoard();

        makePiece();
        makeControl();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void makeControl(){
        Button star=new Button("Star");
        star.setOnAction(event -> {
            star();
        });
        star.setLayoutX(WIDTH/2);
        star.setLayoutY(3*Piece_Size);
        root.getChildren().add(star);
    }

    public static void main(String[] args){
        launch(args);
    }
}
