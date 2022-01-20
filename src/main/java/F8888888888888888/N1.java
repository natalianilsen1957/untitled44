package F8888888888888888;

import java.util.ArrayList;
import java.util.List;

public class N1 {
    public static double sum1(List<? extends Number> al) {
        double sum1 = 0;
        for (Number n : al) {
            sum1 += n.doubleValue();
        }
        return sum1;
    }

    public static void main(String[] args) {
    List<Integer> al1=new ArrayList<>();
    al1.add(3);
    al1.add(4);
    al1.add(5);
    al1.set(0, 100);
    al1.remove(1);
        Integer z = al1.get(0);
        System.out.println(al1);
        System.out.println(z);
    Number k=4.44;
        System.out.println(k.doubleValue());

       List<? extends Number> al11=new ArrayList<Double>();
       List<? super Number> al112=new ArrayList<Object>();
       List<? > al1111=new ArrayList<Object>();
        List<? > al87=new ArrayList<Object>();

    }

}