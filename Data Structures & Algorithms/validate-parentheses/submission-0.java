class Solution {
    public boolean isValid(String str) {
        HashMap <Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> s = new Stack<>();
        int l= str.length();
        for(int i=0;i<l;i++)
        {
            Character c= str.charAt(i);
            if(map.containsKey(c)&&!s.isEmpty())
            {
                if(s.pop()!=map.get(c))
                return false;
                
                
            }
            else
            s.push(c);
        }
        return s.isEmpty();
        
    }
}
