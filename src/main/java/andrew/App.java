package andrew;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World ");
        greet("asdfghj");
        //System.out.println("message: " + msg);
    }

    public static String greet(String name) {
        int sum = 1 + 2 + 3 + 4 + 5;
        System.out.println(sum);
        return "Hello " + name + sum;
    }
}
