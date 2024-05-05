 /* This is a stub for the Library class */
 import java.util.Hashtable;

 // Extends building to library class 
 public class Library extends Building {
 
   // Sets up hashtable for the collection of books
     private Hashtable<String, Boolean> collection;
 
     public Library(String name, String address, int nFloors) {
       super(name, address, nFloors);
       this.collection = new Hashtable<String, Boolean>();
       System.out.println("You have built a library: 📖");
 
       }
 
     // Prints list of options available at the library
     public void showOptions() {
         System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + addTitle()\n + checkOut\n + returnBook\n + printCollection()");
     }
 
     // Method to add book title to library collection
     public void addTitle(String title){
       this.collection.put(title, true);
       }
 
     // Allows books to be removed from collection
     public void checkOut(String title){
       if(containsTitle(title) && isAvailable(title)){
       this.collection.replace(title, false);
       System.out.println(title + " has been checked out.");
        }
       }
 
     // Overloaded checkOut method that allows two books to be checked out at once
       public void checkOut(String title, String titleTwo){
         if(containsTitle(title) && isAvailable(title)){
         this.collection.replace(title, false);
         System.out.println(title + " has been checked out.");
          }
          if(containsTitle(titleTwo) && isAvailable(titleTwo)){
           this.collection.replace(titleTwo, false);
           System.out.println(titleTwo + " has been checked out.");
         }
       }
 
     // Returns true if the title exists in collection
     public boolean containsTitle(String title){
       return this.collection.containsKey(title);
       }
 
     // Checks if a book is available for checkout
     public boolean isAvailable(String title){
       return this.collection.get(title)==true;
  
       }
 
     // Allows books to be returned to collection
     public void returnBook(String title){
       this.collection.replace(title, true);
       System.out.println(title + " has been returned.");
       }
 
     // Overloaded returnBook method that allows two books to be returned at once
     public void returnBook(String title, String titleTwo){
       this.collection.replace(title, true);
       this.collection.replace(titleTwo, true);
       System.out.println(title + " has been returned.");
       System.out.println(titleTwo +  " has been returned.");
         }
     
 
     // Prints collection and book status
     public void printCollection(){
       System.out.println("Library Collection Includes: " + this.collection.toString());
       }
     
       // Allows movement between library floors up or down
       public void goUp(int nUp) {
         this.goToFloor(this.activeFloor + nUp);
     }
      
     public void goDown(int nDown) {
         this.goToFloor(this.activeFloor - nDown);
     }
   
     public static void main(String[] args) {
       Library Neilson = new Library("Neilson Library", "Smith College", 4);
       Neilson.addTitle("The Gambler");
       Neilson.addTitle("Kokoro");
       Neilson.addTitle("Mansfield Park");
       Neilson.printCollection();
       Neilson.checkOut("The Gambler", "Kokoro");
       Neilson.containsTitle("Kokoro");
       Neilson.returnBook("The Gambler", "Kokoro");
       Neilson.printCollection();
       Neilson.enter();
       Neilson.goUp(3);
       Neilson.goDown(2);
       Neilson.showOptions();
     
     }
   
   }
 