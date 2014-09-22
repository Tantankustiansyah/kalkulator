package persegi;
import java.util.Scanner;
public class Persegi
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi : ");
        int sisi = input.nextInt();
        double luas = (double)(sisi*sisi);
        System.out.print("Luas :" +luas);
    }
}