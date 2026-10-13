import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in celsius: ");
        float n=sc.nextInt();
        
        float fahrenheit=(n*9/5)+32;
        System.out.println(fahrenheit);
    }
    

    
}
