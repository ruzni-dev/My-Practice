import java.util.ArrayList;
import java.util.NoSuchElementException;

public class PowerOfTwoMaxHeap {

    // Stores heap elements
    private final ArrayList<Integer> heap;

    // Exponent used to calculate number of children
    private final int branchingExponent;

    // Number of children per node = 2^branchingExponent
    private final int childrenPerNode;

    /**
     * Constructor
     *
     * @param branchingExponent exponent used to determine children count.
     * Example:
     * branchingExponent = 1 -> 2 children
     * branchingExponent = 2 -> 4 children
     * branchingExponent = 3 -> 8 children
     */
    public PowerOfTwoMaxHeap(int branchingExponent) {

        if (branchingExponent < 0) {
            throw new IllegalArgumentException(
                    "Branching exponent cannot be negative.");
        }

        this.branchingExponent = branchingExponent;
        this.childrenPerNode = 1 << branchingExponent;
        this.heap = new ArrayList<>();
    }

    /**
     * Inserts a value into the heap.
     */
    public void insert(int value) {

        heap.add(value);

        heapifyUp(heap.size() - 1);
    }

    /**
     * Removes and returns the maximum element.
     */
    public int popMax() {

        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty.");
        }

        int maxValue = heap.get(0);

        if (heap.size() == 1) {
            heap.remove(0);
            return maxValue;
        }

        int lastValue = heap.remove(heap.size() - 1);

        heap.set(0, lastValue);

        heapifyDown(0);

        return maxValue;
    }

    /**
     * Returns the maximum value without removing it.
     */
    public int peek() {

        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty.");
        }

        return heap.get(0);
    }

    /**
     * Returns heap size.
     */
    public int size() {
        return heap.size();
    }

    /**
     * Checks if heap is empty.
     */
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    /**
     * Restores heap after insertion.
     */
    private void heapifyUp(int currentIndex) {

        while (currentIndex > 0) {

            int parentIndex = getParentIndex(currentIndex);

            if (heap.get(currentIndex) <= heap.get(parentIndex)) {
                break;
            }

            swap(currentIndex, parentIndex);

            currentIndex = parentIndex;
        }
    }

    /**
     * Restores heap after removing maximum.
     */
    private void heapifyDown(int currentIndex) {

        while (true) {

            int largestIndex = currentIndex;

            int firstChild = getFirstChildIndex(currentIndex);

            // Compare every child
            for (int i = 0; i < childrenPerNode; i++) {

                int childIndex = firstChild + i;

                if (childIndex >= heap.size()) {
                    break;
                }

                if (heap.get(childIndex) > heap.get(largestIndex)) {
                    largestIndex = childIndex;
                }
            }

            if (largestIndex == currentIndex) {
                break;
            }

            swap(currentIndex, largestIndex);

            currentIndex = largestIndex;
        }
    }

    /**
     * Returns parent index.
     */
    private int getParentIndex(int childIndex) {

        return (childIndex - 1) / childrenPerNode;
    }

    /**
     * Returns first child index.
     */
    private int getFirstChildIndex(int parentIndex) {

        return parentIndex * childrenPerNode + 1;
    }

    /**
     * Swaps two elements.
     */
    private void swap(int firstIndex, int secondIndex) {

        int temp = heap.get(firstIndex);

        heap.set(firstIndex, heap.get(secondIndex));

        heap.set(secondIndex, temp);
    }

    /**
     * Prints heap.
     */
    public void printHeap() {

        System.out.println(heap);
    }

    /**
     * Test Program
     */
    public static void main(String[] args) {

        // 2^2 = 4 children per node
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2);

        int[] values = {
                25,
                40,
                15,
                90,
                60,
                10,
                100,
                80,
                35,
                75
        };

        System.out.println("Inserting values...");

        for (int value : values) {

            heap.insert(value);

            System.out.println("Inserted: " + value);
        }

        System.out.println();

        System.out.println("Current Heap:");

        heap.printHeap();

        System.out.println();

        System.out.println("Maximum = " + heap.peek());

        System.out.println();

        System.out.println("Removing elements:");

        while (!heap.isEmpty()) {

            System.out.println(heap.popMax());
        }

        System.out.println();

        System.out.println("Heap Size = " + heap.size());
    }
}