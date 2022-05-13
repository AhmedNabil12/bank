package sample;

public class BankingServices {
    double electricityBill;
    double waterBill;
    double internetBill;
    double insuranceBill;
    double licenseFeesBill;
    double autoLoan;
    double bankingServicesFees=65;

    public BankingServices() {
    }

    public BankingServices(double electricityBill, double waterBill, double internetBill, double insuranceBill, double licenseFeesBill, double bankingServicesFees,double autoLoan) {
        this.electricityBill = electricityBill;
        this.waterBill = waterBill;
        this.internetBill = internetBill;
        this.insuranceBill = insuranceBill;
        this.licenseFeesBill = licenseFeesBill;
        this.bankingServicesFees = bankingServicesFees;
        this.autoLoan=autoLoan;
    }

    public double getElectricityBill() {
        return electricityBill;
    }

    public void setElectricityBill(double electricityBill) {
        this.electricityBill = electricityBill;
    }

    public double getWaterBill() {
        return waterBill;
    }

    public void setWaterBill(double waterBill) {
        this.waterBill = waterBill;
    }

    public double getInternetBill() {
        return internetBill;
    }

    public void setInternetBill(double internetBill) {
        this.internetBill = internetBill;
    }

    public double getInsuranceBill() {
        return insuranceBill;
    }

    public void setInsuranceBill(double insuranceBill) {
        this.insuranceBill = insuranceBill;
    }

    public double getLicenseFeesBill() {
        return licenseFeesBill;
    }

    public void setLicenseFeesBill(double licenseFeesBill) {
        this.licenseFeesBill = licenseFeesBill;
    }

    public double getBankingServicesFees() {
        return bankingServicesFees;
    }

    public double getAutoLoan() {
        return autoLoan;
    }

    public void setAutoLoan(double autoLoan) {
        this.autoLoan = autoLoan;
    }
}
