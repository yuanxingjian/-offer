public class Main {
    public static void main(String[] args) {
        //股票的最大利益
        int[] a=new int[]{7,1,5,4,6,4};
        System.out.println(fun(a));
    }

    private static int fun(int[] prices) {
        int i=0;
        int j=1;
        int max=0;
        while (j<prices.length){
            if(prices[j]<prices[i]){
                i=j;
                j++;
            }else {
                    max=Math.max(max,prices[j]-prices[i]);
                    j++;
            }

        }
        return max;

    }
}
