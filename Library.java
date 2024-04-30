import java.util.ArrayList;
import java.util.HashMap;

public class Library extends Building {
  private HashMap<String, Boolean> bookAvailable; // Maps titles to their availability
  private ArrayList<String> bookTitles;

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.bookTitles = new ArrayList<>();
    this.bookAvailable = new HashMap<>();
    System.out.println("You have built a library: 📖");
  }

  // Overloaded addTitle to include availability status
  public void addTitle(String title, boolean isAvailable) {
    if (!bookTitles.contains(title)) {
      bookTitles.add(title);
      bookAvailable.put(title, isAvailable);
    }
  }

  /* Method removes a book from the library */
  public String removeTitle(String title) {
    if (bookTitles.contains(title)) {
      bookTitles.remove(title);
      bookAvailable.remove(title);
      return title;
    }
    return null; // return null if the title doesn't exist
  }

  /* Method checks out a book from the library */
  public void checkOut(String title) {
    if (bookTitles.contains(title) && bookAvailable.get(title)) {
      bookAvailable.put(title, false);
    } else {
      System.out.println("Sorry, this title is not available to be borrowed");
    }
  }

  /* This method returns a book to the library */
  public void returnBook(String title) {
    if (bookTitles.contains(title) && !bookAvailable.get(title)) {
      bookAvailable.put(title, true);
    } else {
      System.out.println("Sorry, this title has already been returned");
    }
  }

  /* Method checks for titles in the library */
  public boolean containsTitle(String title) {
    return bookTitles.contains(title);
  }

  /* Method checks if a book is available */
  public boolean isAvailable(String title) {
    return bookTitles.contains(title) && bookAvailable.get(title);
  }

  // Overloaded printCollection to filter by availability
  public void printCollection(boolean onlyAvailable) {
    for (String title : bookTitles) {
      if (bookAvailable.get(title) == onlyAvailable) {
        System.out.println(title + " - Available: " + bookAvailable.get(title));
      }
}}}