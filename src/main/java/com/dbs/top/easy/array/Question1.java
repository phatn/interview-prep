package com.dbs.top.easy.array;

import java.util.Arrays;

/**
 * Remove Duplicates from Sorted Array
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 */
public class Question1 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(Arrays.toString(nums));
        new Question1().removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        int j, len = nums.length;
        for(int i = 0; i < len - 1; i++) {
            j = i + 1;
            while(j < len) {
                if(nums[i] == nums[j]) {
                    delete(nums, j);
                    len = len - 1;
                } else {
                    j++;
                }
            }
        }
        return len;
    }

    private void delete(int[] nums, int k) {
        while(k < nums.length - 1) {
            nums[k] = nums[k + 1];
            k++;
        }
    }
}
