public class ContainsDigits {
    public static void main(String[] args) {
        boolean found =false;
        String str="B Annapurna Sudama Nagar Indore";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='0' && ch<='9'){
                found=true;
                break;

            }
        }
        if(found){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
    
}
