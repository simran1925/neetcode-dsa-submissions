class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            int moreForSum = target-num;
            if(map.containsKey(moreForSum))
            {
                return new int[]{map.get(moreForSum),i};
            }
            map.put(num,i);
        } 
       return new int[]{-1,1};
    }
}
