import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args) {
        
        RandomArrayGenerator randArrGen = new RandomArrayGenerator();

        int[] randomArr = randArrGen.generate(50); //Generates random array with length 50

        System.out.println("Random array: " + Arrays.toString(randomArr));

        selectionSort(randomArr); //Sorts array

        System.out.println("Sorted array: " + Arrays.toString(randomArr));

    }

    public static int[] selectionSort(int[] arr){
        int minIndex;
        for(int i = 0; i < arr.length; i++){
            minIndex = i;
            for(int j = i; j < arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            Helper.swap(arr, i, minIndex);
        }

        return arr;
    }


}
