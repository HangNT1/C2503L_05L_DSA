/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B4_Sort;

/**
 *
 * @author hangnt
 */
public class SelectionSortDemo {

    public void selectionSort(int[] a) {
        // Vong lap dung i chon vi tri can sap xep 
        for (int i = 0; i < a.length - 1; i++) {
            // tim so be nhat 
            // GS phan tu be nhat dang o vi tri i - vi tri nho nhat 
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                // So sanh 
                if (a[j] < a[minIndex]) {
                    minIndex = j;// Cap nhap lai vi tri min
                }
            }
            // Tim duoc min => Doi cho 
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public void inMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 8, 4, 2};
        System.out.println("Ds mang ban dau");
        new SelectionSortDemo().inMang(a);
        new SelectionSortDemo().selectionSort(a);
        System.out.println("Ds mang sau khi sap xep");
        new SelectionSortDemo().inMang(a);
    }
}
