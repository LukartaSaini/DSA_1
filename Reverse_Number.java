import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  no : ");
        int n = sc.nextInt();
        int r;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            System.out.println(r);
        }
    }
}