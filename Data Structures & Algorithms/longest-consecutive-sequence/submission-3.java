class Solution {
    public int longestConsecutive(int[] nums) {
       /* HashSet<Integer> set =new HashSet<Integer>();
        if(nums.length==0) return 0;
        for(int num: nums)
        {
            set.add(num);
        }
        int res=0;
        for(int num:nums)
        {
            int count=0;
            int l=num;
            while(set.contains(l))
            {
                count+=1;
                l+=1;
            }
            res=Math.max(res,count);
        }
        return res;
            */
          //  public class Solution {
    //public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}

            
        
    

