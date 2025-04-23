import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {

//        Label label = new Label("გამარჯობა, ეს არის აპლიკაცია");
//        StackPane root = new StackPane(label);
//        root.setStyle("-fx-background-color: Yellow;");
//
//        Scene scene = new Scene(root, 400, 200);
//
//        stage.getIcons().add(new Image("file:icon.png"));
//        stage.setTitle("ჩემი აპლიკაცია");
//        stage.setScene(scene);
//        stage.setResizable(false);
//        stage.show();












//        2 savarjisho
//        Pane root = new Pane();
//
//        Rectangle square = new Rectangle(50, 50, 100, 100);
//        square.setFill(Color.GREEN);
//
//        Line diag1 = new Line(50, 50, 150, 150);
//        Line diag2 = new Line(150, 50, 50, 150);
//        diag1.setStroke(Color.YELLOW);
//        diag2.setStroke(Color.YELLOW);
//
//        Line line1 = new Line(200, 50, 400, 50);
//        Line line2 = new Line(400, 50, 400, 350);
//        Line line3 = new Line(400, 350, 200, 350);
//        Line line4 = new Line(200, 350, 200, 50);
//
//        line1.setStroke(Color.BLUE);
//        line2.setStroke(Color.BLUE);
//        line3.setStroke(Color.BLUE);
//        line4.setStroke(Color.BLUE);
//
//        root.getChildren().addAll(square, diag1, diag2, line1, line2, line3, line4);
//
//        Scene scene = new Scene(root, 500, 400);
//        stage.setTitle("ფიგურები JavaFX-ში");
//        stage.setScene(scene);
//        stage.show();











//        3 savarjisho
        Pane root = new Pane();

        Circle face = new Circle(250, 200, 100);
        face.setFill(Color.YELLOW);

        Circle leftEye = new Circle(210, 170, 20);
        Circle rightEye = new Circle(290, 170, 20);
        leftEye.setFill(Color.BLACK);
        rightEye.setFill(Color.BLACK);

        Circle mouth = new Circle(250, 250, 50);
        mouth.setFill(Color.TRANSPARENT);
        mouth.setStroke(Color.BLACK);
        mouth.setStrokeWidth(5);

        root.getChildren().addAll(face, leftEye, rightEye, mouth);

        Scene scene = new Scene(root, 500, 400);
        stage.setTitle("სმაილი");
        stage.setScene(scene);
        stage.show();
    }
}



