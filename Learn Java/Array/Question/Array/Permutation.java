/*
       Leet Code Question


1920. Build Array from Permutation

Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive). 

*/

public class Permutation {

    public static void main(String[] args) {

        int[] nums = {5,0,1,2,3,4};


        // Method 1   time complexity is O(n^2) and space complexity O(n)
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }

      

      // Method 2  time complexity is O(n), and the space complexity is O(n) 

       int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++){

            int j = nums[i];
            ans[i] = nums[j];
        }
      

      
      // Method 3  time complexity is O(n) and the space complexity is O(1)
      for(int i=0; i<nums.length;i++){
            nums[i] = nums.length * (nums[nums[i]]% nums.length)+nums[i];
        }
            
        for(int k=0; k<nums.length;k++){
            nums[k] = nums[k]/nums.length;
        }
    }
}  
