/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B2_Tree_Map.P1_Tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class TreeNode {

    private String data; // dai dien cho cac du lieu cua node 
    // Node co the con 0 hoac nhieu con => List danh sacsh cac node 
    private List<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>(); // Khoi tao 1 list de chuan bi san sang add con vao cha 
    }

    public TreeNode() {
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

    // add node con vao node cha 
    public void addChild(TreeNode child) {
        this.children.add(child);
    }
}
