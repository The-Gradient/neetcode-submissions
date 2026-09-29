class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        List<Integer> len = new ArrayList<>();
        for(String str:strs)
        {
            len.add(str.length());
        }
        StringBuilder res = new StringBuilder();
        for(int l : len)
        {
            res.append(l).append(',');
        }
        res.append('#');
        for(String str: strs)
        res.append(str);
        return res.toString();

    }

    public List<String> decode(String str) {
        if(str.length()==0) return new ArrayList<>();
        List<Integer> len = new ArrayList<>();
        List<String> res = new ArrayList<String>();
        int i=0;
        while(str.charAt(i)!='#')
        {
            StringBuilder l = new StringBuilder();
            while(str.charAt(i)!=','){
            l.append(str.charAt(i));i++;}
            len.add(Integer.parseInt(l.toString()));
            i++;
        }
        i++;
        for(int size:len)
        {
            res.add(str.substring(i,i+size));
            i+=size;
        }
        return res;


    }
}
