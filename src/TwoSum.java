import java.util.HashMap;
import java.util.Map;
//方法一 暴力破解
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++){
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
    throw new IllegalArgumentException("No two sum solution");
    }
}
//查表法

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer,Integer> hashmap = new HashMap<>(len-1);
        hashmap.put(nums[0],0);
        for(int i = 1; i < len; i++)
        {
            int another = target - nums[i];
            if(hashmap.containsKey(another)){
                return new int[]{i,hashmap.get(another)};
            }
            hashmap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}