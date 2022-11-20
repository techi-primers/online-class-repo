package class2;

import java.util.*;

public class demo_10_7_22 {

    public static void main(String[] args) {
        /*List<Integer> integersArray = new ArrayList<>();
        integersArray.add(4);
        integersArray.add(5);
        integersArray.add(1);

        integersArray.forEach(rec-> System.out.println(rec));

        Set<Integer> sorted = new TreeSet<>(integersArray);

        sorted.forEach(sortRec -> System.out.println(sortRec));*/

        demo_10_7_22 demo = new demo_10_7_22();
        //demo.findAndRePlace("hello world from srilanka", "world");
       // demo.stringConcatination("hello","world");
        demo.stringIndexOff("hello","e");
      //  demo.stringCharAt("hello",1);
       // demo.stringComapre("hello world","hello worldr");

    }

    private void findAndRePlace(String word, String replceWord) {

        // is word containing replceWorld
        // if yes need to print as "available"
        // if not print "not-available"


        boolean contains = word.contains(replceWord);
        if(contains) {
            System.out.println("available");
        } else {
            System.out.println("not-available");
        }

    }

    private void stringConcatination(String worddd, String wordd) {

        // is word containing replceWorld
        // if yes need to print as "available"
        // if not print "not-available"


       // heloworld
        //concat()
        System.out.println(wordd.concat(wordd));
    }

    private void stringIndexOff(String word, String search) {

        // is word containing replceWorld
        // if yes need to print as "available"
        // if not print "not-available"


        // heloworld
        //indexOf()

        String is = "Hello";
        int find = word.indexOf(search);
        System.out.println(find);


    }

    private void stringCharAt(String word,Integer val) {

        // is word containing replceWorld
        // if yes need to print as "available"
        // if not print "not-available"


        // heloworld
        //charAt()

        char find = word.charAt(2);

        System.out.println(find);


    }

    private void stringComapre(String word,String val) {

        // is word containing replceWorld
        // if yes need to print as "available"
        // if not print "not-available"


        // heloworld
        //compare
        //comapreIgnorecase()

        if(word.compareToIgnoreCase(val)==0) {

        } else {
            System.out.println("not equal");
        }



    }

}
