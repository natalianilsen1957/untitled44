package F8888888888888888;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Em2> {


    @Override
    public int compare(Em2 emp1, Em2 emp2) {
        return emp1.salary-emp2.salary;
    }
}
