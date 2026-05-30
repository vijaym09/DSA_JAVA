public class ReverseNumber {
    public static void main(String[] args) {
        int digit=5412;
        int result=0;
        while(digit!=0){
            result=digit%10; // first iteration 5412/10 = 541
            digit=digit/10; //  update the value 5412%10 = 2
            System.out.print(result);

        }
        
    }
    
}
