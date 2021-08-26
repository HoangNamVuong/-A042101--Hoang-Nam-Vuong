package lesson11_stack_and_queue.exercise.queue_use_linkedList;

import javax.sound.midi.Soundbank;

public class TestQueueUseLinkedList {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.front = queue.rear = null;

        Solution.enqueue(queue,10);
        Solution.enqueue(queue,20);
        Solution.enqueue(queue,30);

        Solution.displayQueue(queue);
        System.out.println("Delete value = " + Solution.deQueue(queue));
        System.out.println("Delete value = " + Solution.deQueue(queue));
        Solution.displayQueue(queue);
    }
}
