/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B2_Tree_Map.P2_Map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        // Map -> HashMap & HashTable 
        // SV001 - Nguyen Van A
        // SV002 - Nguyen Van B 
        // key - duy nhat - value - co the trung nhau => Dang luu cua map 
        // Toc do: moi nhanh hon - HashMap
        // Pho bien hien nay - Cu va it dung hon 
        // value: Cho phep value dau vao null => HashMap 
        // SV001 - null 
        // SV002 - null 
        // value: Gia tri khong duoc phep null => HashTable 
        // key: Cho phep null key - 1 key null -> HashMap 
        // value : Key khong duoc phep null -> HashTable 
        HashMap<String, String> maps = new HashMap<>();
        // Them phan tu vao map: put 
        maps.put("USA", "Washington");
        maps.put("France", "Paris");
        maps.put("Vietnam", "Hanoi");
        maps.put("Japan", "Tokyo");
        // Lay gia tri cua phan tu -> key: get 
        System.out.println("Value: " + maps.get("USA")); //  => in ra value: Washington
        // Cap nhap gia tri USA - thanh "test" => put 
        maps.put("USA", "test");
        System.out.println("Value: " + maps.get("USA")); //  => in ra value: Washington
        // Xoa => key: remove 
        maps.remove("USA");
        System.out.println("Value: " + maps.get("USA")); //  => in ra value: Washington
        // in map 
        for (Map.Entry<String, String> entry : maps.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Key - " + key + "Value - " + val);
        }
    }
}
