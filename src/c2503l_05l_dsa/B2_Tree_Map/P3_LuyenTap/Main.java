/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangdemo1.Buoi2_Tree_HashMap_HashTable.P3_LuyenTap;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {

        TreeService treeService = new TreeService();

        // Tạo cây menu ban đầu
        TreeNode root = new TreeNode("Home");

        TreeNode aboutUs = new TreeNode("About Us");
        TreeNode services = new TreeNode("Services");
        TreeNode contact = new TreeNode("Contact");

        TreeNode webDevelopment = new TreeNode("Web Development");
        TreeNode mobileApps = new TreeNode("Mobile Apps");

        services.addChild(webDevelopment);
        services.addChild(mobileApps);

        root.addChild(aboutUs);
        root.addChild(services);
        root.addChild(contact);

        System.out.println("MENU BAN DAU:");
        treeService.printTree(root, "");

        // Tìm kiếm
        System.out.println("\nTIM KIEM NODE Services:");
        TreeNode foundNode = treeService.searchNode(root, "Services");

        if (foundNode != null) {
            System.out.println("Tim thay: " + foundNode.getData());
        } else {
            System.out.println("Khong tim thay");
        }

        // Thêm Blog vào Home
        System.out.println("\nTHEM Blog vao Home:");
        boolean addResult = treeService.addNode(root, "Home", "Blog");

        if (addResult) {
            System.out.println("Them thanh cong");
        } else {
            System.out.println("Khong tim thay node cha");
        }

        treeService.printTree(root, "");

        // Thêm SEO Service vào Services
        System.out.println("\nTHEM SEO Service vao Services:");
        treeService.addNode(root, "Services", "SEO Service");
        treeService.printTree(root, "");

        // Sửa Mobile Apps thành Mobile Application
        System.out.println("\nSUA Mobile Apps thanh Mobile Application:");
        boolean updateResult = treeService.updateNode(root, "Mobile Apps", "Mobile Application");

        if (updateResult) {
            System.out.println("Sua thanh cong");
        } else {
            System.out.println("Khong tim thay node can sua");
        }

        treeService.printTree(root, "");

        // Xóa Contact
        System.out.println("\nXOA Contact:");
        boolean deleteResult = treeService.deleteNode(root, "Contact");

        if (deleteResult) {
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Khong tim thay node can xoa hoac khong duoc xoa root");
        }

        treeService.printTree(root, "");

        // Xóa Services
        System.out.println("\nXOA Services:");
        treeService.deleteNode(root, "Services");
        treeService.printTree(root, "");
    }
}
