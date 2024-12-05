def invert_binary_tree(root): 
    def reverse_node(node):
        if node == None:
            return;
        reverse_node(node.left)
        reverse_node(node.right)
        temp = node.left
        node.left = node.right
        node.right = temp
    reverse_node(root)
    return root