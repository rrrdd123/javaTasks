import java.util.Scanner;
import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scan.nextInt();
        System.out.print("Введите элементы массива через пробел: ");
        int[] list = new int[len];
        int sum = 0;
        int k = 0;
        for (int i = 0; i < len; i++) {
            list[i] = scan.nextInt();
            sum+=list[i];
            k++;
        }
        double res = (double) sum/k;
        //System.out.println(Arrays.toString(list) + " " + res);
        int min = list[0];
        for (int i = 0; i < len; i++) {
            min = min>list[i]?list[i]:min;
        }

        int max = list[0];
        for (int i = 0; i < len; i++) {
            max = max>list[i]?max:list[i];
        }
        System.out.println("Макс: " + max + "\n" + "Мин: " + min + "\n" + "Ср. арифм.: " + res);
    }
}
