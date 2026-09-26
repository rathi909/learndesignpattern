package leetcode;

import java.util.Arrays;
import java.util.Collections;

class removeElement {

    public static void main(String[] args) {
        Integer[] nums = {3,2,2,3};
        int val =2;
        removeElement(nums,val);
    }
    public static int removeElement(Integer[] nums, int val) {

        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == val)
            {
                nums[i] =0;
            }
            else {
                count++;
            }
        }
        Arrays.sort(nums, Collections.reverseOrder());
        return count;
    }
}