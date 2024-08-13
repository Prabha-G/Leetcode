class Solution
{
    public void solve(int n,String str,int op,int cl,List<String> result)
    {
       if(op==n && cl==n)
       {
          result.add(str); 
          return;
       }
       else
       {
          if(op<n)
          {
            solve(n,str+"(",op+1,cl,result);
          }
          if(op > cl)
          {
            solve(n,str+")",op,cl+1,result);
          }
       }
    }
    public List<String> generateParenthesis(int n)
    {
        List<String> result = new ArrayList<>(); 
        String str="";  
        solve(n,str,0,0,result);  
        return result;
    }
}