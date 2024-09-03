package alphaGuessTheWord;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("Word Guessing Game");
        int maximumTries = 3;
        String answer = "the quick brown fox";
        ArrayList<Character> correctGuesses = new ArrayList<Character>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < maximumTries; i++) {
            for (int j = 0; j < answer.length(); j++) {
                char currentChar = answer.charAt(j);
                if(answer.charAt(j) == ' '){
                    System.out.print(" ");
                }
                else if(correctGuesses.contains(currentChar)){
                    System.out.print(currentChar);
                }
                else{
                    System.out.print("?");
                }
            }
            System.out.println();

            System.out.println("Guess one alphabet or key in zero to guess the phrase: ");
            char alphabet = scanner.next().charAt(0);

            if (alphabet == '0') {
                // consume the trailing newline
                scanner.nextLine();
                System.out.println("Please enter the full phrase: ");
                String playerAnswer = scanner.nextLine();
                if (playerAnswer.equals(answer)) {
                    System.out.println("Congratulations, you got it right!");
                } else {
                    System.out.println("Sorry, that's not correct. Better luck next time.");
                }
                return;
            }

            if (answer.indexOf(alphabet)>=0){
                System.out.println("Alphabet is in the answer");
                correctGuesses.add(alphabet);
            }
            else{
                System.out.println("Sorry, alphabet not in the answer");
            }
        }
        scanner.nextLine();

        System.out.println("You have used up all your tries!");

        System.out.println("Please enter the full phrase: ");
        String playerAnswer = scanner.nextLine();

        if (playerAnswer.equalsIgnoreCase(answer)) {
            System.out.println("Congratulations, you got it right!");
        } else {
            System.out.println("Sorry, that's incorrect. The answer is: " + answer);
        }

    }
}
