package Task5;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Zahra";

        Person person = employee;

        person.name = "ZahraLi";


        System.out.println("Employee reference (name in Employee): " + employee.name);
        System.out.println("Person reference (name in Person): " + person.name);
        

    }
}
