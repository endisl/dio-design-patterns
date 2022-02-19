package dsa;

import java.util.*;

public class KPairs {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        /*list.add(5); list.add(7); list.add(9); list.add(13); list.add(11);
        list.add(6); list.add(6); list.add(3); list.add(3);*/

        //int[] arr = {5,7,9,13,11,6,6,3,3};

        //Case 0 : target=12  R/3
        list.addAll(Arrays.asList(5,7,9,13,11,6,6,3,3));

        //Case 1 : target=47  R/1
        //list.addAll(Arrays.asList(1,3,46,1,3,9));

        //Case 2 : target=12  R/2
        //list.addAll(Arrays.asList(6,6,3,9,3,5,1));

        //Case 3 : target=12  R/1
        //list.addAll(Arrays.asList(6,12,3,9,3,5,1));  //If profit=target/2, I need to make sure that the array has two identical profits


        //Set<Integer> set = new HashSet<>(list);

        Map<Integer, Integer> map = new HashMap<>();
        for (var profit: list) {
            var count = map.getOrDefault(profit, 0);
            map.put(profit, count + 1);
        }

        System.out.println(list);
        //System.out.println(set);
        System.out.println(map);

        var result = stockPairs(list, 12);
        System.out.println(result);
        //System.out.println(Arrays.toString(list));

    }

    /*public static int stockPairs(List<Integer> stocksProfit, int target)
    {
        int[] nums = new int[stocksProfit.size()];

        for (int i = 0; i < nums.length; i++)
            nums[i] = stocksProfit.get(i);

        if (nums == null || nums.length == 0 || target < 0)
            return 0;

        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> set = new HashSet<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int answer = 0;

        //LeetCode 532 (here i1-i2 = target)
        for (int key : map.keySet())
        {
            if (target == 0)
            {
                if (map.get(key) >= 2)
                    answer++;
            }
            else
            {
                if (map.containsKey(key + target))
                    answer++;
            }
        }

        for (int key : map.keySet())
        {
            if (map.containsKey(target - key) && !set.contains(target - key))
                answer++;
            set.add(key);
        }

        return answer;
    //LeetCode 532 (similar problem)
    }*/

    //111121 case3 has a ruthless edge case
    public static int stockPairs(List<Integer> stocksProfit, long target)
    {
        //constraints
        //if(constraints_toImplement)
        //    return 0:

        //Set<Integer> set = new HashSet<>(stocksProfit);

        Map<Integer, Integer> map = new HashMap<>();
        for (var profit: stocksProfit) {
            var count = map.getOrDefault(profit, 0);
            map.put(profit, count + 1);
        }

        int result = 0;

        for (var profit : stocksProfit) {
            var complement = target-profit;

            if (map.containsKey((int) complement))  //I need this "if" for case1 in order to avoid nullPointerException after checking the complement of the second "6" profit
            {
                if (profit*2 == target && map.get(profit) >=2 ) { //for case3
                    result++;
                    map.remove(profit);
                }
                else if (profit*2 != target) {
                    result++;
                    map.remove(profit); //if this key exists
                    map.remove((int) complement);
                }
            }
        }
        return result;
    }
}
