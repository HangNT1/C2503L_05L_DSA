/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangdemo1.Buoi2_Tree_HashMap_HashTable.P3_LuyenTap;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class TreeNode {

    private String data;
    private List<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }
}
