import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter a character:  ");

        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);

        if(Character.isLetter(symbol)){
            System.out.println("This is a letter");
        }

        if(Character.isDigit(symbol)){
            System.out.println("This is a number");
        }

        if(Character.isWhitespace(symbol)){
            System.out.println("This is a space");
        }





    }
}
