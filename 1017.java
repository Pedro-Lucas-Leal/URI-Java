import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        float distancia = velocidade * tempo;
        float gasto = distancia/12;

        System.out.printf("%.3f\n", gasto);

    }
}
