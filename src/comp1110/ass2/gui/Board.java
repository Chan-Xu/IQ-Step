package comp1110.ass2.gui;
import comp1110.ass2.StepsGame;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Group;


import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.util.ArrayList;

public class Board extends Application {

    private static final int BOARD_WIDTH = 1200;
    private static final int BOARD_HEIGHT = 900;
    // Piece
    private static final int Piece_Size=150;
    // the board
    private static final int START_X=2*Piece_Size;
    private static final int START_Y=Piece_Size;
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
    private final Group instruction=new Group();
    private static final char not=' ';
    //to save the flip and rotation
    char[]flipRot = new char[8];
    // save the postion
    char[] pos=new char[8];
    // create an array to save the onboard piece
    String[]onBoardPiece=new String[8];
    private static  final String not_string=" ";
    // FIXME Task 7: Implement a basic playable Steps Game in JavaFX that only allows pieces to be placed in valid places
    //Authorship details: Task7 is written by Yiwen Peng (u6071714).
    // to create a piece class

    class Piece extends ImageView{
        int originx,originy;
        char piece,flip;
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
                originx=BOARD_WIDTH/8*(piece-'A');
                originy=3*Piece_Size;
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
            // to rotate the picture
            setOnScroll(event-> rotate());
            // to move the piece
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
            // to set on the nearst peg
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
            // to flip the picture;
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

        // make the piece come back to the original position
        private void snapToHome(){
            setLayoutX(originx);
            setLayoutY(originy);
            flipRot[index]=not;
            pos[index]=not;
        }
        // make the piece to the nearst position
        private void snapToGrid(){
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
        // to flip the picture   find corresponded char
        private void getFlipRot(){
            int rotate=(int)getRotate()/90;
            char val=(char) (flip+rotate);
            flipRot[index]=val;
        }
        // find the char of the position (A,B...)
        private void setPosition(){
            char position;
            int x= (int)(getLayoutX()+Piece_Size/2-START_X+PieceR/2)/(Space);
            int y=(int)(getLayoutY()+Piece_Size/2-START_Y+PieceR/2)/(Space)*10;
            if (x+y<26){
                position= (char)('A'+x+y);
            }else{
                position=(char)('A'+x+y+7);
            }
            pos[index]=position;
        }
        //get the information string of piece;
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
      // draw the peg
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
     // draw the piece
    private void makePiece(){
        for (char z = 'A'; z <= 'H'; z++) {
            firstImage.getChildren().add(new DraggablePiece(z,'A'));
        }
    }
    // FIXME Task 8: Implement starting placements
    //Authorship details: Task8 is written Yiwen Peng (u6071714)

    // randomly choose a piece on the board
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
        for(String piece:list){
            char[] singlePiece=piece.toCharArray();
            starPiece.getChildren().add(new DraggablePiece(singlePiece[0],singlePiece[1]));
        }
        char[] boardPiece = str.toCharArray();
        DraggablePiece a =new DraggablePiece(boardPiece[0],boardPiece[1]);
        a.relocate(262,112);

        starPiece.getChildren().add(a);
        makeBoard();

    }
    // to design the layout of game
    // design the game board
    private void design(){
         Image image = new Image((getClass().getResource(URI_BASE+"bg.jpg").toString()));
         ImageView bg=new ImageView(image);
         Text title= new Text("IQ-Step");
         title.setFont(Font.font("Tahoma",FontWeight.NORMAL, 50));
         title.setX(BOARD_WIDTH/2-200);
         title.setY(50);
         bg.setFitHeight(BOARD_HEIGHT);
         bg.setFitWidth(BOARD_WIDTH);
         bg.setX(0);
         bg.setY(0);
         bg.setOpacity(0.75f);
         root.getChildren().addAll(bg,title);
    }
    // add start button to start the game;
    private void makeControl(){
        Button star=new Button("Star");
        star.setOnAction(event -> {
            star();
        });
        star.setLayoutX(4.5*Piece_Size);
        star.setLayoutY(2*Piece_Size);
        root.getChildren().add(star);
    }                                        

    // design the rule board
    private void tellRule(){
        Image image = new Image((getClass().getResource(URI_BASE+"bg1.jpg").toString()));
        ImageView bg=new ImageView(image);
          bg.setFitHeight(BOARD_HEIGHT);
          bg.setFitWidth(BOARD_WIDTH);
          bg.setX(0);
          bg.setY(0);
          bg.setOpacity(0.75f);
        Text title =new Text("HOW TO PLAY");
        title.setX(80);
        title.setY(50);
        title.setFont(Font.font("Tahoma",FontWeight.NORMAL, 50));
        Text r1=new Text("1.click Start to play the game.");
        r1.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
        r1.setX(30);
        r1.setY(100);
        Text r2=new Text("2.one the picture could not move to the board,the game is over.");
        r2.setX(30);
        r2.setY(130);
        r2.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
        Text r3=new Text("scroll the mouse to rotate the piece,double to flip the picture.");
        r3.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
        r3.setX(30);
        r3.setY(150);
        instruction.getChildren().addAll(bg,title,r1,r2,r3);
    }

    // FIXME Task 10: Implement hints

    // FIXME Task 11: Generate interesting starting placements

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("IQ game");
        Scene scene1 = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);
        Scene scene2= new Scene(instruction,BOARD_WIDTH/2+20,BOARD_HEIGHT/2+20);
        design();
        makeBoard();
        makePiece();
        tellRule();
        makeControl();
        tellRule();
       // TO SWITCH THE SCENE
        Button rule=new Button("rule");
        rule.setLayoutX(4.5*Piece_Size);
        rule.setLayoutY(2.2*Piece_Size);
        rule.setOnAction(e->primaryStage.setScene(scene2));
        Button comeback=new Button("back");
        comeback.setLayoutX(BOARD_WIDTH/2/4*3);
        comeback.setLayoutY(BOARD_HEIGHT/2/4*3);
        comeback.setOnAction(e->primaryStage.setScene(scene1));
        instruction.getChildren().addAll(comeback);
        root.getChildren().addAll(peg,firstImage,flipImage,starPiece,rule);

        primaryStage.setScene(scene1);
        primaryStage.show();
    }










    public static void main(String[] args){
        launch(args);
    }
}
