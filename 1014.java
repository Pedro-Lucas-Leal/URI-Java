import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
        int distancia = sc.nextInt();
        float combustivel = sc.nextFloat();
        float resultado = distancia/combustivel;
        System.out.printf("%.3f km/l\n", resultado);
    }
}
