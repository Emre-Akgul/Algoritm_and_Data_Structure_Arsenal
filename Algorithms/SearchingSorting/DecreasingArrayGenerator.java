public class DecreasingArrayGenerator implements ArrayGenerator{
    


    @Override
    public int[] generate(int n) {
        int[] res = new int[n];

        for(int i = 0; i < res.length ; i++){
            res[i] = res.length - i;
        }

        return res;
    }
}
