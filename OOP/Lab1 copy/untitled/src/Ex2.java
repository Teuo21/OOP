import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ya fname: ");
        String fname = sc.nextLine();
        System.out.println("enter ya lname: ");
        String lname = sc.nextLine();
        System.out.println("enter ya CNP: ");
        String cnp = sc.nextLine();

        String password = fname.substring(0, 2).toLowerCase() + lname.substring(lname.length()-2).toUpperCase();
        System.out.println(password);
    }
}
