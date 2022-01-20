package F8888888888888888;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class As1 {
    public static void main(String[] args) {
        List<Em> ls=new ArrayList<Em>();
        Em e1=new Em(1, "nat1", "nil1", 100001);
        Em e2=new Em(20, "nat35", "nil2", 100002);
        Em e3=new Em(3, "nat35", "nil3", 100003);
        ls.add(e1);
        ls.add(e2);
        ls.add(e3);

        System.out.println(ls);
    Collections.sort(ls);
        System.out.println(ls);
        Em[] z = {e1, e2, e3};
        Arrays.sort(z);
        Arrays.sort(z);
        Arrays.sort(z);
        Arrays.sort(z);
        System.out.println(Arrays.toString(z));
    }
}
