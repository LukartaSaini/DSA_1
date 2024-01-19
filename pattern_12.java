class Main {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                int c=a+b;
                a=b;
                b=c;
               
                System.out.print(a+"\t");
            }
            System.out.println();

        }
    }
}

// OUTPUT

// 1
// 1       2
// 3       5       8
// 13      21      34      55