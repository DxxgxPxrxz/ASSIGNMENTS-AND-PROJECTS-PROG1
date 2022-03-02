import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1, number2, count, factor;
        System.out.println("Enter the first number");
        number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        number2 = scanner.nextInt();
        count = 0;
        factor = 0;

        while (count != (number2)) {
        factor += number1;
        ++count;
        }
        System.out.println("Your result is " + factor);
    }
}
