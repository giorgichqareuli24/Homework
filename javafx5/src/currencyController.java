import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class currencyController {

    @FXML
    private ChoiceBox<String> fromChoiceBox;

    @FXML
    private ChoiceBox<String> toChoiceBox;

    @FXML
    private Spinner<Double> amountSpinner;

    @FXML
    private Label resultLabel;

    private final ObservableList<String> currencies = FXCollections.observableArrayList("GEL", "USD", "GBP", "EUR");

    private final double GEL_TO_USD = 0.37;
    private final double GEL_TO_EUR = 0.34;
    private final double GEL_TO_GBP = 0.29;

    @FXML
    public void initialize() {
        fromChoiceBox.setItems(currencies);
        toChoiceBox.setItems(currencies);
        amountSpinner.setEditable(true);
        fromChoiceBox.setValue("GEL");
        toChoiceBox.setValue("USD");

        SpinnerValueFactory<Double> valueFactory = new SpinnerValueFactory.DoubleSpinnerValueFactory(0.0, 100000.0, 1.0, 1.0);
        amountSpinner.setValueFactory(valueFactory);

        fromChoiceBox.setOnAction(e -> convert());
        toChoiceBox.setOnAction(e -> convert());
        amountSpinner.valueProperty().addListener((obs, oldVal, newVal) -> convert());
    }

    private void convert() {
        String from = fromChoiceBox.getValue();
        String to = toChoiceBox.getValue();
        double amount = amountSpinner.getValue();


        if (from.equals(to)) {
            resultLabel.setText(String.format("შედეგი: %.2f %s", amount, to));
            return;
        }

        double amountInGel = switch (from) {
            case "USD" -> amount / GEL_TO_USD;
            case "EUR" -> amount / GEL_TO_EUR;
            case "GBP" -> amount / GEL_TO_GBP;
            default -> amount;
        };

        double converted = switch (to) {
            case "USD" -> amountInGel * GEL_TO_USD;
            case "EUR" -> amountInGel * GEL_TO_EUR;
            case "GBP" -> amountInGel * GEL_TO_GBP;
            default -> amountInGel;
        };

        resultLabel.setText(String.format("შედეგი: %.2f %s", converted, to));
    }
}

