import java.util.List;
import java.util.ArrayList;
public class Sum2DColArray {
    public List<Integer>columnSums(int matrix[][]){
        int m=matrix.length;
        int n=matrix[0].length;

        List<Integer>result=new ArrayList<>();

        for(int j = 0; j<n;j++){
            int sum=0;
            for(int i=0;i<m;i++){
                int value=matrix[i][j];
                sum=sum+value;
            }
            result.add(sum);
        }



        return result;

    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
        Sum2DColArray obj = new Sum2DColArray();
         List<Integer> result = obj.columnSums(arr);

        System.out.println(result);

    }
    
}
