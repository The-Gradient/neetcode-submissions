class Solution {
    public boolean isAnagram(String s, String t) {
        s.toLowerCase();
        t.toLowerCase();
        int ar[]=new int[26];
         int ar2[]=new int[26];
        for(int i=0;i<26;i++) {ar[i]=0;ar2[i]=0;}
        int strl1=s.length();
        int strl2=t.length();
        if(strl1!=strl2) return false;
        else
        {
            int c1,c2;
            for(int i=0;i<strl1;i++)
            {
                c1=(int)s.charAt(i);
                c2=(int)t.charAt(i);
            
                ar[c1-97]++;
                ar2[c2-97]++;
            }
            boolean flag=true;
            for(int i=0;i<26;i++)
            {
            if(ar[i]!=ar2[i]) { flag=false;break;}

            }
            return flag;
        }
    }
}
