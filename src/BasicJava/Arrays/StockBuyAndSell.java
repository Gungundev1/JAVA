package BasicJava.Arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices={7,3,2,2,4,5};
        int n=prices.length;
        int result=0;

        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                result=Math.max(result,prices[j]-prices[i]);
            }
        }
        System.out.println( " profit: "+result);
    }
}
