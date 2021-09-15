import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int result = 0;
        ArrayList<Double> angles = new ArrayList<>(3);

        if(d > 0 && y <= -x + d && y >= 0 && x >= 0) result = 0;
        else if(d < 0 && y >= -x + d && y <= 0 && x <= 0) result = 0;
        else{
                angles.add(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
                angles.add(Math.sqrt(Math.pow(y, 2) + Math.pow((d - Math.abs(x)), 2)));
                angles.add(Math.sqrt(Math.pow((d - Math.abs(y)), 2) + Math.pow(x, 2)));

                double min = 5000;

                for(int i = 0; i < angles.size(); i++){
                    if (angles.get(i) < min){
                        min = angles.get(i);
                        result = i + 1;
                    }
                }
        }
        System.out.println(result);
    }
}