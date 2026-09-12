class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        int l=nums.length;
        map.put(nums[0],0);
        int[] result= new int[2];
        for(int i=1;i<l;i++)
        {
            int check=target-nums[i];
            if(map.containsKey(check))
            {
                result[0]=map.get(check);
                result[1]=i;
                break;
            }
            else
            map.put(nums[i],i);
        }
    return result;
    }
}
