class Sort0and1{
    public static void main(String[] args) {
        int arr[]={0,1,1,1,0,0,1,0,0,1};
        //Two pointer approach
        int i=0;
        int j=arr.length-1;
        int temp=0;
        //Stop when i>j
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
            else if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }

        }
        for(int k=0;k<=arr.length-1;k++){
            System.out.println(arr[k]);

        }
        
    }
}