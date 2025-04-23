import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ExitController {

    @FXML
    private Button exitButton;

    private int clickCount = 0;

    @FXML
    private void handleClick() {
        clickCount++;
        if (clickCount == 5) {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Exit Confirmation!");
            alert.setHeaderText("გსურთ აპლიკაციის გათიშვა?");
            alert.setContentText("დარწმუნებული ხართ, რომ გსურთ გასვლა?");

            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    Stage stage = (Stage) exitButton.getScene().getWindow();
                    stage.close();
                } else {
                    clickCount = 0;
                }
            });
        }
    }
}
