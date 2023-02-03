class Solution:
    def findTarget(self, root: Optional[TreeNode], k: int) -> bool:
        l = dict()
        def fun(node):
            if not node:
                return
            l[node.val] = l.get(node.val,0)+1
            fun(node.left)
            fun(node.right)
        fun(root)
        for key in l:
            if k-key in l:
                if key==k-key:
                    if l[key]>1:
                        return True
                else:
                    return True
