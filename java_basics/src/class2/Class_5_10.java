package class2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class_5_10 {

    static HashMap<String, String> emplyeeDepartment = new HashMap<>();

    public static void main(String[] args) {

        // Employee Name // Employee Department

        //saveEmplyeeDepartment()
        //getEmployeeByDepartment(String department) : employee List
        //getDepartmentByEmployeeName(String employeeName) : department
        Class_5_10 class_5_10 = new Class_5_10();
        class_5_10.saveEmplyeeDepartment();
        List<String> employeeList = class_5_10.getEmployeeByDepartment("Finance");
        System.out.println("//////////get employees by department");
        System.out.println(employeeList);
        String department = class_5_10.getDepartmentByEmployeeName("Amith Kalyana");
        System.out.println("//////////get department by employee");
        System.out.println(department);
    }

    public void saveEmplyeeDepartment() {

        emplyeeDepartment.put("Kalyana", "HR");
        emplyeeDepartment.put("Amith Kalyana", "Finance");
        emplyeeDepartment.put("Nuwantha", "Finance");
        emplyeeDepartment.put("Arjun","Finance");

    }

    public List<String> getEmployeeByDepartment(String departmentName) {

        List<String> employeeList = new ArrayList<>();
        emplyeeDepartment.forEach((name,dep)-> {

            if(dep==departmentName) {
                employeeList.add(name);
            }

        });

        return employeeList;

    }

    public String getDepartmentByEmployeeName(String employeeName) {
        String department = null;
        for (Map.Entry<String,String> entry : emplyeeDepartment.entrySet()) {
            if(entry.getKey()==employeeName) {
               department = entry.getValue();
            }
        }

        return department;

    }
}
                   // nuwantha      // kalyana
// class methods    70%                50%
// conidtions       80%                65%
// loop
// list
// set
// map

// oop


// create class Department
// 1. main
// 2. public return <> , String value , print
// 3, public return <> , String list of string value , print
// 4, public return  , String list of string value , main -> print
// 5, public return  , String int  value , 2*value  , main -> print
