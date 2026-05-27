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
public class QueueExample {

    public static void main(String[] args) {
        // Tạo một hàng đợi để lưu trữ các số nguyên
        Queue<Integer> queue = new LinkedList<>();

        // Thêm phần tử vào hàng đợi
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        // Hiển thị phần tử ở đầu hàng đợi mà không xóa
        System.out.println("Phần tử ở đầu hàng đợi: " + queue.peek());

        // Lấy và xóa phần tử ở đầu hàng đợi
        System.out.println("Phần tử được lấy ra khỏi hàng đợi: " + queue.poll());

        // Hiển thị phần tử ở đầu hàng đợi sau khi xóa
        System.out.println("Phần tử ở đầu hàng đợi sau khi poll: " + queue.peek());

        // Hiển thị toàn bộ hàng đợi
        System.out.println("Các phần tử còn lại trong hàng đợi: " + queue);

        // Kiểm tra xem hàng đợi có rỗng không
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi rỗng.");
        } else {
            System.out.println("Hàng đợi không rỗng.");
        }
    }
}
