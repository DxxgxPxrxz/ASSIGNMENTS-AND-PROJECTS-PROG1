import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class GetBiggerValue {

    public static void main(String[] args) {
        System.out.println("Enter the 6 numbers");
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = new Integer[6];

        for(int i = 0; i < numbers.length ; i ++) {
            System.out.println("Enter the number["+(i+1)+"]:");
            numbers[i] = scanner.nextInt();
        }

        int max = Collections.max(Arrays.asList(numbers));
        int min = Collections.min(Arrays.asList(numbers));

        System.out.println("The maximum number: " + max);
        System.out.println("The minimum number: " + min);

    }
}