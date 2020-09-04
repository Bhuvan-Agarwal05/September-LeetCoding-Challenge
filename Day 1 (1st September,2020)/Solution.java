class Solution {
    public String largestTimeFromDigits(int[] A) {
        String result = "";
        for(int i = 0; i < 4; ++i)
        {
            for(int j = 0; j < 4; ++j)
            {
                for(int k = 0; k < 4; ++k)
                {
                    if(i == j || j == k || k == i) 
                        continue;
                    String hh = A[i] + "" + A[j];
                    String mm = A[k] + "" + A[6-i-j-k];
                    String _time = hh + ":" + mm;
                    if(hh.compareTo("24") < 0 && mm.compareTo("60") < 0 && _time.compareTo(result) > 0) 
                        result = _time;
                }
            }
        }
        return result;
    }
}