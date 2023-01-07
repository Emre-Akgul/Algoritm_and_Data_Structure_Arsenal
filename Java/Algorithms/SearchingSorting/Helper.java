/**
 * Helper
 */
public class Helper {

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];

        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static boolean isSorted(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        
        return true;
    }
    
    
}