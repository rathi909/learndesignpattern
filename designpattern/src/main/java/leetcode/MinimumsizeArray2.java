package leetcode;

public class MinimumsizeArray2 {

    static int  minSubArrayLen(int[] nums,int target){
       int sum=0;
       int min = Integer.MAX_VALUE;
       int left=0;
       int right=1;
       sum = nums[0];
       for(int i=right;i<nums.length;i++)
       {
           sum = sum+nums[i];
           while(sum>target)
           {
               sum=sum-nums[left];
               left++;

           }
           if(sum==target)
           {
               min = Math.min(min,i-left);
           }

       }

        return min;
    }


    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(nums,target));
    }
}
