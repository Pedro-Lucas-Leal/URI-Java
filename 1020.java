import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int dias = sc.nextInt();
        int meses = 0, anos = 0;

        while (dias >= 365){
            dias = dias - 365;
            anos++;
        }
        while (dias >= 30){
            dias = dias - 30;
            meses++;
        }
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
