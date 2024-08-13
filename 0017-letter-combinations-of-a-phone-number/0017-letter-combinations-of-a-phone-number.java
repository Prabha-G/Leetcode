class Solution 
{
    public static void solve(int i,String digits,String etho_onnu,HashMap<Character,String> dial,List<String> result)
    { // i = 0 digits = "23"
        if(i==digits.length())
        {
           result.add(etho_onnu); 
           return;
        }
        else
        {
            String pair = dial.get(digits.charAt(i)); //pair = "abc" 
            for(int ind=0 ; ind<=pair.length()-1 ; ind++)
            {
                solve(i+1,digits,etho_onnu+pair.charAt(ind),dial,result); 
            }
        }
    }
    public static List<String> letterCombinations(String digits)
    {
        List<String> result = new ArrayList<>();   
        if(digits.length()==0)
        {
            return result;
        }
        HashMap<Character,String> dial = new HashMap<>(); 
        dial.put('2',"abc");
        dial.put('3',"def");
        dial.put('4',"ghi");
        dial.put('5',"jkl");
        dial.put('6',"mno");
        dial.put('7',"pqrs");
        dial.put('8',"tuv");
        dial.put('9',"wxyz");
        String etho_onnu = ""; 
        solve(0,digits,etho_onnu,dial,result); //method calling  
        return result;
    }
}