/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class sewakendaraan {
    public static void main(String[] args)
    {
        Scanner masuk = new Scanner(System.in);
        
        int pilihan,i,j;
        
        System.out.println("------RENTAL KENDARAAN DICA DI KOTA PADANG-----");
        System.out.println("1. MOBIL");
        System.out.println("2. MOTOR");
        System.out.println("---MASUKAN PILIHAN KENDARAAN YANG INGIN ANDA SEWA---");
        
        pilihan = masuk.nextInt();
        
        if (pilihan == 1)
        
            System.out.println("harga sewa mobil : Rp.300.000");
        
        else if (pilihan ==2)
                
            System.out.println("harga sewa motor : Rp.150.000");
        
        else
            
            System.out.println("MAAF KODE YANG ANDA MASUKAN SALAH, SILAHKAN COBA LAGI!!");
        
        for(i = 1; i > 0; i--)
        {
            for(j = 1; j > 0; j++)
            {
                System.out.println("APAKAH ANDA SUDAH YAKIN DENGAN PILIHANNYA");
                System.out.println("1. YA ");
                System.out.println("2. TIDAK");
                System.out.println("--SILAHKAN DIPILIH---");
                
                pilihan = masuk.nextInt();
                
                if(pilihan == 1)
                    
                    System.out.println("TERIMAKASIH TELAH MENYEWA KENDARAAN KAMI");
                
                else if(pilihan == 2)
                    
                    System.out.println("MASUKAN PILIHAN KENDARAAN ANDA");
                
                pilihan = masuk.nextInt();
                
                  if (pilihan == 1)
        
                     System.out.println("harga sewa mobil : Rp.200.000");
        
                  else if (pilihan ==2)
                
                     System.out.println("harga sewa motor : Rp.50.000");
        
                  else
            
                     System.out.println("MAAF KODE YANG ANDA MASUKAN SALAH, SILAHKAN COBA LAGI!!");
        
            }
        }
        
    }
}
