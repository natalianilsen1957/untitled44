//import java.util.Optional;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Random;
//
//public class Program30 {
//
//    public static void main(String[] args) {
//
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        Random rnd = new Random();
//        System.out.println(min.orElseGet(()->rnd.nextInt(100)));
//    }
//}