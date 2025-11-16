import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        University uni = new University("Politehnica University", "Bucharest");

        Author a1 = new Author("Iuli Deaconu", uni);
        Author a2 = new Author("Cal Petersburg", uni);
        uni.addAuthor(a1);
        uni.addAuthor(a2);

        Calendar c = Calendar.getInstance();

        a1.addPublication(new Journal("Paper1", c, 2, "Nature", 5.2));
        a1.addPublication(new Journal("Paper2", c, 3, "Science", 4.5));
        a1.addPublication(new ConferenceProceeding("Conf1", c, 2, "Vol1", true));
        a1.addPublication(new ConferenceProceeding("Conf2", c, 3, "Vol2", false));

        a2.addPublication(new Journal("Paper3", c, 2, "Ghost", 3.8));
        a2.addPublication(new Journal("Paper4", c, 1, "LAS", 6.1));
        a2.addPublication(new ConferenceProceeding("Conf3", c, 1, "AAAI", true));
        a2.addPublication(new ConferenceProceeding("Conf4", c, 2, "ICLR", false));

        System.out.println(a1.getName() + " score: " + a1.computeScore());
        System.out.println(a2.getName() + " score: " + a2.computeScore());
        System.out.println("University score: " + uni.computeScore());
    }
}