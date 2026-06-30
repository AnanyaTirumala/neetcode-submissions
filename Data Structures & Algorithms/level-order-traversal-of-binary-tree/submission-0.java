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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int length = queue.size();

            for(int i=0; i<length; i++){
                TreeNode cur = queue.poll();
                if(cur!=null){
                    level.add(cur.val);
                    queue.add(cur.left);
                    queue.add(cur.right);
                } 
            }

            if(level.size()>0){
                result.add(level);
            }
        }

        return result;
    }
}
