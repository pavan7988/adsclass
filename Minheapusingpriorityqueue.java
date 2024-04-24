package minheapusingpriorityqueue;
import java.util.PriorityQueue;
public class Minheapusingpriorityqueue{
 public static void main(String[] args) {
 PriorityQueue<Integer> heap = new PriorityQueue<>();
 heap.add(11);
 heap.add(2);
 heap.add(10);
 heap.add(7);
 heap.add(3);
 heap.add(8);
 System.out.println(heap);
 System.out.println("size of heap : " + heap.size());
 System.out.println("max in heap : " + heap.peek());
 System.out.println("Deleted Element: " + heap.poll());
 System.out.println("after deletion");
 System.out.println(heap);
 System.out.println("size of heap : " + heap.size());
 System.out.println("Deleted Element: " + heap.poll());
 System.out.println(heap);
 System.out.println("max in heap : " + heap.peek());
 }
}
