import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int  horas = sc.nextInt();
        float horaTrabalhada = sc.nextFloat();
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", numero, horas*horaTrabalhada);
    }
}
