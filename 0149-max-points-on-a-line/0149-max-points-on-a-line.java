class Solution {
    public int maxPoints(int[][] points) {
        int ans = 1;
        int n = points.length;
        if(n <= 2){
            return n;
        }
        for(int i = 0; i < n - 1; i++){
            HashMap<Double, Integer> map = new HashMap<>();
            for(int j = i + 1; j < n; j++){
                if(points[j][0] == points[i][0]){
                    map.put(-90.0, map.getOrDefault(-90.0, 0) + 1);
                }else if(points[j][1] == points[i][1]){
                    map.put(0.0, map.getOrDefault(0.0, 0) + 1);
                }
                else{
                    double slope = ((double)(points[j][1] - points[i][1]))/((double)(points[j][0] - points[i][0]));
                    map.put(slope, map.getOrDefault(slope, 0) + 1);
                }
            }
            int temp_max = 0;
            for(Map.Entry<Double, Integer> slope : map.entrySet()){
                temp_max =  Math.max(temp_max, slope.getValue() + 1);
               
            }
            ans = Math.max(ans, temp_max);
        }
        return ans;
    }
}