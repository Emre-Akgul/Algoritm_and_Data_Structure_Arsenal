import java.util.Random;

public class RandomArrayGenerator implements ArrayGenerator{
    
    IncreasingArrayGenerator arrN;

    @Override
    public int[] generate(int n) {
        arrN = new IncreasingArrayGenerator();
        int[] increasingArr = arrN.generate(n);
        int[] res = new int[n];
        Random rand = new Random();
        int randomNumber;

        int count = 0;
        while(count < res.length){
            randomNumber = rand.nextInt(n);
            
            if(increasingArr[randomNumber] != 0){
                res[count] = increasingArr[randomNumber];
                increasingArr[randomNumber] = 0;
                count++;
            }
            
        }

        return res;
    }

    public static boolean isComplete(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}
