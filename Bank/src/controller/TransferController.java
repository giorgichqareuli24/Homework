package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TransferController {

    @FXML
    private TextField amountTextField;

    @FXML
    private TextField ibanField;

    @FXML
    private void handleTransfer(ActionEvent event) {
        String amountText = amountTextField.getText().trim();
        String receiverIban = ibanField.getText().trim();
        if (amountText.isEmpty()) {
            showAlert("Please enter an amount.");
            return;
        }

        if (receiverIban.isEmpty()) {
            showAlert("Please enter the receiver's IBAN.");
            return;
        }

        double amount;
        try {
            amount = Double.parseDouble(amountText);
        } catch (NumberFormatException e) {
            showAlert("Invalid amount format. Please enter a valid number.");
            return;
        }

        System.out.println("Transfer of " + amount + " to IBAN " + receiverIban + " successful.");
        showSuccess("Transfer completed successfully.");
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void showSuccess(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void goBackToHome(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/controller/homePage.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
