import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  no: ");
        int n = sc.nextInt();
        System.out.print("enter  no of rotation : ");
        int k=sc.nextInt();
    
        int temp=n;
        int count=0;
        while(temp>0){
          temp=temp/10;
          count++;
        }
        k=k%count;             //for rotation more than no of digit
        if(k<0){                // for negative rotation i.e -2 means count+rotation : 6-2=4
          k=k+count;
        }
    
        int div=1;  int mul=1;
        for(int i=1;i<=count;i++){
          if(i<=k)
           div=div*10;
          else
           mul=mul * 10;
         }
        int q=n/div;
        int r=n%div;
        int res= r * mul +q;
        System.out.println(res);
        }
    
}
