import java.util.Arrays;

/**
 * MergeSort
 */
public class MergeSort {

    public static void main(String[] args) {
        
        RandomArrayGenerator randArrGen = new RandomArrayGenerator();

        int[] randomArr = randArrGen.generate(50); //Generates random array with length 50

        System.out.println("Random array: " + Arrays.toString(randomArr));

        randomArr = mergeSort(randomArr); //Sorts array

        System.out.println("Sorted array: " + Arrays.toString(randomArr));


    }

    public static int[] mergeSort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }else{

            int[] firstHalf = new int[arr.length / 2];
            int[] secondHalf = new int[arr.length - arr.length / 2];

            int count = 0;
            while(count < arr.length){
                if(count < firstHalf.length){
                    firstHalf[count] = arr[count];
                }else{
                    secondHalf[count - firstHalf.length] = arr[count];
                }
                count++;
            }

            firstHalf = mergeSort(firstHalf);
            secondHalf = mergeSort(secondHalf);
            return merge(firstHalf, secondHalf);
        }
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];

        int pointer1 = 0; 
        int pointer2 = 0;

        int count = 0;
        while(count < result.length){
            if(pointer1 == arr1.length){
                result[count] = arr2[pointer2];
                pointer2++;
            }
            else if(pointer2 == arr2.length){
                result[count] = arr1[pointer1];
                pointer1++;
            }
            else{
                if(arr1[pointer1] < arr2[pointer2]){
                    result[count] = arr1[pointer1];
                    pointer1++;
                }
                else{
                    result[count] = arr2[pointer2];
                    pointer2++;
                }
            }
            count++;
        }
        return result;
    }
}