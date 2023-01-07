import java.util.Arrays;

public class InsertionSort {
    

    public static void main(String[] args) {
        
        RandomArrayGenerator randArrGen = new RandomArrayGenerator();

        int[] randomArr = randArrGen.generate(50); //Generates random array with length 50

        System.out.println("Random array: " + Arrays.toString(randomArr));

        insertionSort(randomArr); //Sorts array

        System.out.println("Sorted array: " + Arrays.toString(randomArr));

    }

    private static void insertionSort(int[] arr) {
        boolean isPlaced;
        for(int i = 0; i < arr.length; i++){
            isPlaced = false;
            for(int j = 0; j < i && !isPlaced ; j++){
                if(arr[i] < arr[j] ){
                    swipeOneRight(arr, j, i);
                    isPlaced = true;
                }
            }
        }
    }

    /*
     * Changes end index and begin index.
     * All other indices swipe one to the right.
     * Assume array is : int[] arr = [1,2,3,4,5,6]
     * swipeOneRight(arr,0,3) makes  [4,1,2,3,5,6]
     */
    private static void swipeOneRight(int[] arr, int begin, int end){
        
        for(int i = end; i > begin; i--){
            Helper.swap(arr,i,i-1);    
        }
    }

    
}
