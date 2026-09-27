public class MinHeap {
    private int[] heap;
    private int size;

    public MinHeap() {
        heap = new int[10];
        size = 0;
    }

    public int peekMin() {
        if (size == 0) {
            throw new IllegalStateException("Куча пуста");
        }
        return heap[0];
    }

    public void insert(int x) {
        if (size == heap.length) {
            resize();
        }
        heap[size] = x;
        siftUp(size);
        size++;
    }

    public int extractMin() {
        if (size == 0) {
            throw new IllegalStateException("Куча пуста");
        }

        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftDown(0);

        return min;
    }

    private void siftUp(int i) {
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap[i] < heap[parent]) {
                int temp = heap[i];
                heap[i] = heap[parent];
                heap[parent] = temp;
                i = parent;
            } else {
                break;
            }
        }
    }

    private void siftDown(int i) {
        while (2 * i + 1 < size) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = left;

            if (right < size && heap[right] < heap[left]) {
                smallest = right;
            }

            if (heap[i] > heap[smallest]) {
                int temp = heap[i];
                heap[i] = heap[smallest];
                heap[smallest] = temp;
                i = smallest;
            } else {
                break;
            }
        }
    }

    private void resize() {
        int[] newHeap = new int[heap.length * 2];
        for (int i = 0; i < size; i++) {
            newHeap[i] = heap[i];
        }
        heap = newHeap;
    }

    public int size() {
        return size;
    }
}