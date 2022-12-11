package Class8;

public class MyMain {
    /*Run time polymorphism / Dynamic method dispatch */
    public static void main(String[] args) {


       Bank peoplesBank = new PeoplesBank();
        Double rateOfInterestOfPeoplesBank = peoplesBank.getRateOfInterest();
        System.out.println(rateOfInterestOfPeoplesBank);

        Bank sampathBank = new SampathBank();
        Double rateOfInterestOfSampathBank = sampathBank.getRateOfInterest();

        System.out.println(rateOfInterestOfSampathBank);

        // access non abstract method in abstract classes
        System.out.println(sampathBank.getLocation());
        // get abstract methods

        Customer customer = new VipCustomer();
        System.out.println(customer.getSalary());




    }
}
