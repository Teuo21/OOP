import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Bucharest", 10, "Main Street");
        Address address1 = new Address("Malta", 11, "SECONDS Street");
        Address address2 = new Address("Aici", 12, "Second Street");
        Address address3 = new Address("Acolo", 13, "Third Street");
        Address address4 = new Address("Dincolo", 14, "Fourth Street");
        Address address5 = new Address("Inainte", 105, "SoOnSoForth Street");
        Address address6 = new Address("AA", 104, "Ac Street");
        Address address7 = new Address("BB", 103, "Bac Street");

        Client c1 = new Client("Alice", LocalDate.of(1998, 5, 12),"1091", address, "F", 1.70);
        Client c2 = new Client("Bob", LocalDate.of(1997, 8, 22), "2134", address1,  "M", 1.80);
        Client c3 = new Client("Charlie", LocalDate.of(1995, 3, 10), "21314", address2, "M", 1.75);
        Client c4 = new Client("Alice", LocalDate.of(2000, 1, 1), "21314", address3,"F", 1.65);
        Client c5 = new Client("Alice", LocalDate.of(1998, 5, 12), "21314", address4,"M", 1.70);
        Client c6 = new Client("Alice", LocalDate.of(1998, 5, 12), "21334", address5,"F", 1.60);
        Client c7 = new Client("Bob", LocalDate.of(1997, 8, 22), "2133234", address6,"M", 1.75);
        Client c8 = new Client("Charlie", LocalDate.of(1995, 3, 10), "2112334", address7,"M", 1.75); // identical to p3 for equality test

        System.out.println("\n--- Individual compareTo() tests ---");
        System.out.println("Different names (Alice vs Bob): " + c1.compareTo(c2));
        System.out.println("Same name, different birthday (Alice 1998 vs Alice 2000): " + c1.compareTo(c4));
        System.out.println("Same name & birthday, different gender (Alice F vs Alice M): " + c1.compareTo(c5));
        System.out.println("Same name, birthday, gender, different height (1.70 vs 1.60): " + c1.compareTo(c6));
        System.out.println("Exactly equal persons (Charlie vs Charlie): " + c3.compareTo(c8));

        List<Client> people = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8));
        System.out.println("\n--- Before sorting ---");
        for (Client p : people) {
            System.out.println(p);
        }

        Collections.sort(people);

        System.out.println("\n--- After sorting (by name, birthday, gender, height) ---");
        for (Client p : people) {
            System.out.println(p);
        }

        System.out.println("\n--- Equality check ---");
        System.out.println("c3.compareTo(c8) == 0 ? " + (c3.compareTo(c8) == 0));

        c1.store("clients.txt");
        c2.store("clients.txt");
        c5.store("clients.txt");
        c7.store("clients.txt");

        System.out.println("Clients written to file 'clients.txt'");
    }

    //        Address address = new Address("Bucharest", 10, "Main Street");
//        Client client = new Client("Gigi Poka", LocalDate.of(1998, 5, 12), "1980512123456", address, "male", 1.78);
//        DebitAccount debit = new DebitAccount("RO1BNK01", 1000);
//        CreditAccount credit = new CreditAccount("R01BNK02", 500, 1000);
//
//        Address address1 = new Address("Sc", 0, "Man Street");
//        Client client1 = new Client("Ggi Pka", LocalDate.of(1938, 5, 11), "198051212356", address1, "female", 1.50);
//        DebitAccount debit1 = new DebitAccount("RO1BNK03", 1000);
//        CreditAccount credit1 = new CreditAccount("R01BNK04", 500, 1000);
//
//        System.out.println("\n--- Testing compareTo() by amount, then IBAN ---");
//        System.out.println("debit vs credit: " + debit.compareTo(credit));
//        System.out.println("credit vs debit: " + credit.compareTo(debit));
//        System.out.println("debit vs debit1 (same amount): " + debit.compareTo(debit1));
//        System.out.println("debit1 vs debit (same amount): " + debit1.compareTo(debit));
//
//        List<Account> accounts = new ArrayList<>();
//        accounts.add(debit);
//        accounts.add(credit);
//        accounts.add(debit1);
//        accounts.add(credit1);
//
//        Collections.sort(accounts);
//
//        System.out.println("\n--- Accounts sorted by amount, then IBAN ---");
//        for (Account a : accounts) {
//            System.out.println(a.getIBAN() + " -> " + a.getAmount());
//        }
//        client.addAccount(debit);
//        client.addAccount(credit);
//        System.out.println(client);
//        client1.addAccount(debit1);
//        client1.addAccount(credit1);
//        System.out.println(client1);
//        client.printAccounts();
//        client1.printAccounts();
//        System.out.println("Compare credit: " + credit.compareTo(credit));
//        System.out.println("Compare debit: " + debit.compareTo(debit1));

//        System.out.println("Debit withdraw 300 " + debit.withdraw(300));
//        System.out.println("Debit withdraw 800 " + debit.withdraw(800));
//        System.out.println("Credit withdraw 1200 " + credit.withdraw(1600));
//        System.out.println("Credit withdraw 500 " + credit.withdraw(500));
//        client.printAccounts();
//        System.out.println("\n Removing Account ");
//        System.out.println("Removing debit account: " + client.removeAccount("RO1BNK01"));
//        client.printAccounts();
}