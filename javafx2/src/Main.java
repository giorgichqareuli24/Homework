import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage Stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
        Stage.setTitle("წრის მოძრაობა");
        Stage.setScene(new Scene(root));
        Stage.show();




//        2 savarjisho
//        Parent root = FXMLLoader.load(getClass().getResource("App.fxml"));
//        Stage.setTitle("Change Background Color");
//        Stage.setScene(new Scene(root));
//        Stage.show();




//        3 savarjisho
//        Parent root = FXMLLoader.load(getClass().getResource("jump.fxml"));
//        Stage.setTitle("Brain-Breaker");
//        Stage.setScene(new Scene(root));
//        Stage.show();
    }
}