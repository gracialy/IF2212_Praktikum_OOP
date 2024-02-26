import java.lang.System;
import java.util.Scanner;

public class DaftarMahasiswa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nama = sc.nextLine();
        String nim = sc.nextLine();
        int sks = sc.nextInt();
        sc.nextLine();
        int tambahan = sc.nextInt();
        sc.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, sks);
    
        System.out.println("Nama mahasiswa: " + mahasiswa.getNama());
        System.out.println("NIM mahasiswa: " + mahasiswa.getNim());
        System.out.println("SKS mahasiswa: " + mahasiswa.getSks());
        System.out.println("Jumlah mahasiswa: " + Mahasiswa.getJumlahMahasiswa());

        mahasiswa.tambahSks(tambahan);

        System.out.printf("Total Revisi SKS mahasiswa: %d\n", mahasiswa.getSks());

        sc.close();
    }
}
