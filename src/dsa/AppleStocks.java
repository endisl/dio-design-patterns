public class AppleStocks {

    public static void main(String[] args) {
        int[] prices = {10, 7, 5, 8, 11, 9};

        var result = getMaxProfit(prices);

        System.out.println(result);

    }

    public static int getMaxProfit(int[] stockPrices) {
        if (stockPrices.length < 2)
            throw new IllegalArgumentException("We need at least 2 prices in order to buy and sell.");

        int minPrice = stockPrices[0];
        int maxProfit = stockPrices[1] - stockPrices[0];

        for (int i = 1; i < stockPrices.length; i++) {
            int currentPrice = stockPrices[i];

            int potentialProfit = currentPrice - minPrice;

            maxProfit = Math.max(maxProfit, potentialProfit);

            minPrice = Math.min(minPrice, currentPrice);
        }
        return maxProfit;
    }
}
