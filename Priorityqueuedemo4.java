package priorityqueuedemo4;
import java.util.PriorityQueue;
public class Priorityqueuedemo4 {
 public static void main(String[] args) {
 PriorityQueue queue = new PriorityQueue();
 queue.offer(1);
 queue.offer(3);
 queue.offer(4);
 queue.offer(5);
 queue.offer(2);
 System.out.println(queue);
 while(!queue.isEmpty())
 {
 System.out.println(queue.remove());
 }
 }
}