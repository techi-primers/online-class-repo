package Service;

public class CalculatorService {

    public  void doAddition(Integer no1, Integer no2) {

        Integer operation = no1+ no2;
        System.out.println("Addition "+operation);


    }

    public  void doSubstraction(Integer no1, Integer no2) {
        Integer operation = no1 - no2;
        System.out.println("Substraction "+ operation);

    }

    public  void doMultifications(Integer no1, Integer no2) {
        Integer operation = no1 * no2;
        System.out.println("Substraction "+ operation);

    }

    public void doMultificationOrSubstraction(Integer no1, Integer no2) {

        if(no1>no2) {
            Integer operation = no1-no2;
            System.out.println("Substraction "+ operation);
        } else if(no1>50 && no2<60) {
            Integer operation = no1 / no2;
            System.out.println("Division " +operation);
        } else {
            Integer operation = no1+no2;
            System.out.println("Addition "+ operation);
        }

    }
}
