import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Введите два числа через пробел");
        a = scan.nextInt();
        b = scan.nextInt();
        double c = (double) a/b;
        System.out.println("Сложение: " + (a+b));
        System.out.println("Вычитание: "+ (a-b));
        System.out.println("Умножение: "+ (a*b));
        System.out.printf("Деление: %.4f", c);
    }
}