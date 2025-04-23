import javafx.fxml.FXML;
import javafx.scene.control.*;

public class animalsController {

    @FXML private RadioButton catRadioButton;
    @FXML private RadioButton dogRadioButton;
    @FXML private RadioButton rabbitRadioButton;
    @FXML private RadioButton birdRadioButton;
    @FXML private TextField nameField;
    @FXML private Label resultLabel;

    @FXML
    private void confirmSelection() {
        String petType = null;

        if (catRadioButton.isSelected()) {
            petType = "კატა";
        } else if (dogRadioButton.isSelected()) {
            petType = "ძაღლი";
        } else if (rabbitRadioButton.isSelected()) {
            petType = "კურდღელი";
        } else if (birdRadioButton.isSelected()) {
            petType = "ჩიტი";
        }

        String petName = nameField.getText().trim();

        if (petName.isEmpty()) {
            resultLabel.setText("გთხოვ შეიყვანო შინაური ცხოველის სახელი.");
        } else if (petType != null) {
            resultLabel.setText("შენ აირჩიე " + petType + " სახელად " + petName);
        } else {
            resultLabel.setText("გთხოვ, აირჩიე შინაური ცხოველი!");
        }
    }
}
