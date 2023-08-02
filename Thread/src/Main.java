import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        for(int i=1; i<=10000; i++){
            numberList.add(i);
        }

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        List<Integer> q1 = numberList.subList(0,2500);
        List<Integer> q2 =numberList.subList(2500,5000);
        List<Integer> q3 =numberList.subList(5000,7500);
        List<Integer> q4 =numberList.subList(7500,10000);

        Thread thread1 = new Thread(() -> processNumbers(q1, evenNumbers, oddNumbers));
        Thread thread2 = new Thread(() -> processNumbers(q2, evenNumbers, oddNumbers));
        Thread thread3 = new Thread(() -> processNumbers(q3, evenNumbers, oddNumbers));
        Thread thread4 = new Thread(() -> processNumbers(q4, evenNumbers, oddNumbers));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    private static void processNumbers(List<Integer> numbers, List<Integer> evenNumbers, List<Integer> oddNumbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                synchronized (evenNumbers) {
                    evenNumbers.add(number);
                }
            } else {
                synchronized (oddNumbers) {
                    oddNumbers.add(number);
                }
            }
        }
    }


}