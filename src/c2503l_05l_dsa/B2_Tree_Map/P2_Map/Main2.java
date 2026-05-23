/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B2_Tree_Map.P2_Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author hangnt
 */
public class Main2 {

    public static void main(String[] args) {

        // =========================
        // PHAN 1: HASHMAP
        // =========================
        System.out.println("===== DEMO HASHMAP =====");

        HashMap<String, String> hashMapStudents = new HashMap<>();

        // Them du lieu
        hashMapStudents.put("SV001", "Nguyen Van An");
        hashMapStudents.put("SV002", "Tran Thi Binh");
        hashMapStudents.put("SV003", "Le Van Cuong");

        // In danh sach ban dau
        System.out.println("Danh sach sinh vien ban dau:");
        for (Map.Entry<String, String> entry : hashMapStudents.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Tim sinh vien theo ma
        System.out.println("\nTim sinh vien co ma SV002:");
        String studentName = hashMapStudents.get("SV002");
        System.out.println("SV002 -> " + studentName);

        // Cap nhat sinh vien
        System.out.println("\nCap nhat ten sinh vien SV003:");
        hashMapStudents.put("SV003", "Le Van Cuong Updated");

        // Xoa sinh vien
        System.out.println("\nXoa sinh vien SV001:");
        hashMapStudents.remove("SV001");

        // HashMap cho phep null key va null value
        System.out.println("\nThem null key va null value vao HashMap:");
        hashMapStudents.put(null, "Sinh vien chua co ma");
        hashMapStudents.put("SV004", null);

        // In lai danh sach HashMap
        System.out.println("\nDanh sach HashMap sau khi xu ly:");
        for (Map.Entry<String, String> entry : hashMapStudents.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // =========================
        // PHAN 2: HASHTABLE
        // =========================
        System.out.println("\n===== DEMO HASHTABLE =====");

        Hashtable<String, String> hashtableStudents = new Hashtable<>();

        // Them du lieu
        hashtableStudents.put("SV001", "Nguyen Van An");
        hashtableStudents.put("SV002", "Tran Thi Binh");
        hashtableStudents.put("SV003", "Le Van Cuong");

        // In danh sach ban dau
        System.out.println("Danh sach sinh vien ban dau:");
        for (Map.Entry<String, String> entry : hashtableStudents.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Tim sinh vien theo ma
        System.out.println("\nTim sinh vien co ma SV002:");
        String studentName2 = hashtableStudents.get("SV002");
        System.out.println("SV002 -> " + studentName2);

        // Cap nhat sinh vien
        System.out.println("\nCap nhat ten sinh vien SV003:");
        hashtableStudents.put("SV003", "Le Van Cuong Updated");

        // Xoa sinh vien
        System.out.println("\nXoa sinh vien SV001:");
        hashtableStudents.remove("SV001");

        // In lai danh sach Hashtable
        System.out.println("\nDanh sach Hashtable sau khi xu ly:");
        for (Map.Entry<String, String> entry : hashtableStudents.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Demo Hashtable khong cho phep null
        System.out.println("\nThu them null vao Hashtable:");

        try {
            hashtableStudents.put(null, "Sinh vien chua co ma");
        } catch (Exception e) {
            System.out.println("Loi khi them null key vao Hashtable: " + e);
        }

        try {
            hashtableStudents.put("SV004", null);
        } catch (Exception e) {
            System.out.println("Loi khi them null value vao Hashtable: " + e);
        }
    }
}
