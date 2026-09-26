package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement2 {

    static int majorityElement(int[] nums1){

        int majority =0;
        int resp =0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums1)
        {
            map.put(n,1+map.getOrDefault(n,0));
            if(map.get(n)>majority)
            {
                majority =map.get(n);
                resp=n;
            }
        }

        return resp;

    }
    public static void main(String[] args) {
        int nums1[] = {2,2,1,1,1,1,2,2,2,2,2,2,3,3,3,3,3};
        System.out.println(majorityElement(nums1));
    }
}
