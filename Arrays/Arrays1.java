class Arrays1{
    public static void main(String[] args) {
        int arr[]={4,2,5,1,6};
        int n=arr.length;
        int minValue=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<minValue){
                minValue=arr[i];

            }
        }
        System.out.println("minValue: "+minValue);
    }
}