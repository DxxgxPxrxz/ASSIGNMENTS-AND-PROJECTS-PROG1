import java.io.IOException;
import java.util.Scanner;


public class CountLetter {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String text;
        char character;
        int times, times_uppercase = 0;
        do {
            System.out.println("Enter text: ");
            text = scanner.nextLine();
        } while (text.isEmpty());
        {
            System.out.print("Enter character: ");
            character = (char) System.in.read();
            times_uppercase = count_character_uppercase(text, character);
            times = count_character(text, character);
            System.out.println("The character " + character + " appears " + (times + times_uppercase) + " times");
        }
    }

    public static int count_character(String text, char character) {

        int pos, count = 0;
        pos = text.indexOf(character);

        while (pos != -1) {
            count++;
            pos = text.indexOf(character, pos + 1);
        }
        return count;
    }

    public static int count_character_uppercase(String text, char character) {

        int pos, count = 0;
        pos = text.indexOf(Character.toUpperCase(character));

        while (pos != -1) {
            count++;
            pos = text.indexOf(Character.toUpperCase(character), pos + 1);
        }
        return count;
    }
}