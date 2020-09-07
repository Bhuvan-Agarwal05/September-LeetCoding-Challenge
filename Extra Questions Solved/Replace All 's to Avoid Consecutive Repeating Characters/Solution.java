class Solution {
    public String modifyString(String s) {
        char[] ch = s.toCharArray();
        int c = 97,t,t2;
        for(int i=0;i<ch.length;i++)
        {
            c = 97;
            if(ch[i]=='?')
            {
                if(i-1>=0)
                    t = ch[i-1];
                else
                    t = 0;
                if(i+1<ch.length)
                    t2 = ch[i+1];
                else
                    t2 = 0;
                
                while(c==t || c==t2)
                    c++;
                ch[i] = (char)c;
            }
        }
        
        return new String(ch);
    }
}