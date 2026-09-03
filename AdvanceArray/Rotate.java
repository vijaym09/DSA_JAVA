/*public class Rotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length-1;
        int temp=arr[n];
        // arr[0]=temp;
        // arr[n]=arr[n-1];
        // arr[n-1]=arr[n-2];
        // arr[n-2]=arr[n-3];
        // arr[n-3]=arr[n-4];
        for(int i=n;i>0;i--){
            arr[i]=arr[i-1];
            
        }
        arr[0]=temp;
        for(int j=0; j<arr.length;j++){
            System.out.println(arr[j]);
        }

    
    }
}
*/

class Rotate{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        //         0 1 2 3 4 5
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int k:arr){
            System.out.println(k);
        }
        
    }
}