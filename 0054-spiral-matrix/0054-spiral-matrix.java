class Solution {
	public List<Integer> spiralOrder(int[][] matrix)
	{
		List<Integer> res = new ArrayList<>();  
		int n=matrix.length; 
		int m=matrix[0].length;
		int top=0,left=0,bottom=n-1,right=m-1,i;
		while(left<=right && top<=bottom)
		{
			for( i = left ; i<=right ; i++)
			{
				res.add(matrix[top][i]);
			}
			top++;
			for(i = top ; i<=bottom ; i++)
			{
				res.add(matrix[i][right]);
			}
			right--; 
            if(top<=bottom)
            {
			for(i = right ; i>=left ; i--)
			{
				res.add(matrix[bottom][i]);
			}
            }
			bottom--; 
            if(left<=right)
            {
			for(i = bottom ; i>=top ; i--)
			{
				res.add(matrix[i][left]);
			}
			left++;
            }
		} 
		return res;

	}
}