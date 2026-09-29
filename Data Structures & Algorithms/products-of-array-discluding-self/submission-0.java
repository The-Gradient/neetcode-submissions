class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int i=0;
        int[] prefix = new int[l];
        int[] suffix = new int[l];
        prefix[0]=1;
        suffix[l-1]=1;
        for(i=1;i<l;i++)
        {
         prefix[i]=prefix[i-1]*nums[i-1];
         suffix[l-1-i]=suffix[l-i]*nums[l-i];
        }
        int[] res = new int[l];
        for(i=0;i<l;i++){
            res[i]= prefix[i]*suffix[i];
        }
        return res;
    }
}  
