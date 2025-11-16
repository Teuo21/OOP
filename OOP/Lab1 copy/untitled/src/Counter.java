import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type: ");
        String sentence = sc.nextLine().toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (Character.isLetter(c)) {
                if("aeiou".indexOf(c) != -1)
                    vowels++;
                else consonants++;
            }
        }
        System.out.println("vowels: " + vowels);
        System.out.println("consonants: " + consonants);
    }
}
