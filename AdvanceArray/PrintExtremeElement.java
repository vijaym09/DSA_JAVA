public class PrintExtremeElement {
    static void alternateElement(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }
            else{
                //i<j
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};

        alternateElement(arr);
        
    }
}
