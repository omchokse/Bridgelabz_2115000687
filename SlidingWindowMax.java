import java.util.Deque;
import java.util.LinkedList;

class SlidingWindowMax {
    static void findMax(int[] arr, int k) {
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            deque.offer(i);

            if (i >= k - 1) {
                System.out.print(arr[deque.peek()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        findMax(arr, k);
    }
}
