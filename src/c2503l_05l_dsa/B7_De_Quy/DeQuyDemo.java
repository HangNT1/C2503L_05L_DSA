/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B7_De_Quy;

/**
 *
 * @author hangnt
 */
public class DeQuyDemo {

    public static void inThongTin() {
        System.out.println("aaaa");
        inThongTin();
    }

    public static int test() {
        return -1;
    }
    // Nhập vào 1 số nguyên n từ bàn phím -> n!  => 5! -> 120 

    public static int tinhGiaThua(int n) {
        int ketQua = 1;
        for (int i = 1; i <= n; i++) {
            ketQua *= i;
        }
        return ketQua;
    }

    // 5! = 5 * 4 *3 * 2 * 1 
    // 6! = 6 * 5 * 4 *3 * 2 * 1
    // n = 5 = n * (n-1) * (n - 1 - 1) * (n - ......) .... n = 1 --> dung 
    public static int tinhGiaThuaC2(int n) {
        if (n == 1) {
            return 1;
        }
        return n * tinhGiaThuaC2(n - 1);
//        n = 5;
//        5 * tinhGiaThuaC2(4);
//         5 * tinhGiaThuaC2(4) * tinhGiaThuaC2(3)

    }

    public static void inDanhSachCacSo(int n) {
        if (n == 0) {
            return;
        }
        inDanhSachCacSo(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
//        inThongTin();
//        System.out.println(tinhGiaThua(5));
        System.out.println(tinhGiaThuaC2(5));
        inDanhSachCacSo(10);
    }
    /**
     * 1. In danh sach tu 1 - n 
     * 2. Tinh tong tu 1 - n 
     * 3. Dem so chu so cua n khi nhap tu ban phim
     * n = 100 -> 3 
     * n = 123456 -> 6 
     */
}
