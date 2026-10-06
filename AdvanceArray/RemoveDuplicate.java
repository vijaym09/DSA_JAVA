public class RemoveDuplicate{
    public static int removeDuplicate(int arr[]){
        //using 2 pointer approach
        int i=0;
        int j=i+1;
        int n=arr.length;
        while(j<n){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,2,2};
        int k=removeDuplicate(arr);
        for(int i=0;i<k;i++){
             System.err.println(arr[i]);
        }   
       
    }
}