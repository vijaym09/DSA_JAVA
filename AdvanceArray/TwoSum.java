    public class TwoSum {
        public static void main(String[] args) {
            int arr[]={2,6,3,7,4,5};
            //         0 1 2 3 4 5 
            int i=0;
            int j=1;
            int target=7;
            // while(i<j+1){
            //     if((arr[i]+arr[j+1])==target){

            //     System.out.println(arr[i]+" "+arr[j+1]);
            //     i++;
            //     j++;

            //}

            //}
            // for(j=1;j<arr.length-1;j++){
            //     for(int )
            //     if((arr[i]+arr[j])==target){
            //         System.out.println(i+" "+j);
            //     }
            // }
            // i++;

            for(i=0;i<arr.length-1;i++){
                for(j=i+1; j<arr.length;j++){
                    if((arr[i]+arr[j])==target){
                        //System.out.println(i+" "+j);
                        System.out.println(i+" "+j);
                        return;
                    }
                    
                }
            }
            
        }
        
    }
