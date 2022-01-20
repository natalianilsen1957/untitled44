package org.example.IO777f;
//
//import java.util.*;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class Program29 {
//
//    public static void main(String[] args) {
//
//        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
//                new Phone("Pixel 2", "Google", 500),
//                new Phone("iPhone 8", "Apple", 450),
//                new Phone("Nokia 9", "HMD Global", 150),
//                new Phone("Galaxy S9", "Samsung", 300));
//
////        Comparator c = Collections.reverseOrder(new PhoneComparator());
//        phoneStream.sorted(new PhoneComparator())
//                .forEach(p -> System.out.printf("%s (%s) - %d \n",
//                        p.getName(), p.getCompany(), p.getPrice()));
//
//        IntStream.range(3, 8).boxed().forEach(System.out::println);
//
//        Phone[] arr3 = {new Phone("iPhone X", "Apple", 600),
//                new Phone("Pixel 2", "Google", 500),
//                new Phone("iPhone 8", "Apple", 450),
//                new Phone("Nokia 9", "HMD Global", 150),
//                new Phone("Galaxy S9", "Samsung", 300)};
//
//        List<Phone> phonelst1 = new ArrayList<Phone>(Arrays.asList(arr3));
//        Comparator c = Collections.reverseOrder(new PhoneComparator());
//        Collections.sort(phonelst1, c);
//        for (Phone el : phonelst1) {
//            System.out.print(el.getName() + " ");
//            System.out.print(el.getCompany() + " ");
//            System.out.println(el.getPrice());
//
//        }
//    }
//}