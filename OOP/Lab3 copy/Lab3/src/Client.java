import java.time.LocalDate;
import java.util.ArrayList;

public class Client implements Comparable<Client>, Storable {
    private String name;
    private LocalDate bday;
    private String CNP;
    private Address address;
    private String gender;
    private double height;
    private ArrayList<Account> accounts;

    public Client(String name, LocalDate bday, String CNP, Address address, String gender, double height) {
        this.name = name;
        this.bday = bday;
        this.CNP = CNP;
        this.address = address;
        this.gender = gender;
        this.height = height;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public boolean removeAccount(String iban) {
        return accounts.removeIf(a -> a.getIBAN().equals(iban));
    }

    public void printAccounts() {
        System.out.println("Accounts for " + name + ":");
        for (Account a : accounts) {
            System.out.println(" - " + a.getIBAN() + " | Balance: " + a.getAmount());
        }
    }

    @Override
    public int compareTo(Client o) {

        int result = this.name.compareTo(o.name);
        if (result != 0) return result;

        result = this.bday.compareTo(o.bday);
        if (result != 0) return result;

        result = this.gender.compareTo(o.gender);
        if (result != 0) return result;

        return Double.compare(this.height, o.height);
    }

    @Override
    public String toString() {
        return name + " | " + bday + " | " + gender + " | " + height;
    }

    @Override
    public void store(String file) {
        try (java.io.PrintWriter out = new java.io.PrintWriter(new java.io.FileWriter(file, true))) {
            out.println(this.toString());
        } catch (Exception e) {
            System.out.println("Error storing client to file: " + e.getMessage());
        }
    }
}