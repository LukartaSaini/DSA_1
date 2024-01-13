import java.util.*;

class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter low no.: ");
        int low = sc.nextInt();
        System.out.print("enter high no. : ");
        int high = sc.nextInt();

        for (int n = low; n <= high; n++) {
            int count = 0;
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(n + " is prime");
            } else
                System.out.println(n + " is not prime");
        }
    }
}