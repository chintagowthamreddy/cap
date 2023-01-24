class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if root==None:
            return 0
        l=self.maxDepth(root.left)
        r=self.maxDepth(root.right)
        return max(l,r)+1
