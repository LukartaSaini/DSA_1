import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  no");
        int n = sc.nextInt();
        int temp=n;					
        int count=0;					
        while(temp != 0){					
          temp=temp/10;		 count++;		
        }							
       int div=(int)Math.pow(10,count-1);
       while(div!=0){
        int q=n/div;
        System.out.println(q);
        n=n%div;
        div=div/10;       }}
            
    }
