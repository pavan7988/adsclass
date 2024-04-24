import java.util.*;

public class PriorityQueueADT {
    private final List<Integer> heap;

    public PriorityQueueADT() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public int delete() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority Queue is empty");
        }

        int deletedItem = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown(0);

        return deletedItem;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority Queue is empty");
        }
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index) < heap.get(parentIndex)) {
                Collections.swap(heap, index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        while (index < heap.size()) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallestChildIndex = index;

            if (leftChildIndex < heap.size() && heap.get(leftChildIndex) < heap.get(smallestChildIndex)) {
                smallestChildIndex = leftChildIndex;
            }

            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(smallestChildIndex)) {
                smallestChildIndex = rightChildIndex;
            }

            if (smallestChildIndex != index) {
                Collections.swap(heap, index, smallestChildIndex);
                index = smallestChildIndex;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        PriorityQueueADT priorityQueue = new PriorityQueueADT();
        priorityQueue.insert(10);
        priorityQueue.insert(20);
        priorityQueue.insert(5);
        System.out.println("Item with the highest priority: " + priorityQueue.peek());
        System.out.println("Deleted item with priority: " + priorityQueue.delete());
        System.out.println("Item with the highest priority after deletion: " + priorityQueue.peek());
        System.out.println("Is the priority queue empty? " + priorityQueue.isEmpty());
    }
}
