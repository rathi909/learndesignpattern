package leetcode;


public class InvertTree {

    public static void main(String[] args) {
        int[]  root = {4,2,7,1,3,6,9};
        //invertTree(root);
        int[] Output = {4,7,2,9,6,3,1};
    }

 public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
          this.left = left;
         this.right = right;
      }
  }


    public static TreeNode invertTree(TreeNode root) {

        if(root ==null)
        {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;

    }
}