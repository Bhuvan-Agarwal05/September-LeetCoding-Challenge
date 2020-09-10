class Solution {
    public String reverseOnlyLetters(String S) {
        int low = 0;
        int high = S.length()-1;
        char[] ch = S.toCharArray();
        while(low<high)
        {
            if( ((S.charAt(low)>='a' && S.charAt(low)<='z') || (S.charAt(low)>='A' && S.charAt(low)<='Z')) && ((S.charAt(high)>='a' && S.charAt(high)<='z') || (S.charAt(high)>='A' && S.charAt(high)<='Z')) )
            {
                char temp = ch[high];
                ch[high] = ch[low];
                ch[low] = temp;
                low++;
                high--;
            }
            else if(((S.charAt(low)>='a' && S.charAt(low)<='z') || (S.charAt(low)>='A' && S.charAt(low)<='Z')))
                high--;
            else
                low++;
        }
        
        return new String(ch);
    }
}