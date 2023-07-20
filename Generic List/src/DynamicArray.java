import java.util.Arrays;

public class DynamicArray<T> {
    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public DynamicArray() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Eleman ekleme
    public void add(T element) {
        if (size == data.length) {
            ensureCapacity();
        }
        data[size++] = element;
    }

    // Belirli bir index'e eleman ekleme
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Geçersiz index: " + index);
        }

        if (size == data.length) {
            ensureCapacity();
        }

        // Elemanları sağa kaydırma
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = element;
        size++;
    }

    // Elemanı belirli bir indexten silme
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Geçersiz index: " + index);
        }

        // Elemanları sola kaydırma
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        data[size - 1] = null;
        size--;
    }

    // Verilen elemanın indexini döndürme
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    // Dizi boyutunu artırma
    private void ensureCapacity() {
        int newCapacity = data.length * 2;
        data = Arrays.copyOf(data, newCapacity);
    }

    // Dizi boyutunu döndürme
    public int size() {
        return size;
    }

    // Elemanı döndürme
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Geçersiz index: " + index);
        }
        return (T) data[index];
    }

    // Diziyi temizleme
    public void clear() {
        Arrays.fill(data, null);
        size = 0;
    }
}
