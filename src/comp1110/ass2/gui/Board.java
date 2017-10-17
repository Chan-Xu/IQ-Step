package comp1110.ass2.gui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import javafx.stage.Stage;
import javafx.scene.Group;


import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;











public class Board extends Application {
    // the canves size
    private static final int BOARD_WIDTH = 1200;
    private static final int BOARD_HEIGHT = 900;
    // Piece
    private static final int Piece_Size=150;
    // the board
    private static final int START_X=50;
    private static final int START_Y=200;
    private static final int r =12;
    private static  final int WIDTH = Piece_Size*4;
    private static final int Space=Piece_Size/4;
    private static final int PieceR=Piece_Size/3;
    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    //to save the flip and rotation
    char[]flipRot = new char[8];
    // save the postion
    char[] pos=new char[8];
    // FIXME Task 7: Implement a basic playable Steps Game in JavaFX that only allows pieces to be placed in valid places
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
           setOnScroll(event->{
               rotate();
 System.out.println(""+getFlipRot());
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
            setOnMouseReleased(event -> {
                if(onBoard()){
                    if((""+piece+flipRot[index]).equals("AB")){// CHANGE THIS CONDITION
                        snapToGrid();
                    }else{
                        snapToHome();
                    }
                }else{
                    snapToHome();
                }
            });
// ??? how to change this if click this remove the old one???
            setOnMouseClicked(event ->{
                System.out.println(""+this.flip+this.piece);
//                root.getChildren().add(new DraggablePiece(this.piece,'E'));
//                root.getChildren().remove(new DraggablePiece(this.piece, this.flip));

            });
        }
        private boolean onBoard(){
            return getLayoutX()>=(START_X-50)&&getLayoutX()<=(START_X+WIDTH+Space-Piece_Size)
                    &&getLayoutY()>=(START_Y-50)&&getLayoutY()<=(START_Y+(Space*5+r)-Piece_Size);
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
            translateX= (centreX-START_X+PieceR/2)/(Space);
            translateY= (centreY-START_Y+PieceR/2)/(Space);
            setLayoutX((int)translateX*(Space)+START_X-Piece_Size/2);
            setLayoutY((int)translateY*(Space)+START_Y-Piece_Size/2);
        }

        private void rotate(){
            setRotate((getRotate()+90)%360);
                    }
        // to flip the piece
          private char getFlipRot(){
            int rotate=(int)getRotate()/90;
            char val=(char) (flip+rotate);

           return flipRot[index]=val;

          }
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

