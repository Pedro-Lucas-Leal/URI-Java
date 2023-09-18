import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String um = sc.nextLine();
        String dois = sc.nextLine();
        String[] pecas1 = um.split(" ");
        String [] pecas2 = dois.split(" ");

        int codUm = Integer.parseInt(pecas1[0]);
        int numUm = Integer.parseInt(pecas1[1]);
        float valorUm = Float.parseFloat(pecas1[2]);

        int codDois = Integer.parseInt(pecas2[0]);
        int numDois = Integer.parseInt(pecas2[1]);
        float valorDois = Float.parseFloat(pecas2[2]);

        float total = (numUm*valorUm)+(numDois*valorDois);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
