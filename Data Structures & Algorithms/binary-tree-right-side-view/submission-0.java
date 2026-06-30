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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int qLen = queue.size();
            TreeNode rightmost = null;

            for(int i=0; i<qLen; i++){
                TreeNode node = queue.poll();
                if(node != null){
                    rightmost = node;
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            if(rightmost!=null){
                result.add(rightmost.val);
            }
        }

        return result;

    }
}
