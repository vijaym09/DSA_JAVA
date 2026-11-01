public class Check {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
        int m=arr.length; // how many rows are there in the array
        int n=arr[0].length; //how many elements are there in the row
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                int value=arr[j][i];
                sum=sum+value;

            }
            System.out.println(sum);
            // column wise sum print ho jaaye 

        }

    }
    
}
