import java.util.Scanner;
public class CelsiusToFahrenheit1 {
    public static void main(String[] args) {
        //Taking input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in celsius: ");
        float n=sc.nextInt();
        

        //logic
        float fahrenheit=(n*9/5)+32;
        System.out.println(fahrenheit);
    }
    

    
}
