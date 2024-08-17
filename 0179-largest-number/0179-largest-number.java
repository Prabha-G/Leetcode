class Solution {
    public String largestNumber(int[] nums) {
        int temp=0;
        int n=nums.length;
      for(int i=0;i<=n-2;i++){
        for(int j=i+1;j<=n-1;j++){
            String e1=Integer.toString(nums[i]);
             String e2=Integer.toString(nums[j]);
            int s=(e1+e2).compareTo(e2+e1);
            if(s<0){
              temp=nums[i];

              nums[i]=nums[j];
              nums[j]=temp;
            }
        }
      }
      String s="";
      for(int k=0;k<n;k++){
        s+=Integer.toString(nums[k]);
      }
      
      if(s.charAt(0)=='0'){
        return "0";

      }
      else{
        return s;
      }
      
    }
    
}