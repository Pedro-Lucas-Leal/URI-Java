import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double resultado = ((double) 4 /3) * 3.14159 * (raio*raio*raio);
        System.out.printf("VOLUME = %.3f\n", resultado);
    }
}
