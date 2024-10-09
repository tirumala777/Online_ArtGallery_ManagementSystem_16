import java.util.ArrayList;
import java.util.List;

public class ManageCollection {

    private List<String> userCollection;

    // Constructor to initialize the user's collection
    public ManageCollection() {
        this.userCollection = new ArrayList<>();
    }

    // Method to add an artwork to the user's collection
    public void addArtwork(String artwork) {
        userCollection.add(artwork);
        System.out.println(artwork + " has been added to your collection.");
    }

    // Method to remove an artwork from the user's collection
    public void removeArtwork(String artwork) {
        if (userCollection.remove(artwork)) {
            System.out.println(artwork + " has been removed from your collection.");
        } else {
            System.out.println(artwork + " is not in your collection.");
        }
    }

    // Method to display all the artworks in the user's collection
    public void displayCollection() {
        System.out.println("Your Art Collection:");
        if (userCollection.isEmpty()) {
            System.out.println("You don't have any artworks in your collection.");
        } else {
            for (String artwork : userCollection) {
                System.out.println("- " + artwork);
            }
        }
    }
}
