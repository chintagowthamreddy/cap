class Solution:
    c=0
    def convertBST(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root==None:
            return
        self.convertBST(root.right)
        root.val+=self.c
        self.c=root.val
        self.convertBST(root.left)
        return root
