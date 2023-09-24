import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int segundos = sc.nextInt();
        int minutos=0, horas=0;

        while (segundos>=60){
            segundos=segundos-60;
            minutos++;
        }
        while (minutos>=60){
            minutos=minutos-60;
            horas++;
        }

        System.out.println(horas+":"+minutos+":"+segundos);
    }
}
