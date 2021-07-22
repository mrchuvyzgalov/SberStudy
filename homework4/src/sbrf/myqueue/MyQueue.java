package sbrf.myqueue;

public class MyQueue {
    private Integer[] buffer;
    private int length = 0;
    private int head = 0, tail = 0;

    public MyQueue() {
        buffer = new Integer[4];
    }

    public boolean IsEmpty() {
        return length == 0;
    }

    public void add(int value) {
        if (length == buffer.length) {
            Integer[] newBuffer = new Integer[buffer.length * 2];
            for (int i = head; i < buffer.length; ++i) {
                newBuffer[i - head] = buffer[i];
            }
            for (int i = 0; i < tail; ++i) {
                newBuffer[buffer.length + i - head] = buffer[i];
            }

            head = 0;
            tail = length;
        }

        buffer[tail++] = value;
        length++;
        tail %= buffer.length;
    }

    public Integer remove() {
        if (length == 0) {
            return null;
        }

        Integer res = buffer[head];
        buffer[head++] = null;
        length--;
        head %= buffer.length;
        return res;
    }
}
