import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();
        int res = 1;
        for (int i = 1; i <= num; i++) res*=i;
        System.out.println(res);
    }
}
