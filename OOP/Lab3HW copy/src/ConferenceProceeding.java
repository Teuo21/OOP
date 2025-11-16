import java.util.Calendar;

public class ConferenceProceeding extends Publication {
    private String volumeName;
    private boolean indexed;

    public ConferenceProceeding(String name, Calendar apparition, int numberOfAuthors, String volumeName, boolean indexed) {
        super(name, apparition, numberOfAuthors);
        this.volumeName = volumeName;
        this.indexed = indexed;
    }

    @Override
    public double computeScore() {
        return indexed ? 0.25 / numberOfAuthors : 0.2 / numberOfAuthors;
    }
}