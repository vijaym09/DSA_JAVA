//Without using method

public class StringToUpperCase1 {
    public static void main(String[] args) {
        
        String str="love";
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);
            }
            result=result+ch;
        }
        System.out.println(result);
    }
    
}
