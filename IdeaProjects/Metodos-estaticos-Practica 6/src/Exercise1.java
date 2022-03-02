import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("What do you want to do? \n1. Encrypt\n2. Decrypt\n0. Exit");

            int option = scanner.nextInt();

            if (option == 1) {

                Scanner s = new Scanner(System.in);
                System.out.println("Message: ");
                String message = Utility.Refactor(s.nextLine());

                System.out.println("Password: ");
                String password = Utility.Refactor(s.nextLine());

                String lengthen_password = Utility.lengthenPassword(password, message);
                String encrypt = Utility.Encrypt(message, lengthen_password, false);
                System.out.println("Cryptogram:");
                System.out.println(encrypt);
            }
            if (option == 2) {

                Scanner c = new Scanner(System.in);
                System.out.println("Cryptogram: ");
                String encrypt2 = Utility.Refactor(c.nextLine());

                System.out.println("Password: ");
                String password2 = Utility.Refactor(c.nextLine());

                String lengthen_password2 = Utility.lengthenPassword(password2, encrypt2);
                String message2 = Utility.Encrypt(encrypt2, lengthen_password2, true);
                System.out.println("Message:");
                System.out.println(message2);
            }


    }
}