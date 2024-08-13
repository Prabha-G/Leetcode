class Solution
{
    public void solve(int[] nums, List<Integer> list,List<List<Integer>> result,int i)
    {
        if(i==nums.length)
        {
           result.add(new ArrayList<>(list)); 
           return;
        }
        else
        {
           list.add(nums[i]); 
           solve(nums,list,result,i+1); 
           list.remove(list.size()-1); 
           solve(nums,list,result,i+1);
        }
    }
    public List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>(); 
        List<Integer> list = new ArrayList<>(); 
        solve(nums,list,result,0); 
        return result; 
    }
}