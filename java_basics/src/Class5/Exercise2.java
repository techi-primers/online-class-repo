package Class5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        List<Integer > listOfIntegers = new ArrayList<>(Arrays.asList(3, 2, 6, 7, 10));
        exercise2.checkEvenNubersInList(listOfIntegers);
    }

    private void checkEvenNubersInList(List<Integer> values) {

       for(int i=0;i<values.size();i++) {
           // 3,2, 6
           if(values.get(i) %2==0) {
               System.out.println("Even Number "+i);
           } else {
               System.out.println("Odd Number "+i);
           }

       }


    }
}
