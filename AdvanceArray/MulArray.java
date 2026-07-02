//package AdvanceArray;

public class MulArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        int multi=1;
        for (int i=0;i<arr.length;i++){
            multi=multi*arr[i];
        }
        System.out.println("Multiplication of array: "+multi);

        //multiply each element by 10
        int multi1=1;
        for(int j=0;j<arr.length;j++){
            multi1=10*arr[j];
            System.out.println(multi1);
        }
    }   

    
}
