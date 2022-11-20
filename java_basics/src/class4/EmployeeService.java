package class4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {

    public static void main(String[] args) {
       /* List<Integer> myList = new ArrayList<>();
        myList.add(23);
        myList.add(2);

        myList.forEach(rec -> System.out.println(rec));*/

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(12, "myString");
        myMap.put(34, "secondValue");

        myMap.forEach((key, val) -> {
            System.out.println(key);
            System.out.println(val);
        });

        Map<String, Integer> myMap2 = new HashMap<>();
        myMap2.put("hello", 4);


        // key 34.44 value "hello"

        Map<Float, String> myMap3 = new HashMap<>();
        myMap3.put(23.44F, "hello");

        // key string value list

        Map<String, List<String>> myMap4 = new HashMap<>();
        List<String> listOfString = new ArrayList<>();
        listOfString.add("hello");

        myMap4.put("key", listOfString);

        // key 12 value [3,2,4]

        Map<Integer, List<Integer>> myMap5 = new HashMap<>();
        List<Integer> myInt = new ArrayList<>();
        myInt.add(2);
        myInt.add(5);
        myMap5.put(2, myInt);

        // key 12 value [{1,"hello"},{3,"hi"}]
        Map<Integer, Map<Integer, String>> mnn = new HashMap<>();

        Map<Integer, Map<Integer, String>> integermapmap = new HashMap<>();
        Map<Integer, String> mymap34 = new HashMap<>();


        integermapmap.put(33, mymap34);


        // key [3,3] value "hello"
        Map<List<Integer>, String> mymap45 = new HashMap<>();
        List<Integer> myint = new ArrayList<>();
        myint.add(3);
        myint.add(5);
        mymap45.put(myint, "Hello");


        // Map<"test",23>
        // ABC company Employee id,[ "finance", "hr"]
        // Map<12,["abc","cde"]>

        // create methos (id, List<String)>0 [

        // add values into map

    }











}
