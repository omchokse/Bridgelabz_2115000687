import java.util.*;

public class ReverseQueue {
    public static Queue reverseQueue(Queue queue) {
        Stack stack = new Stack();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        return queue;
    }

    public static void main(String[] args) {
        Queue queue = new LinkedList(Arrays.asList(10, 20, 30));
        System.out.println("Reversed Queue: " + reverseQueue(queue));
    }
}
