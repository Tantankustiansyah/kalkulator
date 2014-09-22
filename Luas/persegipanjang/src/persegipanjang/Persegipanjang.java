package persegipanjang;
import java.util.Scanner;
public class Persegipanjang
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        int panjang = input.nextInt();
        
        System.out.print("Masukkan lebar : ");
        int lebar = input.nextInt();
        double luas = (double)(panjang*lebar);
        System.out.print("Luas :" +luas);
    }
}