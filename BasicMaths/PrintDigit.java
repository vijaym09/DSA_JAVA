public class PrintDigit{
    public static void main(String[] args) {
        int digit=4543;
        int result=0;
        //int i=0;
        // while(i<=digit){
        //     result=digit/10;
        //     digit=digit%10;
        //     System.out.println(result);
        // }
        // for(int i=0;i<=digit;i++){
        //     result=digit/10;
           
        //     System.out.println(result);
        //      digit=digit%10;
        // }

        while(digit!=0){
            result=digit/10;
            System.out.println(result);
            digit=digit%10;
            
        }
        System.out.println("Helloo");
    }

}   