import java.util.Scanner;

public class Main {

    public static int[][] fillArray(int[][] array){
        Scanner scanner = new Scanner(System.in);

        int size = array.length;
        int count = array[0].length;

        for(int i= 0; i<size; i++){
            for(int j=0; j<count; j++){
                System.out.println("Podaj liczbe dla ["+i+"]["+j+"]" );
                array[i][j] =scanner.nextInt();
            }
        }
        return array;
    }


    public static void doSearch(int[][] array, int searched){

        array = fillArray(array);

        int size = -1;
        int count = -1;
        int index0 = 0;
        int index1 = 0;
        boolean found= false;
        for(int i=0; i<array.length;i++){
            size++;
            for(int j=0; j<array[i].length; j++){
                count++;
                if(array[i][j]==searched){
                    found = true;
                    index0 = size;
                    index1 = count;
                    System.out.println("Index ["+index0+"]["+index1+"]");
                }
            }
            count =-1;
        }
        if(!found)System.out.println("Szukanej liczby nie ma w tablicy");
    }


    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile tablic chcesz stworzyc?");
        int size = scanner.nextInt();
        System.out.println("Ile liczb ma przechowywac jedna tablica?");
        int count = scanner.nextInt();
        int[][] array = new int[size][count];
        System.out.println("Jaka liczbe chcesz odszukac?");
        int number = scanner.nextInt();
        doSearch(array,  number);
    }
}
