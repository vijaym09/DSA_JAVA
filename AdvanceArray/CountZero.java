public class CountZero {
    public static void main(String[] args) {
        int arr[]={0,0,0,1,1,0,1};
        int ZeroCount=0;
        int OneCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                ZeroCount=ZeroCount+1;
            }
            else{
                OneCount=OneCount+1;
            }
        }
        System.err.println("Zerocount are: "+ZeroCount+" and OneCount are:  "+OneCount);
    }
    
}
