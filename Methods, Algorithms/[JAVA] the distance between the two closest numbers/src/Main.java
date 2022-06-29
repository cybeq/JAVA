import java.util.*;

// my solution for the task found at
// https://www.codingame.com/playgrounds/35979/java-interview-questions-and-programming-examples

public class Main {

    static int distClosestNumbers(int[] numbers) {

        int[] array =
                Arrays.stream(numbers).
                sorted().
                toArray();

        ArrayList<Integer> numberDiff = new ArrayList<Integer>();

        for(int i=0; i<array.length-1; i++){
            numberDiff.
                    add(
                            array[i+1]-array[i]
                    );
        }

        int number = numberDiff.get(0);

        for(int i=1; i<numberDiff.size(); i++){
            if(
                    numberDiff.get(i)<numberDiff.get(i-1)
            ){
                number = numberDiff.get(i);
            }
        }
            return  number;
    }

    public static void main(String[] args) {
        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
        int result = distClosestNumbers(testArray);
        System.out.println(result);
    }
}