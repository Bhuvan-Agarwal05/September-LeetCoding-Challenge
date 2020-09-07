class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int row = mat.length;
        if(row%2==0)
        {
            for(int i=0;i<row;i++)
                sum += mat[i][i];
            for(int i=row-1;i>=0;i--)
                sum += mat[row-1-i][i];
        }
        else
        {
            int center = row/2;
            for(int i=0;i<row;i++)
                if(i!=center)
                    sum += mat[i][i];
            for(int i=row-1;i>=0;i--)
                sum += mat[row-1-i][i];
        }
        
        return sum;
    }
}