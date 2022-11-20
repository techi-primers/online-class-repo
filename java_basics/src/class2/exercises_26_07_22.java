package class2;

import java.util.HashMap;
import java.util.Map;

public class exercises_26_07_22 {

    public static void main(String[] args) {
        exercises_26_07_22 exercises_26_07_22 = new exercises_26_07_22();
        //exercises_26_07_22.findOddEven(5);

        exercises_26_07_22.findMissingValue();
    }

    public void findOddEven(Integer value) {

        Integer number = value%2;
        if(number==0) {
            System.out.println(number+" is a even");
        } else {
            System.out.println(number+" is a odd");
        }

    }

    public void findMissingValue() {

        Integer[] arr1 = {1,2,5};
        Integer[] arr2 = {2,5};

        //arr1 loop
            // sum1
        //arr2 loop
            // sum2

        // mising sum1 - sum2

        Integer sum1 = 0;
        Integer sum2 = 0;

        for(int i = 0; i<arr1.length; i++) {
            sum1 += arr1[i];
        }

        for(int j = 0; j<arr2.length; j++) {
            sum2 += arr2[j];
        }

        Integer missingValue = sum1 - sum2;

        System.out.println(missingValue);







    }
}
