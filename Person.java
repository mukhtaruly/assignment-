public class Person implements Payable, Comparable<Person> {
    private static int count = 0;
    private final int id;
    private String name;
    private String surname;

    // Әдепкі конструктор
    public Person() {
        this.id = ++count;
        this.name = "Unknown";
        this.surname = "Unknown";
    }

    // Параметрлі конструктор
    public Person(String name, String surname) {
        this.id = ++count;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0.0; // Әдепкі төлем
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
