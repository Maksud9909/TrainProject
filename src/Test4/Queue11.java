package Test4;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue11 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Queue <String> queue1 = new ArrayDeque<>();
        queue.add(1456);
        queue.add(123456);
        queue.add(1234532);
        queue.add(12345);
        queue.add(12345);
        queue.add(45);
        queue.add(34);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

    }
}
