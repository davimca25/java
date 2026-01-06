import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        String word = "pizza";
        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("------------------------");
        System.out.println("  Java Hangman!");
        System.out.println("------------------------");

        while (wrongGuesses < 6) {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("Word: ");

            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.print("\nGuess the letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Congratulations! You guessed the letter");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }
                if (!wordState.contains('_')) {
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("word : " + word);
                    break;
                }
            } else {
                System.out.println("Wrong guess!");
                wrongGuesses++;
            }
        }
        if  (wrongGuesses >= 6) {
            System.out.println("GAMEOVER!");
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("word : " + word);
        }
    }
    static String getHangmanArt(int wrongGuesses) {
        return switch(wrongGuesses){
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                    O
                    
                    
                    """;
            case 2 -> """
                    O
                    |
                    
                    """;
            case 3 -> """
                    O
                   /|
                    
                    """;
            case 4 -> """
                    O
                   /|\\
                   
                    """;
            case 5 -> """
                    O
                   /|\\
                   /
                    """;
            case 6 -> """
                    xP
                   /|\\
                   / \\
                    """;
            default -> "";
        };
    }
}
