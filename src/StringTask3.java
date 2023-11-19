import java.util.Scanner;

public class StringTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many strings do you want to enter? ");
        int amountOfStrings = scanner.nextInt();

        String array[] = new String[amountOfStrings];

        for(int a = 0; a< array.length; a++){
            System.out.println("Enter a string ");
            String string = scanner.next();
            array[a] = string;
        }

        int sumOfAll = 0;
        for(int b = 0; b< array.length; b++){
            sumOfAll = sumOfAll+array[b].length();
        }

        int average = sumOfAll/ array.length;
        System.out.println("The average is "+average);

        for(int c = 0; c< array.length; c++){
            if(array[c].length()>average){
                System.out.println(array[c]+" - "+array[c].length());
            }
        }
    }
}
