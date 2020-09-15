class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0)
            return 0;
        String[] str = s.trim().split(" ");
        return str[str.length-1].length();
        
    }
}