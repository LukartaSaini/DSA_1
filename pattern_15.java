import java.util.Scanner;

class Main {
    // numbers in diamond shape
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = r.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) { // space
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {

                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

// OUTPUT
//  1
// 212
//32123
// 212
//  1