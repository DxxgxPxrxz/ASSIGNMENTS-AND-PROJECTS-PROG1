import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = 0, i, number;
        System.out.println("Enter number: ");
        number = reader.nextInt();
        for (i = 1; i <= number; i++) {
            if (number % i == 0) {
                a++;
            }
        }
        if (a != 2) {
            System.out.println("It's not a prime number");
        } else {
            System.out.println("It's a prime number");
        }

    }

}