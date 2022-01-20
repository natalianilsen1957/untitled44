package F8888888888888888;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1=new Info<>("privet");
        System.out.println(info1);
        Info<Integer> info2=new Info<>(100);
        System.out.println(info2);

    }
}
