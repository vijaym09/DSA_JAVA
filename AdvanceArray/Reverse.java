/*public class Reverse {
   public static void main(String[] args) {
       int arr[]={1,2,3,4,8,6,5};
//         for(int i=arr.length-1;i>0;i--){
//             System.err.println(arr[i]);
//         }

//By 2 Pointer technique

        int n=arr.length;
        int temp;
        int i=0; 
        int j=n-1;
        while(i<=j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;


            i++;
            j--;
        }
        for(int k: arr){
            System.err.println(k);
        }
        
  }

}



*/
class Reverse
{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int n=arr.length-1;
        for(int i=n;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}