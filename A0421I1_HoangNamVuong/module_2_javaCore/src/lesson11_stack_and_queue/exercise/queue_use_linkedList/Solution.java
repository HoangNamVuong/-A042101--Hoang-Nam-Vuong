package lesson11_stack_and_queue.exercise.queue_use_linkedList;

public class Solution {
    public static void enqueue(Queue queue, int value) {
        Node temp = new Node();
        temp.data = value;
        if (queue.front == null) {
            queue.front = temp;
        }else {
            queue.rear.link = temp;
        }
        queue.rear = temp;
        queue.rear.link =queue.front;
    }

    public  static int deQueue(Queue queue) {
        if (queue.front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (queue.front == queue.rear) {
            value = queue.front.data;
            queue.front = null;
            queue.rear = null;
        }else {
            Node temp = queue.front;
            value = temp.data;
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
        return value;
    }

    public static void displayQueue(Queue queue) {
        Node temp = queue.front;
        while (temp.link != queue.front) {
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }
}
