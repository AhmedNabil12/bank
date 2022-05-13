package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class W2Class implements Initializable {

    @FXML
    private TextField FirstName;
    @FXML
    private TextField LastName;
    @FXML
    private TextField Email;
    @FXML
    private TextField phone;
    @FXML
    private TextField sex;
    @FXML
    private TextField address;
    @FXML
    private TextField occ;
    @FXML
    private TextField NID;
    @FXML
    private TextField AccNumb;
    @FXML
    private TextField balance;
    @FXML
    private ComboBox<String> AccTypeCombo;



   // ArrayList<Account> newAccounts;
    @FXML
    void submit(ActionEvent event) throws IOException {
       // FileHandling.saveFile(newAccounts);
        File f=new File("a.csv");
        FileWriter fw =new FileWriter(f,true);
        PrintWriter pw =new PrintWriter(fw);
        pw.print(FirstName.getText()+",");
        pw.print(LastName.getText()+",");
        pw.print(Email.getText()+",");
        pw.print(phone.getText()+",");
        pw.print(NID.getText()+",");
        pw.print(address.getText()+",");
        pw.print(occ.getText()+",");
        pw.print(sex.getText()+",");
        pw.print(AccTypeCombo.getValue()+",");
        pw.print(AccNumb.getText()+",");
        pw.println(balance.getText());
        pw.close();
        fw.close();
    }

    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent goBack = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene firstScene = new Scene(goBack);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(firstScene);
        window.show();
    }



    @FXML
    void generate(ActionEvent event) {
        Account a=new Account();
        AccNumb.setText(a.generateUniqueAccountNumber());

    }
    @FXML
    void Finish(ActionEvent event) {
        System.exit(0);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
      ObservableList<String> list= FXCollections.observableArrayList();
        list.addAll("Saving Account","Student Account","Current Account");
       AccTypeCombo.setItems(list);

    }



}

