import java.util.Scanner;

public class StringTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many words do you want to enter? ");
        int amountOfStrings = scanner.nextInt();
        scanner.nextLine();

        String array[] = new String[amountOfStrings];

        for(int a = 0; a< array.length; a++){
            System.out.println("Enter a word ");
            String string = scanner.nextLine();
            array[a] = string;
        }

        int count = 0;
        String palindrome = "none";
        for (String s : array) {
            if (checkIfInt(s)) {
                if (checkIfPalindrome(s)) {
                    count++;
                    palindrome = s;
                    if (count == 2) {
                        palindrome = s;
                        break;
                    }
                }
            }
        }
        System.out.println(palindrome);



    }

    static boolean checkIfInt(String str){
        try {
            Integer.parseInt(str);
            return true;
        }catch(Exception e){
            return false;
        }

    }

    static boolean checkIfPalindrome(String str){
        int length = str.length();

        for(int c=0; c<length;c++){
            if(str.charAt(c) != str.charAt(length-1-c)){
                return false;
            }
        }
        return true;
    }



}
