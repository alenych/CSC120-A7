public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    // Original Constructor
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    // Overloaded constructor with default stock values
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 100;
        this.nCreams = 100;
        this.nCups = 100;
        System.out.println("You have built a cafe with default stock values: ☕");
    }

    // Original sellCoffee method
    public void sellCoffee(int size, int packetsOfSugar, int creams) {
        if (this.nCoffeeOunces >= size && this.nSugarPackets >= packetsOfSugar && this.nCreams >= creams && this.nCups >= 1) {
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= packetsOfSugar;
            this.nCreams -= creams;
            this.nCups -= 1;
            System.out.println("Your coffee is ready! Enjoy!");
        } else {
            System.out.println("Sorry we are missing ingredients for that order.");
            restock();
        }
    }

    // Overloaded sellCoffee method to sell plain coffee
    public void sellCoffee(int size) {
        sellCoffee(size, 0, 0);
    }

    // Overloaded sellCoffee method with a boolean for size (large or standard)
    public void sellCoffee(boolean large) {
        int size = large ? 16 : 8; // Assume large is 16 ounces, standard is 8 ounces
        sellCoffee(size, 0, 0);
    }

    private void restock() {
        this.nCoffeeOunces += 50;
        this.nSugarPackets += 50;
        this.nCreams += 50;
        this.nCups += 50;
        System.out.println("Restock complete.");
    }
}