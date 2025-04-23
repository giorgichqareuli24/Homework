import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class greetingCardController {

    @FXML
    private CheckBox balloonsCheck;

    @FXML
    private CheckBox heartsCheck;

    @FXML
    private CheckBox starsCheck;

    @FXML
    private Button generateButton;

    @FXML
    private FlowPane cardPane;

    private final Random random = new Random();

    @FXML
    private void generateCard() {
        cardPane.getChildren().clear();

        List<Shape> selectedShapes = new ArrayList<>();

        if (balloonsCheck.isSelected()) {
            selectedShapes.add(createBalloon());
        }
        if (heartsCheck.isSelected()) {
            selectedShapes.add(createHeart());
        }
        if (starsCheck.isSelected()) {
            selectedShapes.add(createStar());
        }

        if (selectedShapes.isEmpty()) return;

        for (int i = 0; i < 50; i++) {
            Shape shape = cloneShape(selectedShapes.get(random.nextInt(selectedShapes.size())));
            cardPane.getChildren().add(shape);
        }
    }

    private Shape createBalloon() {
        Circle balloon = new Circle(20, Color.LIGHTBLUE);
        return balloon;
    }

    private Shape createHeart() {
        Polygon heart = new Polygon();
        heart.getPoints().addAll(
                10.0, 0.0,
                20.0, 10.0,
                10.0, 20.0,
                0.0, 10.0
        );
        heart.setFill(Color.PINK);
        return heart;
    }

    private Shape createStar() {
        Polygon star = new Polygon();
        star.getPoints().addAll(
                10.0, 0.0,
                12.0, 7.0,
                20.0, 7.0,
                14.0, 12.0,
                16.0, 20.0,
                10.0, 15.0,
                4.0, 20.0,
                6.0, 12.0,
                0.0, 7.0,
                8.0, 7.0
        );
        star.setFill(Color.GOLD);
        return star;
    }

    private Shape cloneShape(Shape shape) {
        Shape copy;
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            copy = new Circle(c.getRadius(), c.getFill());
        } else if (shape instanceof Polygon) {
            Polygon p = (Polygon) shape;
            copy = new Polygon();
            copy.getStyleClass().addAll(p.getStyleClass());
            ((Polygon) copy).getPoints().addAll(p.getPoints());
            copy.setFill(p.getFill());
        } else {
            copy = shape;
        }
        return copy;
    }
}
