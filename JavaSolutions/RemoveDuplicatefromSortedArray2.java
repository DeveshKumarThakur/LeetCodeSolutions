// Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
//Input: nums = [1,1,1,2,2,3]
// Output: 5, nums = [1,1,2,2,3,_]
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
package LeetCodeSolutions.JavaSolutions;  
  
public class RemoveDuplicatefromSortedArray2 {  
    public int removeDuplicates(int[] nums) {  
        int index = 2;  
        for (int i = 2; i < nums.length; i++) {  
            if (nums[i] != nums[index - 2]) {  
                nums[index] = nums[i];  
                index++;  
            }  
        }  
        return index;  
    }  
  
    public static void main(String[] args) {  
        int[] input = {1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4};  
        RemoveDuplicatefromSortedArray2 solution = new RemoveDuplicatefromSortedArray2();  
        int newLength = solution.removeDuplicates(input);  
          
        System.out.println("New length: " + newLength);  
        System.out.print("Modified array: ");  
        for (int i = 0; i < newLength; i++) {  
            System.out.print(input[i] + " ");  
        }  
    }  
}  
