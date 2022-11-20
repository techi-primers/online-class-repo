package class2;

import java.util.*;

public class demo_26_07_22 {

    public static void main(String[] args) {
        // collection frame work
        /*List<String> stringList = new ArrayList<>();
        stringList.add("value1");
        stringList.add("value7");
        stringList.add("value2");
        stringList.add("value3");
        stringList.add("value4");
        stringList.add("value5");
        stringList.add("value6");*/

        //System.out.println(stringList.size());

       /* stringList.forEach(rec -> {

            System.out.println(rec);
        });*/
        //stringList.add(4,"replaced");
        //stringList.forEach(rec -> System.out.println(rec));


      /*  Set<String> set = new HashSet<>();
        set.add("value1");
        set.add("value7");
        set.add("value2");
        set.add("value3");
        set.add("value4");
        set.add("value5");
        set.add("value6");

        set.forEach(rec -> System.out.println(rec));*/

       /* Set<Integer> set = new HashSet<>();
        set.add(null);
        set.add(4);
        set.add(6);
        set.add(1);
        set.add(8);
        set.add(2);

        set.forEach(rec -> System.out.println(rec));*/

        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"value1");
        myMap.put(2,"value2");

        myMap.forEach((key,value)-> {
            System.out.println(key);
            System.out.println(value);
        });

        //System.out.println(myMap.get(2));
        System.out.println("............");

        myMap.remove(2);

        myMap.forEach((key,value)-> {
            System.out.println(key);
            System.out.println(value);
        });




    }
}
