

class Reverse{
   static  String str ="satasyy";
   static boolean check=true;
  public static void main(String[] args) {
      for(int i=0;i<=str.length()/2;i++){
              if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                check=false;
                break;
              }
      }
  if(check) System.out.println(" is palindrome");
  else System.out.println("not palindrome");

  }
}