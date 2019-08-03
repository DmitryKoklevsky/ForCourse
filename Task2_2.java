import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        // Вывести числа в порядке возрастания (убывания) значений их длины.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        String[] array = new String[size];
        System.out.println("Enter array numbers: ");
        for (int i = 0; i < array.length; i++)   // input array strings
        {
            array[i] = scanner.next();
        }


        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                }

            }

            System.out.println(array[i]);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].length() < array[j + 1].length()) {
                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                }

            }

            System.out.println(array[i]);


        }

    }
}






