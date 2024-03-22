package Number_System;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int b=s.nextInt();

        int result=basetodecimal(n,b);
        System.out.println(result);


    }


public static int basetodecimal(int n, int b){

    int rv=0;
    int power=1;

    while(n>0){
        int d= n%10;
        n=n/10;

        rv += d*power;
        power= power*b;
    }
    return rv;
}}
