class HollowTriangle{
    public static void main(String[] args) {
        // *
        // **
        // * *
        // * **
        // *****
                // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if(i==1 || i==2 || i==5){
        //             System.out.print("*");
        //         }
        //         else if (j==1 || j==3 || j==4) {
        //             System.out.print("*");
                    
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // *
        // **
        // * *
        // *  *
        // *****
        int n=5;
        for(int i=1;i<=n;i++){
            if(i==1 || i==2 || i==n){
                for(int j=1; j<=i;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j=1;j<=i-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}