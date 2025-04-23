import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.WindowEvent;



public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

//    1 savarjisho
    @Override
    public void start(Stage Stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Exit.fxml"));
        Scene scene = new Scene(root);
        Stage.setTitle("Exit");
        Stage.setScene(scene);
        Stage.setOnCloseRequest((WindowEvent event) -> {
            event.consume();
        });
        Stage.show();




//        2 savarjisho
//        ver vaswreb mas daweras(((((
    }
}