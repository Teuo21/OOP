import java.util.ArrayList;

public class University {
    private String name;
    private String location;
    private ArrayList<Author> authors = new ArrayList<>();

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addAuthor(Author a) {
        authors.add(a);
    }

    public double computeScore() {
        double total = 0;
        for (Author a : authors) total += a.computeScore();
        return total;
    }

    public String getName() {
        return name;
    }
}