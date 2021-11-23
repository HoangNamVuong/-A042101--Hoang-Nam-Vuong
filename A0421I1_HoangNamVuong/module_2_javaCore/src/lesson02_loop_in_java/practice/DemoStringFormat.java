package lesson02_loop_in_java.practice;

public class DemoStringFormat {
    int k = 1;
    static int m = 2;
    public static void main(String[] args) {
        String name = "Hai";
        System.out.println("hello " + name);
        System.out.printf("%-20.2f%-20s\n", 8.4523, name);
        System.out.printf("%20.2f%20s\n", 8.4523, name);
        System.out.printf("Hello %s\n", name);
        DemoStringFormat demoStringFormat = new DemoStringFormat();
        System.out.println(demoStringFormat.sum(demoStringFormat.k, DemoStringFormat.m));
        demoStringFormat.m = 3;
        DemoStringFormat demoStringFormat2 = new DemoStringFormat();
        System.out.println(demoStringFormat.sum(demoStringFormat.k, demoStringFormat2.m));
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
