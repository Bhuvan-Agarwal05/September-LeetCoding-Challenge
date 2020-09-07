class Solution {
    private int shift_count(int[][] A, int[][] B){
        int n = A.length, count = 0;
        for(int x = 0; x < n; ++x)
        {
            for(int y = 0; y < n; ++y)
            {
                int temp = 0;
                for(int i = y; i < n; ++i)
                {
                    for(int j = x; j < n; ++j)
                        if(A[i][j] == 1 && B[i-y][j-x] == 1) 
                            temp++;
                }
                count = Math.max(count, temp);
            }
        }
        return count;
    }
    public int largestOverlap(int[][] A, int[][] B) 
    {
        return Math.max(shift_count(A, B), shift_count(B, A));
    }
}