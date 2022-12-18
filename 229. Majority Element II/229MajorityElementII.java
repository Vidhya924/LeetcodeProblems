*/229. Majority Element II
Medium
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
/*

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Integer cand1 = null, cand2 = null;
        int count1 = 0, count2 = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (cand1 != null && cand1 == nums[i]) {
                count1 ++;
            }
            else if (cand2 !=null && cand2 == nums[i]) {
                count2 ++;
            }
            else if (count1 == 0) {
                cand1 = nums[i];
                count1 ++;
            }
            else if (count2 == 0) {
                cand2 = nums[i];
                count2 ++;
            }
            else {
                count1 --;
                count2 --;
            }
        }
        List<Integer> sol = new LinkedList<Integer>();
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (cand1 != null && nums[i] == cand1) {
                count1 ++;
            }
            if (cand2 != null && nums[i] == cand2) {
                count2 ++;
            }
        }
        if (count1 > nums.length / 3) {
            sol.add(cand1);
        }
        if (count2 > nums.length / 3) {
            sol.add(cand2);
        }
        return sol;
    }