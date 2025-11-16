//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double result;
        double otherresult;
        double finalresult;
        result = ((double) 1/2 + (double) 3 /17 * 5/2 + Math.sqrt((double) 1 /2)) / (2/Math.pow(7, 3));
        otherresult = ((double) 9/2 + (double)3/4) / (1/Math.pow(3, 3));
        System.out.println(result);
        System.out.println(otherresult);
        finalresult = result * otherresult;
        System.out.println(finalresult);
    }
}