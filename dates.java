import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int result = 1;

        if(x <= 12 && y <= 12 && x != y) result = 0;

        System.out.println(result);

    }
}