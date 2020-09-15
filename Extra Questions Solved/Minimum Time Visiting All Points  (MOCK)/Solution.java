class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;
        for(int i = 0; i < points.length-1;i++)
        {
            if( (Math.abs(points[i+1][0] - points[i][0])) > (Math.abs(points[i+1][1] - points[i][1])) )
                totalTime += Math.abs(points[i+1][0] - points[i][0]);
            else
                totalTime += Math.abs(points[i+1][1] - points[i][1]);
        }
        
        
        return totalTime;
    }
}