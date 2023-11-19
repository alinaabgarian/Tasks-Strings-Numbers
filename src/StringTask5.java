import java.util.Scanner;

public class StringTask5 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("How many words do you want to enter? ");
    int amountOfStrings = scanner.nextInt();

    String array[] = new String[amountOfStrings];

    for(int a = 0; a< array.length; a++){
        System.out.println("Enter a word ");
        String string = scanner.next();
        array[a] = string;
    }



    String allDif = "No words had all different characters";
    for(int b=0; b< array.length; b++){
        if(array[b].length() == getCountUnique(array[b])){
            allDif = array[b];
            break;
        }

    }
    System.out.println(allDif);


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
