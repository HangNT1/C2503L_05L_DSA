/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B5_Search.P2_Search;

/**
 *
 * @author hangnt
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] a = new int[]{5, 3, 6, 9, 1, 0};
        int search = 1;
        int indexSearch = -1; // Gan gia tri ban dau 
        for (int i = 0; i < a.length; i++) {
            if (a[i] == search) {
                // tim thay 
                System.out.println("Da tim thay phan tu " + search + "o vi tri: " + i);
                indexSearch = i;
                break;
            }
        }
        if (indexSearch == -1) {
            System.out.println("Khong tim thay phan tu " + search);
        }
    }
    //binary search => cay nhi phan => luyen tap tren lop buoi 5 
}
