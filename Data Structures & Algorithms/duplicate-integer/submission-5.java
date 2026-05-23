class Solution {
    public boolean hasDuplicate(int[] nums) {

        //Approach 1 : O(nlogn)
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     if(nums[i]==nums[i+1])
        //     {
        //         return true;
        //     }
        // }
        // return false;

        //Approach 2nd : Using Xor - it will work only if you have exactly one duplicate and you are returning the duplicate element not the true /false and the elements are from 1 to n-1 or 0 to n
    //     int xor=0;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         xor=xor ^ nums[i];
    //     }
    //     for(int i=1;i<=nums.length-1;i++)
    //     {
    //         xor=xor ^ i;
    //     }
    //    return xor;

    // Approach 3rd - can be used for all conditioins 
     // 1. whether for multiple duplciates 
     // 2. for unsorted elements 
     // 3. in case of true / false or in case of returning duplicates 

     Set<Integer> seen = new HashSet<>();
     Set<Integer> duplicates = new HashSet<>();   //can store duplicates and return it if we have to return duplicates 

     for(int i=0;i<nums.length;i++)
     {
        if(!seen.add(nums[i]))
        {
            return true;
        }
        seen.add(nums[i]);
     }
     return false;
    }
}