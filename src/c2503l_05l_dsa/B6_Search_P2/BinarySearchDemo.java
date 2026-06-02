/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B6_Search_P2;

/**
 *
 * @author hangnt
 */
public class BinarySearchDemo {

    public int binarySearch(int[] arr, int target) {
        int left = 0; // Vi tri 0 
        int right = arr.length - 1; // Vi tri cuoi cung 
        while (left <= right) {
            // tinh mid 
            int mid = (left + right) / 2;
            // So sanh de tim kiem 
            if (arr[mid] == target) {
                // Tim thay 
                return mid; // vi tri tim thay
            } else if (arr[mid] < target) {
                // ben phai => cai gi thay doi => bo ben trai
                left = mid + 1; // left = mid 
            } else {
                // right thay doi 
                right = mid - 1;// right = mid 
            }
        }
        return -1; // TH k tim thay
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7};
        int search = new BinarySearchDemo().binarySearch(a, 6);
        if (search == -1) {
            System.out.println("Khong tim thay gia tri");
        } else {
            System.out.println("Tim thay gia tri o vi tri " + search);
        }
    }
}
