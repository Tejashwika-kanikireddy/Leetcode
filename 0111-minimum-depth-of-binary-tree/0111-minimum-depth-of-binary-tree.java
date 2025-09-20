class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        int d=1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                TreeNode node = q.poll();

                if(node.left==null && node.right==null) return d;

                if(node.left!=null) q.add(node.left);

                if(node.right!=null) q.add(node.right);

            }
            d++;
            
        }

        return d;
    }
}