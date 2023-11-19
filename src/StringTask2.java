import java.util.Scanner;

public class StringTask2 {
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

        int i, j;
        boolean swapped;

        for(i = 0; i< array.length-1; i++){
            swapped = false;
            for(j = 9; j< array.length-i-1; j++){
                if(array[j].length() > array[j+1].length()){
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }

        for(int a = 0; a< array.length; a++){
            System.out.print(array[a] +" ");
        }


    }
}
