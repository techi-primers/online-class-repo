import dto.Employee;

public class Response {

    public static void main(String[] args) {

        Basics basics = new Basics();
    //    Integer add = basics.advancedcalc(3, 9, "*");
     //   System.out.println(add);

        Employee employee = new Employee();
        employee.setEmployeeId(1);
        employee.setContactNo("0712822822");
        employee.setName("arjun");

        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getContactNo());
        System.out.println(employee.getName());


    }
}
