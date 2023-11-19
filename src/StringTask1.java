import java.util.Scanner;

public class StringTask1 {
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

        int shortest = array[0].length();
        String shortestStr = array[0];
        for(int b = 1; b< array.length; b++){
            if(array[b].length() < shortest){
                shortest = array[b].length();
                shortestStr = array[b];
            }
        }
        System.out.println(shortestStr + " - "+shortest);


        int longest = array[0].length();
        String longestStr = array[0];
        for(int c = 1; c< array.length; c++){
            if(array[c].length() > longest){
                longest = array[c].length();
                longestStr = array[c];
            }
        }
        System.out.println(longestStr + " - "+longest);



    }
}
