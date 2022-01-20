package F8888888888888888;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class As2 {
    public static void main(String[] args) {
        List<Em2> ls=new ArrayList<Em2>();
        Em2 emp1=new Em2(1, "nat1", "nil1", 100001);
        Em2 emp2=new Em2(20, "nat35", "nil2", 100002);
        Em2 emp3=new Em2(3, "nat35", "nil3", 100003);
        ls.add(emp1);
        ls.add(emp2);
        ls.add(emp3);

        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);

        Collections.sort(ls, new NameComparator());
        System.out.println(ls);

        Collections.sort(ls, new SalaryComparator());
        System.out.println(ls);


    }
}
