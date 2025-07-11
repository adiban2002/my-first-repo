import java.util.*;
record Item(int weight, int value) 
{

}

public class IntegerKnapsack 
{
        private static int[][] knapDP(List<Item> items, int W) 
        {
          int n = items.size();
          int[][] dp = new int[n + 1][W + 1];
          for(int i = 1; i <= n; i++) 
          {
            Item it = items.get(i - 1);
            for(int w = 0; w <= W; w++) 
            {
                if(it.weight() > w) 
                {
                    dp[i][w] = dp[i - 1][w];
                } 
                else 
                {
                    dp[i][w] = Math.max(dp[i - 1][w],it.value() + dp[i - 1][w - it.weight()]);
                }
            }
        }
        return dp;
        }

    private static List<Integer> reconstruct(List<Item> items, int W, int[][] dp) 
    {
        List<Integer> chosen = new ArrayList<>();
        int i = items.size(), w = W;
        while(i > 0 && w >= 0) 
        {
            if(dp[i][w] != dp[i - 1][w]) 
            {
                chosen.add(i - 1);
                w -= items.get(i - 1).weight();
            }
            i--;
        }
        Collections.reverse(chosen);
        return chosen;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int[] weights = new int[n];
        int[] values  = new int[n];
        System.out.println("Enter " + n + " weights separated by space:");
        for(int i = 0; i < n; i++) 
          weights[i] = sc.nextInt();
        System.out.println("Enter " + n + " values  separated by space:");
        for(int i = 0; i < n; i++) 
          values[i] = sc.nextInt();
        System.out.print("Enter knapsack capacity: ");
        int W = sc.nextInt();
        sc.close();
        List<Item> items = new ArrayList<>();
        for(int i = 0; i < n; i++) 
          items.add(new Item(weights[i], values[i]));
        int[][] dp = knapDP(items, W);
        int maxVal = dp[n][W];
        List<Integer> chosen = reconstruct(items, W, dp);
        System.out.println("\n========== Result ==========");
        System.out.println("Maximum value that can be carried = " + maxVal);
        System.out.println("Items chosen (0‑based index, weight, value):");
        for(int idx : chosen) 
        {
            Item it = items.get(idx);
            System.out.printf("  #%d  (w=%d, v=%d)%n", idx, it.weight(), it.value());
        }
    }
}

