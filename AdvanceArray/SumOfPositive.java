public class SumOfPositive {
    public static void main(String[] args) {
        int arr[]={2,3,-5,4,-6,-7};
        int PositiveSum=0;
        int negativeSum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                PositiveSum=PositiveSum+arr[i];
            }
            else{
                negativeSum=negativeSum+arr[i];

            }
        }
        System.err.println("Sum of Positive: "+PositiveSum+" Sum of Negative: "+negativeSum);
    }
}
