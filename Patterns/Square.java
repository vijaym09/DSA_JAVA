/*class Square{
    public static void main(String[] args) {
        for(int i=0; i<=2;i++){
            for(int j=0; j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/


class Square{
    public static void main(String[] args) {
        int n=4;
        for(int row=0; row<=n; row++){
            //for each row -> n columns 
            for(int col=0; col<=n;col++){
                //print star 
                System.out.print("* ");

            }
            System.out.println();
            //move to next line
        }
    }
}