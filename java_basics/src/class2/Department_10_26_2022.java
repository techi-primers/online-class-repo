package class2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Department_10_26_2022 {

    public static void main(String[] args) {

        Department_10_26_2022 department10262022 = new Department_10_26_2022();
        Integer returnValue = department10262022.myFirstMethod(5);
        System.out.println(returnValue);
        System.out.println("...................");

        List<String> returnList = department10262022.mySecondMethod();
        System.out.println(returnList);

        System.out.println("...................");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(22);
        List<Integer> retInt = department10262022.myThirdMethod(integerList);
        System.out.println(retInt);
    }

    public Integer myFirstMethod(Integer val) {

        Integer value =val;
        return val;
    }

    public List<String> mySecondMethod() {

        List<String> myList = new ArrayList<>();
        myList.add("hello");

        return myList;
    }

    public List<Integer> myThirdMethod(List<Integer> listOfInteger) {
        return listOfInteger;
    }



}

// create class Department
// 1. main
// 2. public return <> , String value , print
// 3, public return <> , String list of string value , print
// 4, public return  , String list of string value , main -> print
// 5, public return  , String int  value , 2*value  , main -> print