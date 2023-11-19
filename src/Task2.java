import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter a lower or uppercase letter:  ");
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);


        if(Character.isUpperCase(symbol)){
            System.out.println("The character is uppercase");
        }

        if(Character.isLowerCase(symbol)){
            System.out.println("The character is lowercase");
        }



    }
}
