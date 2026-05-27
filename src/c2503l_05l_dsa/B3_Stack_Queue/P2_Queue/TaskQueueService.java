/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B3_Stack_Queue.P2_Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author hangnt
 */
public class TaskQueueService {
    // Queue dùng để lưu danh sách task
    // String là vì mỗi task là một chuỗi mô tả công việc

    private Queue<String> tasks;

    // Constructor: khởi tạo Queue rỗng
    public TaskQueueService() {
        tasks = new LinkedList<>();
    }

    // 1. Thêm task mới vào cuối Queue
    public void addTask(String taskName) {
        tasks.add(taskName);
    }

    // 2. Xem task đầu tiên nhưng không xóa
    public String getCurrentTask() {
        if (tasks.isEmpty()) {
            return null;
        }

        return tasks.peek();
    }

    // 3. Xử lý task đầu tiên
    // Nghĩa là lấy task đầu Queue ra và xóa khỏi Queue
    public String processTask() {
        if (tasks.isEmpty()) {
            return null;
        }

        return tasks.remove();
    }

    // 4. In toàn bộ task còn lại
    public void printAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Danh sach task rong.");
            return;
        }

        System.out.println("Danh sach task dang cho xu ly:");

        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }

    // 5. Kiểm tra Queue có rỗng không
    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}
