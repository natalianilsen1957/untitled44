package F8888888888888888;

public class Em implements Comparable<Em> {
    int id;
    String name;
    String surname;
    int salary;

    public Em(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Em{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Em other) {
        int result = this.name.compareTo(other.name);
        if (result == 0) {
            result = this.surname.compareTo(other.surname);
        }
        return result;
    }
}

