package dsa;

public class NumberWays {

    public static void main(String[] args)
    {
        var result = numberOfWays(100);

        System.out.println(result);
        System.out.println(Integer.MAX_VALUE);
    }

    public static int numberOfWays(int n)
    {
        //in hackerRank -> TLE time limit exceeded
        /*if (n <= 2)
            return 1;

        return (numberOfWays(n - 3) + numberOfWays(n - 1)) % 1000000007;

        //n=58 -> 598919331
        //n= 57 -> 773314922
        */

        if (n <= 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        if (n == 3)
            return 2;

        long[] dp = new long[n+1];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-3];
        }

        return (int) (dp[n]%1000000007);

        //n=58 -> -696047944 (wrong using int[])  [ -> 2598919345 > Integer.MAX_VALUE, using long[], returning long and without using %10^9+7 | -> 598919331 (correct) using % | -> 426041896 for n=100]
        //n= 57 -> 773314922
    }
}
