class Solution
{
    public void reverse(int[] arr,int start,int end)
    {
         int n = arr.length;  
         while(start<end)
         {
             int temp = arr[start]; 
             arr[start] = arr[end]; 
             arr[end]  =temp; 
             start++; 
             end--;
         }
    }
    public void rotate(int[][] matrix)
    {
        int n = matrix.length; 
        int m = matrix[0].length;  
        int i,j; 
        for(i=0 ; i<=n-2; i++)
        {
            for(j=i+1 ; j<=m-1 ;j++)
            {
                int temp = matrix[i][j]; 
                matrix[i][j] = matrix[j][i]; 
                matrix[j][i] = temp;
            }
        }
        for(i=0;i<n;i++)
        {
           reverse(matrix[i],0,m-1);
        }

    }
}