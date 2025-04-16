// Superclass
class Player {
    // Attributes
    protected String name;
    protected int age;
    protected String position;

    // Constructor
    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

 
    
    public void play() {
        System.out.println(name + " is playing as a " + position + ".");
    }

    // Method to train
    public void train() {
        System.out.println(name + " is training.");
    }
}

// Subclass for Cricket Player
class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing cricket as a " + position + ".");
    }
}

// Subclass for Football Player
class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing football as a " + position + ".");
    }
}

// Subclass for Hockey Player
class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing hockey as a " + position + ".");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating instances of each player type
        Cricket_Player cricketPlayer = new Cricket_Player("John", 25, "Batsman");
        Football_Player footballPlayer = new Football_Player("Mike", 22, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Sarah", 28, "Defense");

        // Calling methods for each player
        cricketPlayer.play();
        cricketPlayer.train();

        footballPlayer.play();
        footballPlayer.train();

        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}