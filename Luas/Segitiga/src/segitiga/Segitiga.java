package segitiga;
import java.util.Scanner;
public class Segitiga
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan alas : ");
        int alas = input.nextInt();

        System.out.print("Masukkan tinggi : ");
        int tinggi = input.nextInt();
        double luas = (double)(alas*tinggi)/2;
        System.out.print("Luas :" +luas);
    }
}