package pengurangan;

import java.util.Scanner;
public class Pengurangan 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai 1 : ");
        int nilai1 = input.nextInt();

        System.out.print("Masukkan nilai 2 : ");
        int nilai2 = input.nextInt();
        double hasil = (double)(nilai1-nilai2);
        System.out.print("Hasil Pertambahan :" +hasil);
    }
}