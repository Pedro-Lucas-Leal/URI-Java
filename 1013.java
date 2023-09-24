import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maiorAB = (a+b+ Math.abs(a-b))/2;

        if (maiorAB > c){
            System.out.println(maiorAB + " eh o maior");
        }
        else if (c > maiorAB){
            System.out.println(c + " eh o maior");
        }
    }
}
