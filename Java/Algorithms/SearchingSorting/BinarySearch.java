import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        IncreasingArrayGenerator incrArrGen = new IncreasingArrayGenerator();
        
        int[] sortedArr = incrArrGen.generate(50);
        int target = 34;

        System.out.println("Array           : " + Arrays.toString(sortedArr));
        System.out.println("Target          : " + target);
        System.out.println("Index of Target : " + binarySearch(sortedArr, target));

    }
    /**
     * Helper method for binary search. This method tries to find target in whole array.
     */
    private static int binarySearch(int[] randomArr, int target) {
        return binarySearch(randomArr, target,0,randomArr.length-1);
    }

    /**
     * 
     * @param sortedArr Array that method will try to find target. For binary search to give correct results, the array must be sorted.
     * @param target Target to find index of.
     * @param begin begining index of search range.
     * @param end end index of search range.
     * @return index of target.
     */
    private static int binarySearch(int[] sortedArr, int target, int begin, int end) {
        
        if(begin > end){
            return -1;
        }

        int mid = (begin + end) / 2;
        int midNumber = sortedArr[mid];
        
        if(midNumber == target){
            return mid;
        }else if(midNumber > target){
            return binarySearch(sortedArr, target, begin, mid - 1);
        }
        else{
            return binarySearch(sortedArr, target, mid + 1, end);
        }
    }
    
}
