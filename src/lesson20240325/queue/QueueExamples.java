package lesson20240325.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {

    public static void main(String[] args) {

        // FIFO
        Queue<String> queue = new ArrayDeque<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

//        for (String s : queue) {
//            System.out.println(s);
//        }

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
//        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.peek());


        Deque<String> deque = new ArrayDeque<>();
        deque.add("One");
        deque.add("Two");
        deque.add("Three");

        deque = new LinkedList<>();
        deque.addFirst("A");
        deque.addLast("B");
        deque.addFirst("C");
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());

    }



}
