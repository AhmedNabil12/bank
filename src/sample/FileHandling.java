package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
    public static ArrayList<Account> readFile() throws FileNotFoundException {
        ArrayList<Account> accounts = new ArrayList<>();

        String file = "a.csv";
        File f = new File(file);
        try (Scanner sc = new Scanner(f)) {
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                System.out.println(line);
                String[] row = line.split(",");
                Account a = new Account();
                a.user = new UserInformation();
                a.user.setFirstName(row[0]);
                a.user.setLastName(row[1]);
                System.out.println(line);
                a.user.setEmail(row[2]);
                a.user.setPhoneNo(row[3]);
                a.user.setNID(row[4]);
                a.user.setAddress(row[5]);
                a.user.setOccupation(row[6]);
                a.user.setSex(row[7]);
                a.setAccountType(row[8]);
                a.setAccountNumber(row[9]);
                a.setBalance(Double.parseDouble(row[10]));
                accounts.add(a);
            }
        }
        return accounts;
    }

    public static  void saveFile(ArrayList<Account> accounts) throws FileNotFoundException {

        String file = "a.csv";
        File f = new File(file);
        PrintWriter pw = new PrintWriter(file);

        for (Account a : accounts) {
            pw.print(a.user.getFirstName() + ",");
            pw.print(a.user.getLastName() + ",");
            pw.print(a.user.getEmail() + ",");
            pw.print(a.user.getPhoneNo() + ",");
            pw.print(a.user.getNID() + ",");
            pw.print(a.user.getAddress() + ",");
            pw.print(a.user.getOccupation() + ",");
            pw.print(a.user.getSex() + ",");
            pw.print(a.accountType + ",");
            pw.print(a.getAccountNumber() + ",");

            pw.println(a.getBalance());
        }
        pw.close();

    }
}
