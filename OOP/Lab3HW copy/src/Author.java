import java.util.ArrayList;

public class Author {
    private String name;
    private University university;
    private ArrayList<Publication> publications = new ArrayList<>();

    public Author(String name, University university) {
        this.name = name;
        this.university = university;
    }

    public void addPublication(Publication p) {
        publications.add(p);
    }

    public double computeScore() {
        double score = 0;
        for (Publication p : publications) score += p.computeScore();
        return score;
    }

    public String getName() {
        return name;
    }
}