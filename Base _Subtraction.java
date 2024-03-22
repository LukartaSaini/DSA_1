package Number_System;

import java.util.Scanner;

 class Base_subtraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int b= s.nextInt();
        System.out.print("Enter n1: ");   //smaller
        int n1=s.nextInt();
        System.out.print("Enter n2: ");
        int n2=s.nextInt();

        int result=substraction(b,n1,n2);
        System.out.println(result);

    }

    public static int substraction(int b, int n1,int n2){

        int rv=0;
        int power=1;
        int carry=0;

        while(n2>0){
            int d1=n1%10;
                n1=n1/10;
            int d2=n2%10;
            n2=n2/10;

            int d=0;
             d2=d2+carry;

             if(d2>=d1){
                carry=0;
                d=d2-d1;

             }
             else{
                carry=-1;
                d=d+b-d1;

             }

             rv += d*power;
             power=power*10;


        }
        return rv;
    }
    
}