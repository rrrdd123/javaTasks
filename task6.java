import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();
        int a = 0, b = 1, c = 0;
        if (num<0) System.out.println("Введите неотрицательное");
        else if (num==0) System.out.println(0);
        else if (num==1) System.out.println(1);
        else if (num>=2) {
            for (int i = 2; i <= num; i++) {
                c = a + b; // Суммируем два предыдущих числа
                a = b;     // Сдвигаем a на следующее число
                b = c;     // Сдвигаем b на следующее число
            }
            System.out.println(c);
        }
    }
}
