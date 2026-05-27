public class CountDigit {
    public static void main(String[] args) {
        int digit=432511;
       // int result=0;
        int count;
        for(count=0; digit!=0;count++){
            digit=digit/10;
        }
        System.out.println("Digits: "+count);
    }
    
}
