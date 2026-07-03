public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        int temp=1;
        for(int i=0;i<arr.length;i++){
            if(temp==arr[i]){
                System.out.println("search element is "+arr[i]+" at the "+i+" Index");
            }
            else{
                System.out.println("Element not found");
            }
            break;
        }

    }
}
