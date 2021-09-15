import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rCode = scanner.nextInt();
        int interactor = scanner.nextInt();
        int checker = scanner.nextInt();
        int finVerdict = interactor;

        if(interactor == 0){

            if(rCode != 0) finVerdict = 3;
            else finVerdict = checker;

        }

        if(interactor == 1) finVerdict = checker;

        if(interactor == 4){

            if(rCode != 0) finVerdict = 3;
            else finVerdict = 4;

        }

        if(interactor == 6) finVerdict = 0;
        if(interactor == 7) finVerdict = 1;

        System.out.println(finVerdict);
    }
}