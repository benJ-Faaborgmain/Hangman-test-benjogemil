import java.util.Random;
import java.util.Scanner;

public class Hangman {

    private static final String[] words = {"cat", "dog", "bird", "tree", "house"};
    private static final String hangmanFigure = "_________ \n|/       \n|        \n|        \n|        \n|        \n|________\n";

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String word = words[random.nextInt(words.length)];
        char[] hiddenWord = new char[word.length()];
        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '-';
        }

        int wrongGuesses = 0;

        while (true) {
            System.out.println(hangmanFigure);
            printHiddenWord(hiddenWord);

            System.out.print("Guess a letter: ");
            char guess = scanner.nextLine().charAt(0);

          