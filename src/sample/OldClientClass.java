package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OldClientClass {
    ArrayList<Account> accounts;
    Account currentAccount;
    @FXML
    private TextField AccNum;
    @FXML
    private TextField NameFirstLast;
    @FXML
    private TextField AccountType;
    @FXML
    private TextField balance;
    @FXML
    private TextField aaamountDeposit;
    @FXML
    private TextField amountWithdraw;
    @FXML
    private Label newBalasnceDepositt;
    @FXML
    private Label newBalanceWithdraww;

    @FXML
    void Finish(ActionEvent event) {

    }

    @FXML
    void Next(ActionEvent event) throws IOException {
        Parent services = FXMLLoader.load(getClass().getResource("oldClientWindow2.fxml"));
        Scene servicesScene = new Scene(services);
        //this line gets the stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(servicesScene);
        window.show();
    }

    @FXML
    void back(ActionEvent event) throws IOException {
        Parent goBack = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene firstScene = new Scene(goBack);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(firstScene);
        window.show();
    }

    @FXML
    void deposit(ActionEvent event) throws IOException, InvalidAmount, AccNotFound {

        Double x = Double.parseDouble(aaamountDeposit.getText());
        currentAccount.depositMoney(x);
        String ba = Double.toString(currentAccount.balance);
        newBalasnceDepositt.setText(ba);
        FileHandling.saveFile(accounts);
    }

    @FXML
    void withdraw(ActionEvent event) throws IOException, InvalidAmount, MaxBalance, AccNotFound, MaxWithdraw {

        System.out.println(amountWithdraw.getText());
        Double x = Double.parseDouble(amountWithdraw.getText());
        if(currentAccount!=null) {
           boolean success= currentAccount.withdrawMoney(x);
           System.out.println(success);
           if(success) {
               String ba = Double.toString(currentAccount.balance);
               newBalanceWithdraww.setText(ba);
               FileHandling.saveFile(accounts);
           }else

           {
               JOptionPane.showMessageDialog(null,"Insufficient Balance");
           }
        }
    }

    @FXML
    void loan(ActionEvent event) throws IOException {
        Parent loanss = FXMLLoader.load(getClass().getResource("Loans.fxml"));
        Scene loanssScene = new Scene(loanss);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(loanssScene);
        window.show();
    }

    @FXML
    void submitForAccNo(ActionEvent event) throws IOException {

        accounts=FileHandling.readFile();
        for (Account a:accounts) {
            if(a.getAccountNumber().equals(AccNum.getText()))
            {
                currentAccount=a;
                NameFirstLast.setText(a.user.getFirstName() + " " + a.user.getLastName());
                AccountType.setText(a.accountType);
                balance.setText(a.getBalance()+"");
                break;
            }
        }
    }
}
