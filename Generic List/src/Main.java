public class Main {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        // Veri ekleme
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);

        // Veri çekme
        System.out.println("Element at index 0: " + dynamicArray.get(0));
        System.out.println("Element at index 1: " + dynamicArray.get(1));
        System.out.println("Element at index 2: " + dynamicArray.get(2));

        // Boyutunu döndürme
        System.out.println("Size of the dynamic array: " + dynamicArray.size());

        // Elemanın indexini bulma
        System.out.println("Index of element 20: " + dynamicArray.indexOf(20));

        // Elemanı belirli bir indexten silme
        dynamicArray.remove(1);

        System.out.println("After removing an element, size: " + dynamicArray.size());
    }

}