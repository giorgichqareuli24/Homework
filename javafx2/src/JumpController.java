import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import java.util.Random;

public class JumpController {

    @FXML
    private Button jumpButton;

    @FXML
    private AnchorPane anchorPane;

    private final Random random = new Random();

    @FXML
    private void jumpButtonClicked() {
        double paneWidth = anchorPane.getWidth();
        double paneHeight = anchorPane.getHeight();

        double buttonWidth = jumpButton.getWidth();
        double buttonHeight = jumpButton.getHeight();

        double newX = random.nextDouble() * (paneWidth - buttonWidth);
        double newY = random.nextDouble() * (paneHeight - buttonHeight);

        jumpButton.setLayoutX(newX);
        jumpButton.setLayoutY(newY);
    }
}
