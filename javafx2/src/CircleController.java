import javafx.fxml.FXML;
import javafx.scene.paint.Color;


public class CircleController {
    @FXML
    private javafx.scene.shape.Circle circle;

    private final double step = 20;

    private Color[] colors = {Color.RED, Color.BLACK, Color.GREEN, Color.BLUE, Color.YELLOW};
    private int currentColorIndex = 0;

    @FXML
    private void moveUp() {
        circle.setLayoutY(circle.getLayoutY() - step);
    }

    @FXML
    private void moveDown() {
        circle.setLayoutY(circle.getLayoutY() + step);
    }

    @FXML
    private void moveLeft() {
        circle.setLayoutX(circle.getLayoutX() - step);
    }

    @FXML
    private void moveRight() {
        circle.setLayoutX(circle.getLayoutX() + step);
    }

    @FXML
    private void makeRed() {
        circle.setFill(Color.RED);
    }


    @FXML
    private void changeColor() {

        circle.setFill(colors[currentColorIndex]);

        currentColorIndex++;

        if (currentColorIndex >= colors.length) {
            currentColorIndex = 0;
        }

    }
}