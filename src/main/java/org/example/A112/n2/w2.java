package org.example.A112.n2;

public class w2 {
    public static void main(String[] args) {
        final StringBuffer sb1 = new StringBuffer("House{");
        sb1.append("area=").append("area");
        sb1.append(", price=").append("price");
        sb1.append(", city='").append("city").append('\'');
        sb1.append(", hasFurniture=").append("hasFurniture");
        sb1.append('}');
        System.out.println(sb1);

        final StringBuffer sb2 = new StringBuffer("House{");
        sb2.append("area=").append("area")
       .append(",price=").append("price")
        .append(",city=").append("\'city\'")
        .append(",hasFurniture=").append("hasFurniture")
        .append('}');

        System.out.println(sb2);


    }
}
