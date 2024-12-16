package PraktikumPBO.Sesi4;

class Player {
    private String name;
    private int age;
    
    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayPlayerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Striker extends Player {
    private int speed;

    public Striker(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void displayStrikerInfo() {
        super.displayPlayerInfo();
        System.out.println("Position: Striker");
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Defender extends Player {
    private int legStrength;

    public Defender(String name, int age, int legStrength) {
        super(name, age);
        this.legStrength = legStrength;
    }

    public int getLegStrength() {
        return legStrength;
    }

    public void displayDefenderInfo() {
        super.displayPlayerInfo();
        System.out.println("Position: Defender");
        System.out.println("Leg Strength: " + legStrength + " kg");
    }
}

public class PemainBola {
    public static void main(String[] args) {
        Striker striker = new Striker("Cristiano", 35, 34);
        Defender defender = new Defender("Ramos", 34, 80);

        System.out.println("Striker Info:");
        striker.displayStrikerInfo();
        
        System.out.println();
        
        System.out.println("Defender Info:");
        defender.displayDefenderInfo();
    }
}
