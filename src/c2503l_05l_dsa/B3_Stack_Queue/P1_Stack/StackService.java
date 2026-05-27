/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B3_Stack_Queue.P1_Stack;

import java.util.Stack;

/**
 *
 * @author hangnt
 */
public class StackService {

    // Tao 1 bien history =>String 
    // Stack<String> 
    private Stack<String> history;

    public StackService() {
        // Khoi tao 1 stack rong 
        history = new Stack<>();
    }

    // Them thao thac
    public void addAction(String action) {
        history.push(action);
    }

    public String xemThaoTacGanNhat() {
        if (history.isEmpty()) {
            // rong 
            return null;
        }
        return history.peek();
    }

    public String xoaThaoTacGanNhat() {
        if (history.isEmpty()) {
            // rong 
            return null;
        }
        return history.pop();
    }

    public void inThaoTac() {
        if (history.isEmpty()) {
            // rong 
            System.out.println("Lich su thao tac rong");
            return;
        }
        for (int i = history.size() - 1; i >= 0; i--) {
            // history.get(i) -> lay ra phan tu o vi tri i => chi xem k xoa khoi stack
            // khac voi viec xem thao tac cuoi cung: peek
            System.out.println(history.get(i));
        }
    }
}
