import java.util.Scanner;

public class ProductofAandB {

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        int product = multiply(a, b);
        System.out.println(product);
        sc.close();
    }
}
