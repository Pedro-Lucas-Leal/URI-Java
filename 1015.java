import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        double distancia = Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1),2));

        System.out.printf("%.4f\n", distancia);

    }
}
