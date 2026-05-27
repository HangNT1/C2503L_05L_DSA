/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B3_Stack_Queue.P1_Stack;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        StackService service = new StackService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Moi nhap chuc nang");
            int choice = Integer.valueOf(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Moi nhap thao tac moi:");
                    String action = sc.nextLine();
                    service.addAction(action);
                    break;
                case 2:
                    System.out.println(service.xemThaoTacGanNhat());
                    break;
                case 3:
                    service.xoaThaoTacGanNhat();
                    break;
                case 4:
                    service.inThaoTac();
                    break;
                case 0:

                    break;

                default:
                    throw new AssertionError();
            }
        }
    }
}
