package leetcode;

public class MinimumSizeArray {

    public static void main(String[] args) {
        int[] num = {1,1,1,1,1,1,1,1};
        int taget =11;
        System.out.println(minimalLength(num,taget));
    }

    private static int minimalLength(int[]  arr,int target){
        int max =0;
        int sum =0;
        int count =0;
        int result =Integer.MAX_VALUE;
        int previous = 0;
      for(int i=0;i<arr.length;i++)
      {
         count++;
         sum =sum+arr[i];
         while(sum>=target)
         {
             result = Math.min(result,count);
             sum = sum -arr[previous];
             previous++;
             count--;
         }

      }
      return result ==Integer.MAX_VALUE? 0:result;
    }
}
