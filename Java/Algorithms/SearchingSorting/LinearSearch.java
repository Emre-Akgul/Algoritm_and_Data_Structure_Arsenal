import java.util.Arrays;

public class LinearSearch {
    
    public static void main(String[] args) {

        RandomArrayGenerator randArrGen = new RandomArrayGenerator();
        
        int[] randomArr = randArrGen.generate(50);
        int target = 1;

        System.out.println("Array           : " + Arrays.toString(randomArr));
        System.out.println("Target          : " + target);
        System.out.println("Index of Target : " + linearSearch(randomArr, target));

    }

    /**
     * @param arr array that function try to find target number.
     * @param target target number
     * @return index of target number. If target number is not in the array then return -1.
     */
    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }


}
