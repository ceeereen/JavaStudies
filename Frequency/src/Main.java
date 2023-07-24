import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Integer[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi: " + java.util.Arrays.toString(array));

        // Elemanların frekanslarını tutmak için bir HashMap oluşturuyoruz.
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Diziyi tek bir döngüde gezerek frekansları hesaplıyoruz.
        for (Integer num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Frekansları ekrana yazdırma.
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(number + " sayısı " + frequency + " kere tekrar edildi.");
        }
    }
}
