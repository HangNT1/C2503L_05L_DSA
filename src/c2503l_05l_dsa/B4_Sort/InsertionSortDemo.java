/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B4_Sort;

/**
 *
 * @author hangnt
 */
public class InsertionSortDemo {

    public void insertionSort(int[] arr) {
        // Bat dau tu phan tu thu 2 - ve phai vi phan tu dau coi nhu da duoc sap xep 
        for (int i = 1; i < arr.length; i++) {
            // Lay key la phan tu can dem di de so sanh de chen vao vi tri dau
            int key = arr[i];
            // j: vi tri cuoi cung cua phan tu can ss khi sap xep 
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                // dich chuyen cac phan tu
                arr[j + 1] = arr[j];
                j--;
            }
            // chen key vao vi tri dung
            arr[j + 1] = key;
        }
    }

    public void inMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 8, 3, 2};
        System.out.println("Danh sach ban dau");
        new InsertionSortDemo().inMang(a);
        new InsertionSortDemo().insertionSort(a);
        System.out.println("Danh sach sau khi duoc sap xep");
        new InsertionSortDemo().inMang(a);
    }
}
