
import java.util.Random;
import java.util.Scanner;

public class SecondJava{
    static Player player1 = new Player();
    static Player player2 = new Player();
    static Scanner scanner = new Scanner(System.in);

    public void askName(Player pl) {
            System.out.print("Whats your name: ");
            String name = scanner.nextLine();
            pl.setName(name);
    }

    public void askGender(Player pl) {
            System.out.print("Whats your gender: ");
            String gender = scanner.nextLine();
            pl.setGender(gender);
    }
    public static void main(String[] args) {
        SecondJava m = new SecondJava();
        System.out.println("Welcome to the Dice game");

        //First Player initilizing
        System.out.println("Player 1");
        m.askName(player1);
        m.askGender(player1);

        System.out.println("-------------------");

        // //Second Player initilizing
        System.out.println("Player 2");
        m.askName(player2);
        m.askGender(player2);
        // //Getting the players info
        System.out.println("Here are the two players info");
        System.out.println("");
        System.out.println("Player 1");
        player1.getPlayer();
        System.out.println("");
        System.out.println("Player 2");
        player2.getPlayer();

        //init rolldice method
        Random rand = new Random();
        int diceRolled;
        char rollDiceAnswer;
        int round=1;
        System.out.println("--------------------");

        while (true) { 
            System.out.println("Roll the dices? , (Y / N) ");
            rollDiceAnswer = scanner.nextLine().charAt(0);
            if (rollDiceAnswer == 'y') {
                diceRolled = rand.nextInt(6)+1;
                player1.setDiceRolled(diceRolled);
                diceRolled = rand.nextInt(6)+1;
                player2.setDiceRolled(diceRolled);
            }else{
                System.out.println("The Game Ended!");
                break;
            }
    
            System.out.println("Round "+ round);
            System.out.print(player1.getName()+" got: ");
            System.out.println(player1.getDiceRolled());
            System.out.print(player2.getName()+" got: ");
            System.out.println(player2.getDiceRolled());
    
            if(player1.getDiceRolled() > player2.getDiceRolled()){
                System.out.println(player1.getName()+" wins this round!");
                player1.setPoints();
            }else{
                System.out.println(player2.getName()+" wins this round!");
                player2.setPoints();
            }   

            round++;
        }
    
                System.out.println("lets see who won then...");
                // checking to see who got more points
                if(player1.getPoints() < player2.getPoints()){
                    System.out.println(player2.getName() + " won more rounds");
                    System.out.println(player2.getName() + " won " + player2.getPoints() + " rounds");
                    System.out.println(player1.getName() + " won " + player1.getPoints() + " rounds");
                }else{
                    System.out.println(player1.getName() + " won more rounds");
                    System.out.println(player1.getName() + " won " + player1.getPoints() + " rounds");
                    System.out.println(player2.getName() + " won " + player2.getPoints() + " rounds");   
                }
                System.out.println("You played " + (round-1) + " rounds");

    }
}