
import java.util.PriorityQueue;

public class MinHeadPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(8);
        queue.add(10);
        queue.add(1);
        queue.add(4);
        while (!queue.isEmpty()) {
            System.out.println("queue: " + queue.poll());
        }
        
    }
}
