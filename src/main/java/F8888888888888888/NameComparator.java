package F8888888888888888;

import java.util.Comparator;

public class NameComparator implements Comparator<Em2> {


    @Override
    public int compare(Em2 emp1, Em2 emp2) {
     int result = emp1.name.compareTo(emp2.name);
     if (result == 0) {
         result = emp1.surname.compareTo(emp2.surname);
     }
        return result;

    }
}
