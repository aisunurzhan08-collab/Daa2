public class Benchmark {
    public static void main(String[] args) {
        int n = 50000;

        System.out.println("=== БЕНЧМАРК ПРОИЗВОДИТЕЛЬНОСТИ (N = " + n + ") ===");

        long startTime = System.nanoTime();
        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 0; i < n; i++) {
            dynamicArray.add(i);
        }
        long endTime = System.nanoTime();
        double durationDA = (endTime - startTime) / 1_000_000.0;
        System.out.println("DynamicArray - добавление " + n + " элементов: " + durationDA + " ms");

        startTime = System.nanoTime();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        double durationLL = (endTime - startTime) / 1_000_000.0;
        System.out.println("LinkedList - добавление " + n + " элементов: " + durationLL + " ms");

        startTime = System.nanoTime();
        MinHeap minHeap = new MinHeap();
        for (int i = 0; i < n; i++) {
            minHeap.insert((int)(Math.random() * 100000));
        }
        endTime = System.nanoTime();
        double durationHeap = (endTime - startTime) / 1_000_000.0;
        System.out.println("MinHeap - вставка " + n + " элементов: " + durationHeap + " ms");

        System.out.println("\nБенчмарк успешно завершен!");
    }
}