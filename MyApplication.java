import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee emp2 = new Employee("George", "Harrison", "Engineer", 50000.00);
        Student stu1 = new Student("Ringo", "Starr", 2.5);
        Student stu2 = new Student("Paul", "McCartney", 3.2);

        ArrayList<Person> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(stu1);
        list.add(stu2);

        Collections.sort(list);

        printData(list);
    }

    public static void printData(Iterable<? extends Payable> payables) {
        for (Payable p : payables) {
            System.out.printf("%s earns %.2f tenge%n", p.toString(), p.getPaymentAmount());
        }
    }
}