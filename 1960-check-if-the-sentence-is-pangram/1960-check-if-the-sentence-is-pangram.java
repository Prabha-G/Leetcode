class Solution {
    public boolean checkIfPangram(String sentence) {
   sentence=sentence.toLowerCase();
        boolean[]present=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            if(Character.isLetter(c))
{
    int letterIndex=c-'a';
    present[letterIndex]=true;
}        
}
for(boolean letter:present){
 if(!letter){
    return false;
 }
}
return true;
        
}
}