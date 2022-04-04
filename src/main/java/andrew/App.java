package andrew;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World ");
        greet("asdfghj");
        //System.out.println("message: " + msg);

        int a = 10;
        int b = 20;
        int c = 22;

        int total = sum(a, b, c);
        System.out.println("sum of 3 numbers: " + total);
    }

    public static String greet(String name) {
        int sum = 1 + 2 + 3 + 4 + 5;
        System.out.println(sum);
        return "Hello " + name + sum;
    }

    public static int sum(int a, int b, int c) {
       int sum = a + b + c;
       return sum;

    }






}
