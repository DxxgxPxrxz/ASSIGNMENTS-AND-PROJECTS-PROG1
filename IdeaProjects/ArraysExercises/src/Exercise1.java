import java.util.Arrays;
import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args){
        System.out.println("Define the range of the numbers (more than 100)");
        Scanner x = new Scanner(System.in);
        int random_number = 0;
        int[] numbers = new int[100];

        if ((x.nextInt()) < 100); {
            System.out.println("The number is less than 100");
        }
        int limit = x.nextInt();

        for (int i = 0; i < numbers.length; i++){
            random_number = (int)(Math.random()*limit+1);
            if(random_number != numbers[i]){
                numbers[i] = random_number;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}