import java.util.*;

public class CircularBuffer {
    private int[] buffer;
    private int size, front, rear;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public void add(int value) {
        rear = (rear + 1) % buffer.length;
        buffer[rear] = value;
        if (size < buffer.length) {
            size++;
        } else {
            front = (front + 1) % buffer.length;
        }
    }

    public List getBuffer() {
        List result = new ArrayList();
        for (int i = 0; i < size; i++) {
            result.add(buffer[(front + i) % buffer.length]);
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.add(4);
        System.out.println("Buffer: " + cb.getBuffer());
    }
}
