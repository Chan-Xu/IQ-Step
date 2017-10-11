

package comp1110.ass2.gui;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by lenovo on 2017/10/7.
 */
public class DraggableImageView extends ImageView {
    private double mouseX ;
    private double mouseY ;
    public DraggableImageView(Image image) {
        super(image);
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
    }
}
