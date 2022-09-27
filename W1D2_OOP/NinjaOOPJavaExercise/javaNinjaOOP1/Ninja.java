class Ninja {

// MEMBER VARIABLES
    private int health;
    private String name;
    public static int numberOfNinjas = 0;
    private int power; // ? 0

// CONSTRUCTOR
    public Ninja(String name){
        this.name = name;
        this.health = 100;
        this.numberOfNinjas++;
    }

    public Ninja() {
        this.name = "anonymous";
        this.health = 80;
        this.numberOfNinjas++;

    }

// METHODS
    public void displayStats(){
        System.out.println("Name: " + this.getName());
        System.out.println("Health:" + this.getHealth());
        System.out.println("power:" + this.getPower());
    }

    public void eatStrawberry(){
        this.health += 10;
    }

// GETTERS AND SETTERS
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public int getPower(){
        return this.power;
    }
    // setter
    public void setPower(int pow) {
        this.power += pow;

    }
}