import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        
        RandomArrayGenerator randArrGen = new RandomArrayGenerator();

        int[] randomArr = randArrGen.generate(50); //Generates random array with length 50

        System.out.println("Random array: " + Arrays.toString(randomArr));

        bubbleSort(randomArr); //Sorts array

        System.out.println("Sorted array: " + Arrays.toString(randomArr));


    }

    public static void bubbleSort(int[] arr){

        while(!Helper.isSorted(arr)){
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    Helper.swap(arr, i, i+1);
                }
            }
        }
    }
}
