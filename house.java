import java.util.ArrayList;
import java.util.List; // Added the import statement for List

public class House extends Building {
    private boolean hasDiningRoom;
    private ArrayList<String> residents;

    public House(String name, String address, int nFloors, boolean hasDiningRoom) {
        super(name, address, nFloors);
        this.hasDiningRoom = hasDiningRoom;
        this.residents = new ArrayList<>();
        System.out.println("You have built a house: 🏠");
    }

    // Overloaded constructor to initialize with a list of residents
    public House(String name, String address, int nFloors, boolean hasDiningRoom, List<String> initialResidents) {
        this(name, address, nFloors, hasDiningRoom);
        this.residents.addAll(initialResidents);
        System.out.println("Initialized house with residents: " + initialResidents);
    }

    public boolean hasDiningRoom() {
        return hasDiningRoom;
    }

    public int nResidents() {
        return residents.size();
    }

    public String moveOut(String name) {
        if (residents.contains(name)) {
            residents.remove(name);
            return name + " has moved out.";
        }
        return "No such resident found."; // Handle the case when the name is not in the list
    }

    // Overloaded moveIn method to accept multiple residents
    public void moveIn(List<String> newResidents) {
        for (String resident : newResidents) {
            if (!residents.contains(resident)) {
                residents.add(resident);
            }
        }
    }

    public boolean isResident(String person) {
        return residents.contains(person);
    }
}