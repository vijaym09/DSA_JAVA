//package AdvanceArray;

public class Avg {

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        
        System.out.println("Average of array is: "+(sum/arr.length));
        // System.out.println("Average of array is: "+sum);
    }
    
}
