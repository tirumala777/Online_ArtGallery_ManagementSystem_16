import java.util.HashMap;
import java.util.Map;

public class FeaturedArtists {

    private Map<String, String> artistsInfo;

    // Constructor to initialize with a map of artist names and their descriptions
    public FeaturedArtists() {
        artistsInfo = new HashMap<>();
        artistsInfo.put("Van Gogh", "Post-Impressionist painter famous for works like Starry Night.");
        artistsInfo.put("Pablo Picasso", "Spanish painter, one of the most influential artists of the 20th century.");
        artistsInfo.put("Leonardo da Vinci", "Renaissance artist known for works like Mona Lisa and The Last Supper.");
    }

    // Method to display all featured artists
    public void displayFeaturedArtists() {
        System.out.println("Featured Artists:");
        for (String artist : artistsInfo.keySet()) {
            System.out.println("- " + artist);
        }
    }

    // Method to view details of a specific artist
    public void viewArtistDetails(String artistName) {
        if (artistsInfo.containsKey(artistName)) {
            System.out.println(artistName + ": " + artistsInfo.get(artistName));
        } else {
            System.out.println("Artist not found in the featured artists list.");
        }
    }
}
