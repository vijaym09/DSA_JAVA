class Sum2DArray{
    public static int SumArray(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        int sum=0;

        for(int i = 0; i < m; i++){
            //sum ko update with zero
          // int sum=0;
            for(int j = 0; j < n; j++){
                int value =arr[i][j];
                sum = sum + value;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9}};
        int result=SumArray(arr);
        System.out.println(result);
    }
}