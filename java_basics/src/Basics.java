import java.util.ArrayList;
import java.util.List;

public class Basics {

    public static void main(String[] args) {
        System.out.println("hello");
        Basics basics = new Basics();
      //  basics.run1();
      //  System.out.println(basics.run());
     //   Integer retr = basics.calc(2,4);
     //   System.out.println(retr);
        System.out.println(basics.advancedcalc(1,2,"*"));
        System.out.println(basics.advancedcalc(8,2,"/"));
        System.out.println(basics.advancedcalc(8,2,"nuwantha"));
        //List<String> myListString = List.of(new String[]{"add", "subs", "mul"});
        List<String> myListNew = new ArrayList<>();
        myListNew.add("add");
        myListNew.add("sub");
        List<Integer> returnedValues = basics.dynamicAdvancedcalc(10, 2, myListNew);
        returnedValues.forEach(rec -> {
            System.out.println(rec);
        });
    }

    public String run () {
        String hello = "this is first time ";
        return hello+"returning";
    }

    public void run1 () {
        String hello = "this is first time ";
        System.out.println(hello);
    }

    public Integer calc (Integer no1, Integer no2) {

        Integer result = no1 + no2;
        return result;
    }

    public Integer advancedcalc (Integer no1, Integer no2, String type) {

        if (type.equals("*")) {
            return no1 * no2;
        } else if (type.equals("/")) {
            return no1 / no2;
        } else if (type.equals("+")) {
            Integer result = no1 + no2;
            return result;
        } else {
            return null;
        }

    }

    public List<Integer> dynamicAdvancedcalc (Integer no1, Integer no2, List<String> type) {

        List<Integer> responses = new ArrayList<>();
        for(int i= 0;i<type.size();i++) {
            Integer res;
            if (type.get(i).equals("add")) {
                res =  no1 + no2;
            } else if (type.get(i).equals("div")) {
                res =  no1 / no2;
            } else if (type.get(i).equals("sub")) {
                res =  no1 - no2;
            } else if (type.get(i).equals("+")) {
                res = no1 + no2;
            } else {
                res = null;
            }
            responses.add(res);
        }

        return responses;
    }


}
