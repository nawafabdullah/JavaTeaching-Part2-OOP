import java.util.Scanner;

// variables inside classes are called 'attributes'
// functions inside classes are called classes 'methods'
// explain what objects are 

/* HomeWork => add defense power and use totalPower = enemy's attack powers - own player's defense power */

public class Game {

    public static void main(String[] args) {

        System.out.println("please enter the following for the FIRST player");
        String[] playerOneInputs = ExtractInputs();
        System.out.println("\nGreat! Now to the SECOND player ");
        String[] playerTwoInputs = ExtractInputs();

        Player firstPlayer = new Player(playerOneInputs[0], Double.parseDouble(playerOneInputs[1]),
                Double.parseDouble(playerOneInputs[2]));

        Player secondPlayer = new Player(playerTwoInputs[0], Double.parseDouble(playerTwoInputs[1]),
                Double.parseDouble(playerTwoInputs[2]));

        System.out.println(" Player's name: " + firstPlayer.playerName + "\n Player's Total Life Power: "
                + firstPlayer.totalPower + "\n Player's Attack Power: " + firstPlayer.attackPower);

        Players_Actions attack = new Players_Actions();

        while (true) {
            // System.out.println ("attacking is happening");
            attack.attack(firstPlayer, secondPlayer);
        }
    }

    public static String[] ExtractInputs() {

        Scanner reader = new Scanner(System.in);
        String[] playerParams = { "Name", "Total Life Power", "Attack Power" };

        String[] userParams = new String[3];
        String userInput;
        for (int i = 0; i < playerParams.length; i++) {
            System.out.println("player's " + playerParams[i]);
            userInput = reader.nextLine();
            userParams[i] = userInput;
        }
        // reader.nextLine();
        // reader.close();
        return userParams;
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
        System.out.println(" a fight is happening between:" + first.playerName + " And: " + second.playerName);
        double fightOutCome = (first.attackPower - second.totalPower);
        System.out.println("fight outcome is:" + fightOutCome);
        second.totalPower = (second.totalPower - fightOutCome);
    }
}