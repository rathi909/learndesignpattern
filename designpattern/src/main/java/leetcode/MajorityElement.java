package leetcode;

import java.util.HashMap;
import java.util.Map;


// This question is solved based on the assumption the majority element occurence  is always
// greater than n/2

public class MajorityElement {

    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        int nums1[] = {2,2,1,1,1,2,2,3,3,3};

        System.out.println(majorityElement(nums));
        System.out.println(majorityElement1(nums));

    }

    public static int majorityElement(int[] nums) {
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            if (majority == 0) {
                res = n;
            }

            majority += n == res ? 1 : -1;
        }

        return res;
    }


    public static int majorityElement1(int[] nums) {
        int res = 0;
        int majority = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n,1+map.getOrDefault(n,0));
            if(map.get(n)> majority)
            {
                majority = map.get(n);
                res =n;
            }
        }

        return res;
    }
}
