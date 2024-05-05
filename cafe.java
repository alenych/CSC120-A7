public class Cafe extends Building {
    private int nCoffeeOunces; 
    private int nSugarPackets;
    private int nCreams; 
    private int nCups;


    // Sets inventory values for cafe and its qualities
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 300;
        this.nSugarPackets = 600;
        this.nCreams = 450;
        this.nCups = 500;
        System.out.println("You have built a cafe: ☕");
    }

    // Prints available cafe options
    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + sellCoffee()\n + restock()");
    }


    // Sells a coffee when inventory allows it numerically, checks resources level and restocks if insufficient enough resources are left
    public void sellCoffee(int size, int nSugarPackets, int nCreams, int nCups){
       if(this.nCoffeeOunces<size || this.nSugarPackets<nSugarPackets || this.nCreams<nCreams || this.nCups<nCups){
        restock(300, 600, 450, 500);
        System.out.println("Restock required.");

       }else{
        this.nCoffeeOunces = nCoffeeOunces - size;
        this.nSugarPackets = this.nSugarPackets - nSugarPackets;
        this.nCreams = this.nCreams - nCreams;
        this.nCups = this.nCups - nCups;
        System.out.println("Coffee sold with " + size + " oz of coffee, " + nSugarPackets + " packet(s) of sugar, and " + nCreams + " serving(s) of cream.");
    }
    }

    //Overloaded coffee sale method that only offers black coffees, takes in coffee amount and cups only
       public void sellCoffee(int size, int nCups){
        if(this.nCoffeeOunces<size || this.nCups<nCups){
         restock(300, 500);
         System.out.println("Restock required.");

        }else{
            this.nCoffeeOunces = nCoffeeOunces - size;
            this.nCups = this.nCups - nCups;
            System.out.println("Coffee sold with " + size + " oz of coffee.");
        }
        
    }
    // Restocks lost resources when running too low for a sale
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    // Overloaded restock that only restocks coffee and cups
    private void restock(int nCoffeeOunces, int nCups){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nCups = nCups;
    }

    // Limits access to main floor of the cafe in up and down directions
    public void goUp(int nUp) {
        System.out.println("Access limited to current floor.");
    }
     
    public void goDown(int nDown) {
        System.out.println("Access limited to current floor.");
    }

    public static void main(String[] args) {
       Cafe ccCafe =  new Cafe("Campus Center Cafe", "Smith College", 1);
       System.out.println("Welcome to the Cafe! Please place your order at the service counter.");
       ccCafe.sellCoffee(4, 1);
       ccCafe.showOptions();
       ccCafe.enter();
       ccCafe.goDown(1);
       ccCafe.goUp(2);
       
    }
    
}