package class4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class class_9_18_2022 {

    public static void main(String[] args) {
//        List<String> departmentOfVirtusa = new ArrayList<>();
//        departmentOfVirtusa.add("production");
//        departmentOfVirtusa.add("Mechanical");
//        Integer virtusaEmployeeId = 1234;
//
//        addEmployeeDetails(virtusaEmployeeId,departmentOfVirtusa);
//
//        List<String> departmentOfPearson = new ArrayList<>();
//        departmentOfPearson.add("Financial");
//        departmentOfPearson.add("Human Resource");
//        Integer pearsonEmployeeId = 5678;
//
//
//       addEmployeeDetails(pearsonEmployeeId,departmentOfPearson);

        deleteEmployee(5678);

        // Map : put , get(:key) , remove(:key)
        // List: add
    }

    public static void addEmployeeDetails(Integer employeeId, List<String> departments) {

        HashMap<Integer, List<String>> employeeInfo = new HashMap<Integer, List<String>>();
        employeeInfo.put(employeeId, departments);

        employeeInfo.forEach((empId, dep) -> {

            System.out.println("employeeId "+empId+ " departments "+ dep);

        });

        System.out.println("Get Person Employee Details.....");

        System.out.println(employeeInfo.get(5678));

        System.out.println("Get Virtusa Employee Details.....");

        System.out.println(employeeInfo.get(1234));



    }

    public static void deleteEmployee(Integer employeeId) {

        List<String> departmentOfVirtusa = new ArrayList<>();
        departmentOfVirtusa.add("production");
        departmentOfVirtusa.add("Mechanical");
        Integer virtusaEmployeeId = 1234;

        List<String> departmentOfPearson = new ArrayList<>();
        departmentOfPearson.add("Financial");
        departmentOfPearson.add("Human Resource");
        Integer pearsonEmployeeId = 5678;

        HashMap<Integer, List<String>> employeeInfo = new HashMap<Integer, List<String>>();
        employeeInfo.put(virtusaEmployeeId, departmentOfVirtusa);
        employeeInfo.put(pearsonEmployeeId, departmentOfPearson);

        System.out.println("Before Delete...."+employeeId);

        employeeInfo.forEach((empId, dep) -> {

            System.out.println("employeeId "+empId+ " departments "+ dep);

        });

        System.out.println("After Delete...."+employeeId);

        employeeInfo.remove(employeeId);

        employeeInfo.forEach((empId, dep) -> {

            System.out.println("employeeId "+empId+ " departments "+ dep);

        });

    }
}
