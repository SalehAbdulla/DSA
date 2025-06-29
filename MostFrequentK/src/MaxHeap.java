import java.util.ArrayList;

public class MaxHeap {
    private ArrayList<Integer> heap;

    public MaxHeap() {
        this.heap = new ArrayList<>();
    }

    // Insert a new value into the heap
    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    // Extract the maximum value (root)
    public int extractMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int max = heap.get(0);
        int last = heap.get(heap.size() - 1);
        heap.set(0, last);
        heap.remove(heap.size() - 1);

        heapifyDown(0);
        return max;
    }

    // Move the value up to maintain max-heap
    private void heapifyUp(int index) {
        while (index > 0 && heap.get(index) > heap.get(parent(index))) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    // Move the value down to maintain max-heap
    private void heapifyDown(int index) {
        int largest = index;
        int left = left(index);
        int right = right(index);

        if (left < heap.size() && heap.get(left) > heap.get(largest)) {
            largest = left;
        }

        if (right < heap.size() && heap.get(right) > heap.get(largest)) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int tmp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, tmp);
    }

    // Optional: Print the heap array
    public void printHeap() {
        System.out.println(heap);
    }

    // Main method for demo
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();

        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(30);

        maxHeap.printHeap(); // [30, 20, 5, 10]
        System.out.println("Extracted max: " + maxHeap.extractMax()); // 30
        maxHeap.printHeap(); // [20, 10, 5]
    }
}
