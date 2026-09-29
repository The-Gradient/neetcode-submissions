class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    /*ArrayList<Integer> res = new ArrayList<Integer>();
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    for(Integer i : nums)
    {
        map.putIfAbsent(i,0);
       // map.get(i)++;
    }
    for(Integer i: map.getKeySet())
    {
        if(map.get(i)>=k)
        {
            res.add(i);
        }
    }
   // return res;
    int l=res.size();
    int res2[]=new int[l];
    int j=0;
    for(Integer i : res) res[j++]=(int)i;
    return <>>*/
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int num : nums)
    {
        map.put(num,map.getOrDefault(num,0)+1);
    }
    List<int[]> arr = new ArrayList<>();
    for(HashMap.Entry<Integer,Integer> entry : map.entrySet())
    {
        arr.add(new int[] {entry.getValue(),entry.getKey()});
    }
    arr.sort((a,b)->b[0]-a[0]);
    int[] res = new int[k];
    for(int i=0;i<k;i++)
    {
        res[i]=arr.get(i)[1];
    }
    return res;
    }
}
