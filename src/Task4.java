import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter your name  ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        System.out.println("\tHello "+name+"!\n" +
                "\tI see how much progress you've made in learning Java! Topics such \nas " +
                "\"Variables\", \"Conditional operators\", \"Loops\", \"Objects and Classes\" and a " +
                "bunch of \nrelated smaller topics are already behind! (Do you remember " +
                "arithmetic operations? What \nsymbol is division? This / or this \\?)" +
                "\n\tYou will start new topics soon, good luck!");


    }
}
