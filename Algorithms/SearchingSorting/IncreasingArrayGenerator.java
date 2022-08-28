public class IncreasingArrayGenerator implements ArrayGenerator{
    
    @Override
    public int[] generate(int n) {
        int[] res = new int[n];

        for(int i = 0; i < res.length ; i++){
            res[i] = i + 1;
        }

        return res;
    }
}
