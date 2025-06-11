package controller;

import dao.UserDao;
import dao.UserDaoImpl;
import entity.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;

public class RegisterController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField ibanField;

    private final UserDao userDao = new UserDaoImpl();

    @FXML
    private void handleRegister() {
        String firstName = firstNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String username = usernameField.getText().trim();
        String password = passwordField.getText();
        String iban = ibanField.getText().trim();

        if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || password.isEmpty() || iban.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Registration Error", "Please fill in all fields.");
            return;
        }

        if (!Character.isUpperCase(firstName.charAt(0))) {
            showAlert(Alert.AlertType.ERROR, "Invalid First Name", "First name must start with an uppercase letter.");
            return;
        }

        if (!Character.isUpperCase(lastName.charAt(0))) {
            showAlert(Alert.AlertType.ERROR, "Invalid Last Name", "Last name must start with an uppercase letter.");
            return;
        }

        if (userDao.findByUsername(username) != null) {
            showAlert(Alert.AlertType.ERROR, "Username Exists", "Username already exists. Please choose another.");
            return;
        }

        if (userDao.findByIBAN(iban) != null) {
            showAlert(Alert.AlertType.ERROR, "IBAN Exists", "IBAN already exists. Please enter a different IBAN.");
            return;
        }

        User newUser = new User(firstName, lastName, username, password, iban, 0.0);
        userDao.create(newUser);

        showAlert(Alert.AlertType.INFORMATION, "Success", "User registered successfully!");
        clearFields();

        try {
            URL fxmlLocation = getClass().getResource("/controller/homePage.fxml");
            if (fxmlLocation == null) {
                showAlert(Alert.AlertType.ERROR, "Navigation Error", "homePage.fxml not found!");
                return;
            }

            FXMLLoader loader = new FXMLLoader(fxmlLocation);
            Parent root = loader.load();

            Stage stage = (Stage) firstNameField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Navigation Error", "Failed to load the home page.");
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void clearFields() {
        firstNameField.clear();
        lastNameField.clear();
        usernameField.clear();
        passwordField.clear();
        ibanField.clear();
    }

    @FXML
    private void goBackToLogin(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/controller/login.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
