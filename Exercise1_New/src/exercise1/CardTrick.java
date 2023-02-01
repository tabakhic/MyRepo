package exercise1;

import java.util.Random;
import java.util.Scanner; 

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @Author Cyrus Tabakhi
 * jan 25, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of the card (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Enter the suit of the card (1-4): ");
        int suit = scanner.nextInt() - 1;

        Card userCard = new Card(value, Card.SUITS[suit]);
        for (Card card : hand) {
            if (card.equals(userCard)) {
                card.printInfo();
                break;
            }
        }
        scanner.close();
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Cyrus Tabakhi Jan 2023
     */
    //done
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Cyrus, but you can call me Cy");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active, physically");
        System.out.println("-- To start my day of right by following a set routine");
	System.out.println();	

        System.out.println("My hobbies!!!!!!:");
        System.out.println("-- Learning!!!!");
        System.out.println("-- Theology!!!!!");
        System.out.println("-- Reading/Watching TV!!!!");
        System.out.println("-- Cooking");

        System.out.println();
        
    
    }

}
