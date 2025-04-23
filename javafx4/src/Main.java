import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
//        1 savarjisho
//        Parent root = FXMLLoader.load(getClass().getResource("animals.fxml"));
//        stage.setTitle("შინაური ცხოველის არჩევა");
//        stage.setScene(new Scene(root,620 ,400));
//        stage.show();



//        2 savarjisho
        Parent root = FXMLLoader.load(getClass().getResource("gallery.fxml"));
        stage.setTitle("გალერიის აპლიკაცია");
        stage.setScene(new Scene(root, 500, 400));
        stage.show();



//        3 savarjisho
//        Parent root = FXMLLoader.load(getClass().getResource("greetingCard.fxml"));
//        stage.setTitle("Greeting Card");
//        stage.setScene(new Scene(root, 500, 550));
//        stage.show();

    }
}