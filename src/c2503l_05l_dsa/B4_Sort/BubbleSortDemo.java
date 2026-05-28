/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B4_Sort;

/**
 *
 * @author hangnt
 */
public class BubbleSortDemo {

    public void bubbleSort(int[] arr) {
        // Vong lap ngoai dai dien cho viec duyet lan luot cac phan tu dau -> cuoi 
        for (int i = 0; i < arr.length - 1; i++) {
            // vong lap thu 2 trong se dung de so sanh cac cap phan tu lien ke 
            // neu > => doi cho 
            // - 1 => Tranh truy cap phan tu arr[j+1] cuoi cung -> vuot mang bi loi 
            // - i: Bo qua luot cuoi cung vi da sap xep  
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Đổi chỗ - swap 
                    // B1: Tao bien tam 
                    int temp = 0;
                    // B2: Do 1 -> 3: Gan => temp,. giá trị J 
                    temp = arr[j];
                    // B3: Do 2 -> 1 
                    arr[j] = arr[j + 1];
                    // B3: Gan temp -> 3
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void inMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
//        int[] a = new int[5];
//        a[0] = 5;
//        a[1] = 3;
//        a[2] = 8;
//        a[3] = 4;
//        a[4] = 2;
        // C2: 
//        int[] a = new int[]{5, 3, 8, 4, 2};
        // C3: 
        int[] a = {5, 3, 8, 4, 2};
        System.out.println("Ds mang ban dau");
        new BubbleSortDemo().inMang(a);
        new BubbleSortDemo().bubbleSort(a);
        System.out.println("Ds mang sau khi sap xep");
        new BubbleSortDemo().inMang(a);
    }
}
