class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int l=numbers.length; int[] res= new int[2];
        for(int i=0;i<l;i++)
        {
            int search=target-numbers[i];
            if(map.containsKey(search))
            {
                res[1]=i+1;
                res[0]=map.get(search)+1;
                return res;
            }
            map.put(numbers[i],i);
        }
        return res;
        
    }
}
