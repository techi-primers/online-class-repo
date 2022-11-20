package Controller;

import Service.CalculatorService;

public class MathController {

    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.doAddition(10,20);
        calculatorService.doSubstraction(30,20);
        calculatorService.doMultifications(5,20);

        // no1 = 50  no2 25
        // no1 = 55 no2 59
        // no1 = 50 no2 100
        calculatorService.doMultificationOrSubstraction(50,25);
        calculatorService.doMultificationOrSubstraction(55,59);
        calculatorService.doMultificationOrSubstraction(50,100);



    }
}
