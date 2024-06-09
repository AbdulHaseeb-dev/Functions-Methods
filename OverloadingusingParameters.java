public class OverloadingusingParameters {

    public static int sum (int a, int b) {
        return a + b;
    }

    public static int sum (int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        int total = sum(3, 5);
        System.out.println(total);
        int total2 = sum(4, 3, 1);
        System.out.println(total2);
        
    }
}
