package controller;

import entity.Transaction;
import entity.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import service.TransactionService;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

public class TransactionsController {

    @FXML private TableView<Transaction> transactionTable;
    @FXML private TableColumn<Transaction, String> typeColumn;
    @FXML private TableColumn<Transaction, Double> amountColumn;
    @FXML private TableColumn<Transaction, String> fromColumn;
    @FXML private TableColumn<Transaction, String> toColumn;
    @FXML private TableColumn<Transaction, Timestamp> dateColumn;

    private User currentUser;
    private final TransactionService transactionService = new TransactionService();

    public void setCurrentUser(User user) {
        this.currentUser = user;
        loadTransactions();
    }

    private void loadTransactions() {
        List<Transaction> transactions = transactionService.getUserTransactions(currentUser.getIban());
        ObservableList<Transaction> observableList = FXCollections.observableArrayList(transactions);
        transactionTable.setItems(observableList);
    }

    @FXML
    public void initialize() {
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("typeName"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        fromColumn.setCellValueFactory(new PropertyValueFactory<>("fromIban"));
        toColumn.setCellValueFactory(new PropertyValueFactory<>("toIban"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("timestamp"));
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
