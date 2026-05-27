/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B3_Stack_Queue.P2_Queue;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Tạo object service để xử lý Queue
        TaskQueueService taskQueueService = new TaskQueueService();

        int choice;

        do {
            System.out.println("\n===== TASK QUEUE MANAGEMENT =====");
            System.out.println("1. Them task moi");
            System.out.println("2. Xem task dau tien dang cho xu ly");
            System.out.println("3. Xu ly task dau tien");
            System.out.println("4. In tat ca task con lai");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhap ten task: ");
                    String taskName = scanner.nextLine();

                    taskQueueService.addTask(taskName);

                    System.out.println("Da them task vao Queue.");
                    break;

                case 2:
                    String currentTask = taskQueueService.getCurrentTask();

                    if (currentTask == null) {
                        System.out.println("Khong co task nao dang cho xu ly.");
                    } else {
                        System.out.println("Task dau tien dang cho xu ly: " + currentTask);
                    }
                    break;

                case 3:
                    String processedTask = taskQueueService.processTask();

                    if (processedTask == null) {
                        System.out.println("Khong co task nao de xu ly.");
                    } else {
                        System.out.println("Da xu ly task: " + processedTask);
                    }
                    break;

                case 4:
                    taskQueueService.printAllTasks();
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
