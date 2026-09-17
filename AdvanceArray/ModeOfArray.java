import java.util.HashMap;

public class ModeOfArray {
    static int getMode(int arr[]){
        HashMap<Integer,Integer> freq =new HashMap<>();

        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
 
        // for(int i:freq.keySet()){
        //     // i-> i will represent key 
        //     System.out.println(i+ " -> " + freq.get(i));
        // }


        int maxFreq=-1;
        int maxFreqWaliKey=-1;
        for(int key:freq.keySet()){
            int currentKey=key;
            int currentKeyKiFrequency=freq.get(key);
            if(currentKeyKiFrequency>maxFreq){
                //Mujhe naya max mil gya to 

                maxFreq=currentKeyKiFrequency;
                maxFreqWaliKey=currentKey;
                 
            }
        }
        //jab loop se bahar aaoge to max freq wali key ready hogi   
        return maxFreqWaliKey;

    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,3,4,4,4,5,5,5,5,5,5,5};
        int ans=getMode(arr);
        System.out.println(ans);
        // Jis element ki frequency jyada ho usiko mode boldo 
        // HashMap -> Jo bhi key or value ke pair me hota hai usko java me HashMap kehte hai

    }
}