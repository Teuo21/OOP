import java.util.Calendar;

public abstract class Publication {
    protected String name;
    protected Calendar apparition;
    protected int numberOfAuthors;

    public Publication(String name, Calendar apparition, int numberOfAuthors) {
        this.name = name;
        this.apparition = apparition;
        this.numberOfAuthors = numberOfAuthors;
    }

    public abstract double computeScore();
}