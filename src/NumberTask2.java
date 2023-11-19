import java.util.Scanner;

public class NumberTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 2, 8, or 16 ");
        int numberSystem = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a number in the number system you chose ");
        String number = scanner.nextLine();

        int conversion = Integer.valueOf(number, numberSystem);

        System.out.println(conversion);





    }
}
