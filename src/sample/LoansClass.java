package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class LoansClass {

    @FXML
    private CheckBox weekly;

    @FXML
    private CheckBox annualy;

    @FXML
    private CheckBox monthly;

    @FXML
    private TextField loanAmount;

    @FXML
    private TextField iLoan;

    @FXML
    private TextField moneyToBePaidForLoan;

    @FXML
    private TextField autoLoanAmmount;

    @FXML
    private TextField downPay;

    @FXML
    private TextField iAuto;
    @FXML
    private TextField moneyToBePaidForAutoLoan;


    @FXML
    void calculateAuto(ActionEvent event) {
        double money;
        Double x=Double.parseDouble(iAuto.getText());
        Double lo=Double.parseDouble(autoLoanAmmount.getText());
        Double down=Double.parseDouble(downPay.getText());
        money=lo-down*((x*Math.pow(x,1))/(Math.pow(x,1)-1));
        String zx=Double.toString(money);
        moneyToBePaidForAutoLoan.setText(zx);
    }

    @FXML
    void calculateLoan(ActionEvent event) {

        double money;
        if(annualy.isSelected()){
            Double x=Double.parseDouble(iLoan.getText());
            Double lo=Double.parseDouble(loanAmount.getText());
            money=lo*((x*Math.pow(x,1))/(Math.pow(x,1)-1));
            String zx=Double.toString(money);
            moneyToBePaidForLoan.setText(zx);
        }
        else if(monthly.isSelected()){
            Double x=Double.parseDouble(iLoan.getText());
            Double lo=Double.parseDouble(loanAmount.getText());
            money=lo*((x*Math.pow(x,12))/(Math.pow(x,12)-1));
            String zx=Double.toString(money);
            moneyToBePaidForLoan.setText(zx);
        }
        else if(weekly.isSelected()){
            Double x=Double.parseDouble(iLoan.getText());
            Double lo=Double.parseDouble(loanAmount.getText());
            money=lo*((x*Math.pow(x,52))/(Math.pow(x,52)-1));
            String zx=Double.toString(money);
            moneyToBePaidForLoan.setText(zx);
        }

    }


    @FXML
    void weekly(ActionEvent event) {
        annualy.setSelected(false);
        monthly.setSelected(false);
    }
    @FXML
    void monthly(ActionEvent event) {
        annualy.setSelected(false);
        weekly.setSelected(false);
    }
    @FXML
    void annualy(ActionEvent event) {
        weekly.setSelected(false);
        monthly.setSelected(false);
    }

    }
