package Service;

import java.util.ArrayList;
import java.util.List;

public class LoopPractise {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(10);
        integerList2.add(11);
        integerList2.add(12);
        integerList2.add(13);
        integerList2.add(14);

        //11,13,15,17,.....
        //11,12,13,14



        for(int i=0;i<3;i++) {




            for (int j=0;j<3;j++) {

                System.out.print("*");

            }

            System.out.println();

        }
        System.out.println("--------");
        for(int i=0;i<integerList.size();i++) {

            int loop1Val = integerList.get(i); //1


            for (int j=0;j<integerList2.size();j++) {

                int loop1Val2 = integerList2.get(i); //10
                System.out.println(loop1Val+loop1Val2); //11
                break;

            }


        }


    }
}
