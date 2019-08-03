import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        // Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        String[] array = new String[size];
        System.out.println("Enter array numbers: ");
        for (int i = 0; i < array.length; i++)   // input array strings
        {
            array[i] = scanner.next();
        }
        int shortLength = array[0].length();
        int maxLength = array[0].length();
        String shortL = array[0];
        String max = array[0];
        for (int i = 0; i < array.length; i++)   // input array strings
        {
            if (array[i].length() < shortLength) {
                shortLength = array[i].length();
                shortL = array[i];
            }
        }
        for (int i = 0; i < array.length; i++)   // input array strings
        {
            if (array[i].length() > maxLength) {
                maxLength = array[i].length();
                max = array[i];
            }
        }



        System.out.println("Short lenght of number: " + shortLength);
        System.out.println("Max lenght of number: " + maxLength);
        System.out.println("Short number: " + shortL);
        System.out.println("Max number: " + max);


    }


}

