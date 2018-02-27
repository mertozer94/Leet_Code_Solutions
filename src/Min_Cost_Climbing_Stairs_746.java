/**
 * @author Mert Ozer
 */
public class Min_Cost_Climbing_Stairs_746 {
    public static void main(String [] args)
    {
        Min_Cost_Climbing_Stairs_746 solution = new Min_Cost_Climbing_Stairs_746();
        int[] cost = new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(solution.minCostClimbingStairs(cost));

    }
    public int minCostClimbingStairs(int[] cost) {
        for(int i = 2; i < cost.length; i++){

            cost[i] = cost[i] + Math.min(cost[i-1], cost[i-2]);
        }

        return Math.min(cost[cost.length-1],cost[cost.length-2]);

    }

}
