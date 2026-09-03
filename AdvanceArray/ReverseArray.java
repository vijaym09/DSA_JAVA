class ReverseArray{
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
/*
        for(int k=arr.length-1;k>=0;k--){
            System.out.println(arr[k]);
        }
            */
    }
}