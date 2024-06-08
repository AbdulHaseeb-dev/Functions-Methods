import java.util.Scanner;

public class SyntaxwithParameters {

    public static void printHelloWorld() {
        int n=3;
        for (int i=1; i<=n; i++) {
            System.out.println("Hello World");
        }
        
    }

    public static int calculateSum(int num1, int num2) { // parameters or formal parameters 
        int sum = num1 + num2;
        return sum;
    }


    public static void main(String[] args) {
        printHelloWorld();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // arguments or actual parameters
        System.out.println(sum);
        sc.close();
    }
}