
import java.util.LinkedList;
public class LinkedListProgram {
    public static void main(String[] args) {
     LinkedList<String> vehicals = new LinkedList<>();
     vehicals.add("Bike");
     vehicals.addFirst("Car");
     vehicals.addLast("cycle");
     System.out.println("LinkedList: " + vehicals);
     System.out.println("First Element: " + vehicals.getFirst());
     System.out.println("Last Element: " + vehicals.getLast());
         }
    }