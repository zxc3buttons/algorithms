import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int first = scanner.nextInt();
        int last = scanner.nextInt();

        int result;

        if(first > last){

            if(first - last > n - first + last) result = n - first + last - 1;
            else result = first - last - 1;

        }
        else{

            if(last - first > n - last + first) result = n - last + first - 1;
            else result = last - first - 1;

        }

        System.out.println(result);

    }
}