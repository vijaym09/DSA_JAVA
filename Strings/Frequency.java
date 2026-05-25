import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        int count=0;
        String str="Hello";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;

            }
        }
        System.out.println("Frequency of "+ch+" is "+count);

    }
    
}
