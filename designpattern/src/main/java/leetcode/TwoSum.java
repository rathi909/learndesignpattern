package leetcode;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
         int[] ta = new int[2];
         int left =0;
         int right = numbers.length-1;
         while(left<right)
         {
            int sum = numbers[left]+numbers[right];
            if(sum == target)
            {
                ta[0]=left;
                ta[1]=right+1;
            }
            else if(sum<target)
            {
                left++;

            }
            else{
                right--;
            }
         }
         return ta;

        
    }
}