/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        int childcount=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int parentcount=0;
                TreeNode curr=queue.poll();
                if(curr.left!=null){
                    if(curr.left.val==x || curr.left.val==y){
                        childcount++;
                        parentcount++;
                    }
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    if(curr.right.val==x || curr.right.val==y){
                        childcount++;
                        parentcount++;
                    }
                    queue.offer(curr.right);
                }
                if(parentcount==2){
                    return false;

                }
                
            }
            if(childcount==2){
                    return true;
                }
                if(childcount==1){
                    return false;
                }
        }
        return false;
    }
}