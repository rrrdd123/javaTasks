import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scan.nextLine();
        StringBuilder strRev = new StringBuilder(str);
        strRev.reverse();
        String strRevRes = strRev.toString();
        System.out.println(strRevRes);
    }
}
