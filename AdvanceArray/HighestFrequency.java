public class HighestFrequency {
    static void frequency(int arr[]){
        int i=0;
        int count=0;
        while(i<arr.length-1){
            if(arr[i]==arr[i+1]){
            count=count+1;
            i++;
        }
        else{
            i++;
        }
    }
    System.out.println(count);
}
    public static void main(String[] args) {
        int arr[]={2,4,7,6,6,3,3,1,2,4};
        //         0 1 2 3 4 5 6 7 8
        frequency(arr);

    }
    
}
