package java8.Functional_Programming.Questions;
/*
.Create a list of employees with name and salary fields.
Write a comparator that sorts the employees by salary.
Then, use this comparator to sort your list using the sort
stream operation.
 */

import java.util.List;

class Employee{
    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Ques9 {
    public static void main(String[] args) {
        List<Employee> employees=List.of(
                new Employee("kaka",200),
                new Employee("rohit",222),
                new Employee("raju",444),
                new Employee("mohan",1324)
        );

        employees.stream()
                .sorted((emp1,emp2)->Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }
}
