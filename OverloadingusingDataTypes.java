import java.util.Scanner;

public class OverloadingusingDataTypes {

    public static int sum (int a, int b) {
        return a + b;
    }

    public static float sum (float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int total = sum(a, b);
        System.out.println(total);
        System.out.println("Enter  float A");
        float A = sc.nextFloat();
        System.out.println("Enter float B");
        float B = sc.nextFloat();
        float total2 = sum(A, B);
        System.out.println(total2);
        sc.close();
    }
}
