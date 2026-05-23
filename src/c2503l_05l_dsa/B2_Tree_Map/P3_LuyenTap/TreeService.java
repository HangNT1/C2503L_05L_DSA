/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangdemo1.Buoi2_Tree_HashMap_HashTable.P3_LuyenTap;

import java.util.List;

/**
 *
 * @author hangnt
 */
public class TreeService {
    // In toàn bộ cây

    public void printTree(TreeNode node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.getData());

        for (TreeNode child : node.getChildren()) {
            printTree(child, indent + "  ");
        }
    }

    // Tìm kiếm node theo tên
    public TreeNode searchNode(TreeNode node, String keyword) {
        if (node == null) {
            return null;
        }

        if (node.getData().equalsIgnoreCase(keyword)) {
            return node;
        }

        for (TreeNode child : node.getChildren()) {
            TreeNode result = searchNode(child, keyword);

            if (result != null) {
                return result;
            }
        }

        return null;
    }

    // Thêm node con vào node cha
    public boolean addNode(TreeNode root, String parentName, String childName) {
        TreeNode parent = searchNode(root, parentName);

        if (parent == null) {
            return false;
        }

        TreeNode newChild = new TreeNode(childName);
        parent.addChild(newChild);

        return true;
    }

    // Sửa tên node
    public boolean updateNode(TreeNode root, String oldName, String newName) {
        TreeNode node = searchNode(root, oldName);

        if (node == null) {
            return false;
        }

        node.setData(newName);
        return true;
    }

    // Xóa node
    public boolean deleteNode(TreeNode root, String nodeName) {
        if (root == null) {
            return false;
        }

        // Không cho xóa root
        if (root.getData().equalsIgnoreCase(nodeName)) {
            return false;
        }

        return deleteNodeRecursive(root, nodeName);
    }

    private boolean deleteNodeRecursive(TreeNode parent, String nodeName) {
        List<TreeNode> children = parent.getChildren();

        for (int i = 0; i < children.size(); i++) {
            TreeNode child = children.get(i);

            if (child.getData().equalsIgnoreCase(nodeName)) {
                children.remove(i);
                return true;
            }

            boolean deleted = deleteNodeRecursive(child, nodeName);

            if (deleted) {
                return true;
            }
        }

        return false;
    }
}
