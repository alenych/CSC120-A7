import java.util.ArrayList;

// Extends building class to house class
public class House extends Building {
  boolean hasElevator;
  boolean hasDiningRoom;
  ArrayList<String> residents;

  // Sets up the house class
  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator){
    super(name, address, nFloors);
    this.hasElevator = hasElevator;
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }

  // Prints options available in the house
  public void showOptions() {
    System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + moveIn()\n + moveOut()");
}

  // Dining room accessor
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
    }
  // Residents accessor
  public int nResidents(){
    return this.residents.size();
  }
// Elevator accessor
  public int hasElevator(){
    return this.hasElevator();
  }

  // Checks if an elevator exists and allows movement up or down if so
  public void goUp(int nUp) {
    if (this.hasElevator) {
    this.goToFloor(this.activeFloor + nUp);
}else{
    this.goToFloor(this.activeFloor + 1);
}
}
  
public void goDown(int nDown) {
  if (this.hasElevator){
    this.goToFloor(this.activeFloor - nDown);
}else{
    this.goToFloor(this.activeFloor - 1);
}
}


// Adds residents to house
public void moveIn(String name){
  this.residents.add(name);
  System.out.println(name + " has moved in.");
}

//Overloaded moveIn method that states the floor a resident moves to 
public void moveIn(String name, int Floor){
  this.residents.add(name);
  System.out.println(name + " has moved into floor # " + Floor);
}

// Removes residents to house
public String moveOut(String name){
  this .residents.remove(name);
  System.out.println(name + " has moved out.");
  return name;
  
}

//Overloaded moveOut method that states the floor a resident moves to
public void moveOut(String name, int Floor){
  this.residents.remove(name);
  System.out.println(name + " has moved out of floor # " + Floor);
} 

// Checks if someone is a resident, returns true if so and false if not
public boolean isResident(String name){
  if (this.residents.contains(name)){
    System.out.println(name + " is a resident.");
    return true;
    
}
    else{
      return false;
    }
  } 


  public static void main(String[] args) {
    House myHouse = new House("Sessions House", "1 Chapin Street", 3, true, true);
    System.out.println("Welcome to the house! We hope you enjoy your stay.");
    myHouse.moveIn("Angelina", 3);
    myHouse.moveIn("Rachel", 2);
    myHouse.moveIn("Minty", 3);
    myHouse.moveIn("Marybella", 2);
    myHouse.moveOut("Dinah", 2);
    myHouse.isResident("Daliyah");
    myHouse.enter();
    myHouse.goUp();
    myHouse.showOptions();
  }

}