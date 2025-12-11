import java.util.*;

public class AudioCD {

    private String cdTitle;
    private String[] artists = new String[4];
    private int releaseYear;
    private String genre;
    private float condition;

    // Default constructor
    public AudioCD() {
        cdTitle = "";
        artists = new String[]{"", "", "", ""};
        releaseYear = 1980;
        genre = "";
        condition = 0.0f;
    }

    // Overloaded constructor
    public AudioCD(String cd, String[] a, int r, String g, float cond) {
        cdTitle = cd;

        if (a.length > 4) {
            System.out.println("Warning: only first 4 artists stored.");
            for (int i = 0; i < 4; i++) {
                artists[i] = a[i];
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                artists[i] = a[i];
            }
        }

        releaseYear = r < 1980 ? 1980 : r;
        genre = g;
        condition = (cond < 0.0f || cond > 5.0f) ? 0.0f : cond;
    }

    // Getters
    public String getCdTitle() {
        return cdTitle;
    }

    public String[] getArtists() {
        return artists;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public float getCondition() {
        return condition;
    }

    // Display method
    public void display() {
        System.out.println(cdTitle + ", " + releaseYear);
        for (int i = 0; i < artists.length; i++) {
            if (!artists[i].isEmpty()) {
                System.out.println("Artist (#" + (i + 1) + "): " + artists[i]);
            }
        }
        System.out.println("Genre: " + genre);
        System.out.println("Condition: " + condition);
    }
}
