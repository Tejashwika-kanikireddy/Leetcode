class Solution {
    public int[][] generateMatrix(int n) {
        int val=1;
        int[][] arr = new int[n][n];
        int left=0,top=0,right=n-1,bottom=n-1;
        while(left<=right && top <= bottom)
        {
            for(int i=left;i<=right;i++)
            {
                arr[top][i]=val++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                arr[i][right]=val++;
            }
            right--;
             for(int i=right;i>=left;i--)
            {
                arr[bottom][i]=val++;
            }
            bottom--;
             for(int i=bottom;i>=top;i--)
            {
                arr[i][left]=val++;
            }
            left++;
        }
    return arr;
    }
}