class Solution {
    public int[] twoSum(int[] numbers, int target) {
       /* HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
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
        return res;*/

        int res[] = new int[2];
        int len=numbers.length;
        for(int i=0;i<len-1;i++)
        {
            int search= target-numbers[i];
           int l=i+1;
           int r=len-1;
            while(l<=r)
            {
                int mid=l+(r-l)/2;
                if(search==numbers[mid])
                {
                    res[0]=i+1;
                    res[1]=mid+1;
                    return res;
                }
                if(search>numbers[mid]) l=mid+1;
                else r=mid-1;
            }
        }
        return res;

    }
}
