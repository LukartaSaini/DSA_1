import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter:");
        int n = s.nextInt();
        int star = n;
        int space = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < star) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            if (i <= n / 2) {
                star -= 2;
                space++;

            } else {
                star += 2;
                space--;

            }
            System.out.println();

        }
    }
}

// OUTPUT
// 7
// *******
//  *   *
//   * *
//    *
//   ***
//  *****
// *******