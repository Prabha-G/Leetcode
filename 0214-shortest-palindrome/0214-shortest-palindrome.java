class Solution {
    public String shortestPalindrome(String s) { 
        if(s.equals(""))
        {
            return "";
        }
     String s1="";
     int j,maxj=0,e=0;
        for(j=s.length()-1;j>=0;j--){
              if((pali(s,0,j))==true){
                 e = j; 
                 break;
              }
            }
        String str = s.substring(e+1, s.length());
        char ch[] = str.toCharArray();
        String st = "";
        for (int k = str.length() - 1; k >= 0; k--) {
            st += ch[k];
        }
        return st+s ;
        }
     public boolean pali(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
              return false;
            i++;
            j--;     
       } 
       return true;
  }
 }

