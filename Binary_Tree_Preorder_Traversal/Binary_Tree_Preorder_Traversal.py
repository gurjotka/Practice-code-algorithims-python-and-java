class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def preorder_traversal(self, root):
        ans = []
        if not root:
            return ans
        stack = [root]

        while stack:
            node = stack.pop()
            ans.append(node.val)

            if node.right:
                stack.append(node.right)
            if node.left:
                stack.append(node.left)

        return ans

def build_tree(values):
    if not values:
        return None

    nodes = [TreeNode(val) if val is not None else None for val in values]
    kids = nodes[::-1]
    root = kids.pop()

    for node in nodes:
        if node:
            if kids:
                node.left = kids.pop()
            if kids:
                node.right = kids.pop()

    return root

values = [1, None, 2, 3]
root = build_tree(values)
print(Solution().preorder_traversal(root))

values2 = [1,2,3,4,5,None,8,None,None,6,7,9]
root2 = build_tree(values2)
print(Solution().preorder_traversal(root2))

values3 = []
root3 = build_tree(values3)
print(Solution().preorder_traversal(root3))

values4 = [1]
root4 = build_tree(values4)
print(Solution().preorder_traversal(root4))