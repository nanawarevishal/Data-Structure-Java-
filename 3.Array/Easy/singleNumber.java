package Easy;

import java.util.HashMap;
import java.util.Map;

public class singleNumber {

    static int bruteforce(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (nums[j] == num)
                    cnt++;
            }

            if (cnt == 1)
                return num;
        }

        return -1;
    }

    static int Optimal(int nums[]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int hash[] = new int[max + 1];

        for (int i = 0; i < nums.length; i++) {

            hash[nums[i]]++;
        }

        for (int i = 1; i < hash.length; i++) {

            if (hash[i] == 1) {
                return nums[i];
            }
        }

        return -1;
    }

    static int OptimalPro(int[] nums) {

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = mp.getOrDefault(nums[i], 0);

            mp.put(nums[i], val + 1);
        }

        for (Map.Entry<Integer, Integer> it : mp.entrySet())
            if (it.getValue() == 1)
                return it.getKey();

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 1, 2, 3, 3, 4, 4 };

        System.out.println(bruteforce(nums));

        System.out.println(Optimal(nums));

        System.out.println(OptimalPro(nums));
    }
}
