package andrew;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World ");
        greet("asdfghj");
        //System.out.println("message: " + msg);

        int a = 10;
        int b = 20;
        int c = 22;
        int d = 1;

        int total = sum(a, b, c);
        System.out.println("sum of 3 numbers: " + total);
        int totalp = product(a, b, c, d);
        System.out.println("Product of 4 numbers: " + totalp);
        int totals = difference(a, b);
        System.out.println("Difference of 2 numbers: " + totals);

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

    public static int product(int a, int b, int c, int d) {
        int product = a * b * c * d;
        return product;
    }


    public static int difference(int a, int b) {
        int difference = a - b;
        return difference;
    }

}









