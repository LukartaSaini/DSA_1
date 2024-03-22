package Number_System;

import java.util.*;

 class Baseaddition{
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter base : ");
        int b = s.nextInt();
        System.out.print("Enter the number1 : ");
        int n1 = s.nextInt();
        System.out.print("Enter n2 : ");
        int n2 = s.nextInt();
        int result = sum(b,n1,n2);
        System.out.println(result);

    }
    public static int sum(int b, int n1, int n2){
        int rv=0;
        int power=1;
        int carry=0;

        while(n1>0||n2>0||carry>0){

            int d1 = n1%10;
            int d2 = n2%10;
            
            n1=n1/10;
            n2=n2/10;

            int d= d1+d2+carry;
            carry=d/b;
            d=d%b;

            rv += d*power;
            power=power*10;

            
         }
         return rv;
    }


}
