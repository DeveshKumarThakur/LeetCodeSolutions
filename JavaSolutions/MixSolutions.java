package LeetCodeSolutions.JavaSolutions;

import java.util.Arrays;
import java.util.HashMap;

public class MixSolutions {
    public static void main(String[] args) {
        int[] A = {1,2,6,8,9};
        MixSolutions mx = new MixSolutions();
        //int res = mx.sumBetweenIndexes(A,0,2);
        //int[] res = mx.findIndexesAddUpToTarget(A,9);
        //int res = mx.romanToInteger("XV");
        int[] res =mx.insertOnFirstIndex(A,0);
        System.out.println(Arrays.toString(res));
        //System.out.println(res);
    }
    //Given an array nums, answer multiple queries about the sum
    // of elements within a specific range [i, j].
    public int sumBetweenIndexes(int[] nums, int i, int j){
        int[] arr = new int[nums.length];
        int sum=0;
        for(int k=0;k< nums.length;k++ ){
            arr[k]=sum+nums[k];
            sum=arr[k];
        }
        //System.out.println(Arrays.toString(,mmmrr));
        return i!=0 ?arr[j]-arr[i-1]:arr[j];
    }
    //Find two numbers in a sorted array that add up to a target value.
    public int[] findIndexesAddUpToTarget(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while(nums[left] + nums[right] != target){
            if(nums[left] + nums[right] <target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{left,right};
    }
    //Find the maximum sum of a subarray of size k.
//    public int[] maxSumOfSubArray(int[] nums, int target){
//        int sum =0;
//        int start = 0;
//        for(int i = 0; i< nums.length;i++){
//            if(target == sum){
//                start = i;
//               break;
//            }else{
//               sum = sum+nums[i]+nums[i+1]+nums[i+2];
//            }
//        }
//    }
    public int romanToInteger(String s){
        int ans =0;
        HashMap<Character,Integer> hs = new HashMap<>();
        hs.put('I',1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);
        for(int i = 0;i < s.length();i++){
            if(i < s.length()-1 && hs.get(s.charAt(i)) < hs.get(s.charAt(i+1))){
                ans-=hs.get(s.charAt(i));
            }else{
                ans+=hs.get(s.charAt(i));
            }
        }
        return ans;
    }

    //insert element on first index of array
    public int[] insertOnFirstIndex(int[] nums, int val) {
        // Shift elements to the right, starting from the last index
        for (int j = nums.length - 1; j > 0; j--) {
            nums[j] = nums[j - 1];
        }
        // Insert the new value at the first index
        nums[0] = val;
        return nums;
    }

}
