/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B2_Tree_Map.P1_Tree;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        // B1: Tao root 
        TreeNode root = new TreeNode("Home");
        // B2: Tao cac not con cua root 
        TreeNode aboutUsTree = new TreeNode("About us");
        TreeNode serviceTree = new TreeNode("Service");
        TreeNode contactTree = new TreeNode("Contact");
        // B3: Tao cac not con cua Service
        TreeNode webTree = new TreeNode("Web Development");
        TreeNode mobileTree = new TreeNode("Mobile App");

        // B4: Gan con cho goc 
        root.addChild(aboutUsTree);
        root.addChild(serviceTree);
        root.addChild(contactTree);

        // B5: Gan con cho cac phan cap con lai 
        serviceTree.addChild(webTree);
        serviceTree.addChild(mobileTree);

        // B6: In 
        // Vong lap 1 in cac con cua root
        System.out.println(root.getData());
        for (TreeNode childLevel1 : root.getChildren()) {
            System.out.println(" " + childLevel1.getData());
            for (TreeNode childLevel2 : childLevel1.getChildren()) {
                System.out.println("  " + childLevel2.getData());
            }
        }
    }

}
