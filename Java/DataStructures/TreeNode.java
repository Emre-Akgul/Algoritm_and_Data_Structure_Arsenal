/**
 * TreeNode
 */
public class TreeNode {

    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(){

    }

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(TreeNode left, TreeNode right, int val){
        this.left = left;
        this.right = right;
        this.val = val;
    }
}