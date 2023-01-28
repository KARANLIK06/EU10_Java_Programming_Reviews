package week20_01_21_2023;

public class Employee {
    /*
- Pre condition

Create an Employee class which has id and name attribute
Then create a list of employee

Task 1-a) get the unique names from list of employee

 */
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
