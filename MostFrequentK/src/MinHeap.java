import java.util.Arrays;

public class MinHeap {
    private int capacity; // Fixed Heap
    private int size;
    private int[] items;

    public MinHeap() {
        this.size = 0;
        this.capacity = 10;
        this.items = new int[capacity];

    }


    public int getLeftChild(int parent) { return parent * 2 + 1; }
    public int getRightChild(int parent) { return parent * 2 + 2; }
    public int getParent(int child) {return (child / 2) - 1; }

    public boolean hasLeftChild(int index) { return getLeftChild(index) < size; }
    public boolean hasRightChild(int index) { return getRightChild(index) < size; }
    public boolean hasParent(int index) { return getParent(index) >= 0; }



    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        for (int i = 0; i < minHeap.items.length; i++) {
            minHeap.items[i] = 1 + (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(minHeap.items));


    }
}

