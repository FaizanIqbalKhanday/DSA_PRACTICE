//rotate the array at pavit;
public class Prtc21 {
    public static int maximumProfitInStocks(int[] stocks){
        int profit=0;
        int n= stocks.length;
        int buyingPrice=stocks[0];
        for(int i=0;i<n;i++){
            if(buyingPrice<stocks[i]){
                profit=Math.max(stocks[i]-buyingPrice,profit );
            }
            else {
                buyingPrice=stocks[i];
            }

        }
        return profit;

    }
    public static void main(String[] args) {
        int[] stocks={4,2,0,6,3,2,5};
        System.out.println(maximumProfitInStocks(stocks));
        
    }
    
}
