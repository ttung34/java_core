
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeadPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queues = new PriorityQueue<>(Collections.reverseOrder());
        queues.add(3);
        queues.add(8);
        queues.add(10);
        queues.add(1);
        queues.add(4);
        while (!queues.isEmpty()) {
            System.out.println("queue: " + queues.poll());
        }
    }
}
