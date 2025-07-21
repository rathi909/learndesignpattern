package leetcode;

public class Mergsort {

    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0};{1,2,2,3,5,6}
//        int m = 3;
//        int[] nums2 = {2,5,6};
//        int n =3;
//
//        merge(nums1,m,nums2,n);
        int[]  nums3= {0,1,2,2,2,5,4,2};
                int val = 2;
          System.out.println(removeValue(nums3,val));

    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }


    public static  int removeValue(int[] arr,int v){

        int i=0;
        int j=arr.length-1;



        while(i<=j)
        {
            if(arr[i] != v)
            {
                i++;

            }
            else {
                if(arr[j]!=v){
                    arr[i]=arr[j];

                }
                else {
                     j--;
                     arr[i]=arr[j];

                }
                j--;
                i++;
            }
        }
        return i;
    }
}