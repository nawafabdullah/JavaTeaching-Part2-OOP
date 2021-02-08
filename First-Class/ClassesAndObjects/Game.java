import java.util.Scanner;

// variables inside classes are called 'attributes'
// functions inside classes are called classes 'methods'
// explain what objects are 

/* HomeWork => add defense power and use totalPower = enemy's attack powers - own player's defense power */

public class Game {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        String[] playerParams = { "Name", "Total Life Power", "Attack Power" };

        Player firstPlayer = new Player();
        Player secondPlayer = new Player();

        String userInput;
        for (int i = 0; i < playerParams.length; i++) {
            System.out.println("please enter the player's " + playerPrams[i]);

            userInput = reader.nextLine();
            if (i == 0)
                firstPlayer.playerName = userInput;
            else if (i == 1)
                firstPlayer.totalPower = Double.parseDouble(userInput);
            else
                firstPlayer.attackPower = Double.parseDouble(userInput);
            ;
        }

        System.out.println("Player's name: " + firstPlayer.playerName + "\n Player's Total Life Power: "
                + firstPlayer.totalPower + "\n Player's Attack Power: " + firstPlayer.attackPower);

    }
}

class Player {
    String playerName;
    double totalPower, attackPower;

    public Player(String name, double energy, double attack) {
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