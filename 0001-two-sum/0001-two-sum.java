import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        
        System.out.println("Enter the target sum:");
        int target = scanner.nextInt();
        
        
        int[] indices = twoSum(nums, target);
        
        System.out.println("Output: [" + indices[0] + ", " + indices[1] + "]");
        
        scanner.close();
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        
        // Brute force approach to find two numbers
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }
        
        return indices;
    }
}