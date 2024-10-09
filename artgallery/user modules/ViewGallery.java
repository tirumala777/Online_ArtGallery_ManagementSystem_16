import java.util.List;

public class ViewGallery {

    private List<String> artworks;

    // Constructor to initialize the gallery with a list of artworks
    public ViewGallery(List<String> artworks) {
        this.artworks = artworks;
    }

    // Method to display all the artworks in the gallery
    public void displayGallery() {
        System.out.println("Welcome to the Art Gallery! Here are the available artworks:");
        for (String artwork : artworks) {
            System.out.println("- " + artwork);
        }
    }

    // Method to search for an artwork by title
    public void searchArtwork(String title) {
        System.out.println("Searching for artwork: " + title);
        boolean found = false;
        for (String artwork : artworks) {
            if (artwork.equalsIgnoreCase(title)) {
                System.out.println("Artwork found: " + artwork);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Artwork not found in the gallery.");
        }
    }
}
