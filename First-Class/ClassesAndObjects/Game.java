import java.util.Scanner;

// variables inside classes are called 'attributes'
// functions inside classes are called classes 'methods'
// explain what objects are 

/* HomeWork => add defense power and use totalPower = enemy's attck powers - own player's defense power */

public class Game {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        String [] playerParams = {"Name", "Total Life Power", "AttackPower"}; 
        
        Player firstPlayer = new Player();
        Player secondPlayer = new Player(); 

        for (int i = 0; i < playerParams.length; i++) { 

        } 
        System.out.println("Please enter player's TOTAL LIFE POWER ");
        String name = reader.nextLine();
        // println() prints the following line to the output screen

        System.out.println("Hello " + name + "\n I hope that you will enjoy the lesson :)");

    }
}

class Player {
    String playerName;
    double totalPower, attackPower;

    public Pleyer(String name, double energy, double attack) { 
        playerName = name;
        totalPower = energy;
        attackPower = attack;
    }

}

class Players_Actions {
    public static void attack(Player first, Player second) {
        double fightOutCome = (first.attackPower - second.totalPower);

        System.out.println("fight outcome is:" + fightOutCome);
        second.totalPower = (second.totalPower - fightOutCome);
    }
}