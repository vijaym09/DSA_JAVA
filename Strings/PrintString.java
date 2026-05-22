
import java.util.Scanner;

// class PrintString
// {
//     public static void main(String[] args) {
//         String str="Babbar";
//         for(int i=0;i<str.length();i++){
//         System.out.println(str.charAt(i));
//         }
//     }
// }


class PrintString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':        
            case 'o':
            case 'u':  

            case 'A':
            case 'E':
            case 'I':        
            case 'O':
            case 'U':  
                    System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

    }
}