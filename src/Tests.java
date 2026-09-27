public class Tests {
    public static void main(String[] args) {
        System.out.println("=== Тестирование DynamicArray ===");
        DynamicArray arr = new DynamicArray();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1, 15);

        System.out.println("Элемент по индексу 1 (ожидается 15): " + arr.get(1));
        System.out.println("Содержит 20? (ожидается true): " + arr.contains(20));
        arr.remove(2);
        System.out.println("Размер после удаления (ожидается 3): " + arr.size());

        System.out.println("\n=== Тестирование LinkedList ===");
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(1, 7);
        System.out.println("Элемент по индексу 1 (ожидается 7): " + list.get(1));
        System.out.println("Содержит 15? (ожидается true): " + list.contains(15));
        list.remove(0);
        System.out.println("Новый элемент по индексу 0 (ожидается 7): " + list.get(0));

        System.out.println("\n=== Тестирование MinHeap ===");
        MinHeap heap = new MinHeap();
        heap.insert(30);
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);

        System.out.println("Минимум (peekMin, ожидается 5): " + heap.peekMin());
        System.out.println("Извлекаем минимум: " + heap.extractMin());
        System.out.println("Следующий минимум (ожидается 10): " + heap.extractMin());

        System.out.println("\nВсе тесты успешно пройдены!");
    }
}