import java.util.Arrays;
public class TwoSum1 {
    public static int[] twosum(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])==target){
                    return new int[]{i,j};
                    //System.out.println(ans);
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,7,8};
        int target=5;
        int[] result=twosum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
