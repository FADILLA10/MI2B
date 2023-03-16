/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author HP
 */
public class Mahasiswa {
    
    String nama,nobp,kelas,prodi,jurusan;
    
    public static void main(String[] args)
    {
        Mahasiswa Mhs = new Mahasiswa();
        
        Mhs.nama = "FADILLA ANGGRAINI";
        Mhs.nobp = "2101092006";
        Mhs.kelas = "MI 2B";
        Mhs.prodi = "D3 MANAJEMEN INFORMATIKA";
        Mhs.jurusan = "TEKNOLOGI INFORMASI";
        
        System.out.println("Nama : "+Mhs.nama+ "\t"+"\n"
                            +"NoBp : "+Mhs.nobp+ "\t"+ "\n"
                            +"Kelas : "+Mhs.kelas+"\t"+ "\n"
                            +"Prodi : "+Mhs.prodi+ "\t"+"\n"
                            +"Jurusan : "+Mhs.jurusan+ "\t"+"\n");
        
        System.out.println("------------------------------------------------------------\n");
        
        Mahasiswa Mhs2 = new Mahasiswa();
        
        Mhs.nama = "SALSABILA OKTA KIRANA";
        Mhs.nobp = "2101092068";
        Mhs.kelas = "MI 2B";
        Mhs.prodi = "D3 MANAJEMEN INFORMATIKA";
        Mhs.jurusan = "TEKNOLOGI INFORMASI";
        
        System.out.println("Nama : "+Mhs.nama+ "\t"+"\n"
                            +"NoBp : "+Mhs.nobp+"\t"+ "\n"
                            +"Kelas : "+Mhs.kelas+"\t"+ "\n"
                            +"Prodi : "+Mhs.prodi+ "\t"+"\n"
                            +"Jurusan : "+Mhs.jurusan+"\t"+"\n");
    }
}
