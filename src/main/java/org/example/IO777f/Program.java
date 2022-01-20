package org.example.IO777f;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Stream<Phone7> phoneStream = Stream.of(new Phone7("iPhone X", "Apple", 600),
                new Phone7("Pixel 2", "Google", 500),
                new Phone7("iPhone 8", "Apple",450),
                new Phone7("Galaxy S9", "Samsung", 440),
                new Phone7("Galaxy S8", "Samsung", 340));

        Map<String, List<Phone7>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone7::getCompany));

        for(Map.Entry<String, List<Phone7>> item : phonesByCompany.entrySet()){

            System.out.println(item.getKey());
            for(Phone7 phone : item.getValue()){

                System.out.println(phone.getName());
            }
            System.out.println();
        }
    }
}