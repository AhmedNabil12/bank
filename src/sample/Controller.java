package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller  {

    @FXML
    void customerForm(ActionEvent event) throws IOException {
        Parent existClient = FXMLLoader.load(getClass().getResource("oldClient.fxml"));
        Scene clientScene = new Scene(existClient);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(clientScene);
        window.show();
    }


    @FXML
    void newClientInfo(ActionEvent event) throws IOException {
        Parent newCustomer = FXMLLoader.load(getClass().getResource("W2.fxml"));
        Scene newCustomerScene = new Scene(newCustomer);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newCustomerScene);
        window.show();
    }


}
