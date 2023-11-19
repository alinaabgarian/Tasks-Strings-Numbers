import java.util.Scanner;

public class StringTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many words do you want to enter? ");
        int amountOfStrings = scanner.nextInt();

        String array[] = new String[amountOfStrings];

        for(int a = 0; a< array.length; a++){
            System.out.println("Enter a word ");
            String string = scanner.next();
            array[a] = string;
        }


        int minUnique = getCountUnique(array[0]);
        String min = array[0];
        for(int b=0; b< array.length; b++){
            if(getCountUnique(array[b])<minUnique){
                minUnique = getCountUnique(array[b]);
                min = array[b];
            }
        }
        System.out.println(min + " - "+minUnique);



    }

    static int getCountUnique(String str){
        int count = str.length();
        for(int currentIndex = 0; currentIndex< str.length(); currentIndex++){
            char currentSymbol = str.charAt(currentIndex);
            for(int i = 0; i<currentIndex; i++){
                char checkSymbol = str.charAt(i);
                if(checkSymbol == currentSymbol){
                    count--;
                    break;
                }
            }
        }
        return count;
    }


}
