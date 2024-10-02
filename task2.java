import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Введите число: ");
        a = scan.nextInt();
        switch (a%2) {
            case 0: System.out.println("Чётное");
                    break;
            default: System.out.println("Нечётное");
        }

    }
}