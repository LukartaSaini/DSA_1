class Main {
  public static void main(String[] args) {
    int n=5;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++)
        {
            if(i==1 && j==5 || i==2 && j==4 || i==3 && j==3 || i==4 && j==2 || i==5 && j==1 )
            {System.out.print("*\t");}
            else{
                System.out.print(" ");
            }
    }
    System.out.println();
  }  
   
}}

// OUTPUT
//     *
//    *
//   *
//  *
// *
