package week20_01_21_2023;

import java.util.*;

public class EmployeeTest {
    static List<Employee> employees=new ArrayList<>();
    public static void main(String[] args) {
        Employee employee5=new Employee(9,"Adam");
        Employee employee1=new Employee(1,"Betul");
        Employee employee2=new Employee(2,"Attia");
        Employee employee3=new Employee(3,"Nihal");
        Employee employee4=new Employee(4,"Alisher");
        Employee employee6=new Employee(8,"Alisher");
        Employee employee7=new Employee(10,"Adam");
        Employee employee8=new Employee(11,"Alisher");
        Employee employee9=new Employee(1,"Betul");



        employees.addAll (Arrays.asList(employee1,employee2,employee7,employee3,employee6,employee4,employee8,employee9,employee5));

        List<String> uniqueNames = findUniqueNames();
        System.out.println(uniqueNames);
    }

    private static List<String> findUniqueNames() {
        Set<String> names =new HashSet<>();
        for (Employee employee : employees) {
            names.add(employee.name);
        }
        return new ArrayList<>(names);
    }
}
