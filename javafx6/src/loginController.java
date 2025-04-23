import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    private final String validUsername = "GIORGI";
    private final String validPassword = "9999";

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("გთხოვთ შეავსოთ ყველა ველი.");
        } else if (!username.equals(validUsername) || !password.equals(validPassword)) {
            messageLabel.setText("მომხმარებელი ან პაროლი არასწორია!");
            messageLabel.setStyle("-fx-text-fill: RED;");
        } else {
            messageLabel.setStyle("-fx-text-fill: green;");
            messageLabel.setText("წარმატებით შეხვედი!");
        }
    }
}
