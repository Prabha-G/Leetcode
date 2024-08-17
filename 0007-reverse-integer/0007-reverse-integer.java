class Solution {
    public int reverse(int x) {
        int rem = 0, dig = 0;
       boolean isNegative = x < 0;
        x = Math.abs(x);

        while (x > 0) {
            rem = x % 10;
            x /= 10;

           
            if (dig > (Integer.MAX_VALUE - rem) / 10) {
                return 0;
            }

            dig = dig * 10 + rem;
        }

        
        if (isNegative) {
            dig = -dig;
        }

        return dig;
    }
}
