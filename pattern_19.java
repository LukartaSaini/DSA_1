import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1) {

                    if(j==n ||j<=n/2+1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                } 
                else if (i < n / 2) { // row 2,20

                    if(j==n ||j==n/2+1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
                 else if (i == n / 2 + 1) { // row 4

                    System.out.print("*");
                } 
                else if (i < n) { // row 5,6

                    if(j==1 ||j==n/2+1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

                } else { // row 7
                    if(j==1 ||j>=n/2+1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

                }

                
            }
            System.out.println();
        }
    }
}

// OUTPUT

// 7
// ****  *
//    *  *
// *  *
// *******
// *  *
// *  *
// *  ****