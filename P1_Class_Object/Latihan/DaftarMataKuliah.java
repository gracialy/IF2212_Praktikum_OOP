import java.util.Scanner;

public class DaftarMataKuliah {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String kode = sc.nextLine();
        String nama = sc.nextLine();
        int sks = sc.nextInt();
        sc.nextLine(); // clean the buffer
        String dosen = sc.nextLine();
        int kapasitas = sc.nextInt();
        sc.nextLine(); // clean the buffer
        int tambahan = sc.nextInt();
        sc.nextLine(); // clean the buffer

        sc.close();

        MataKuliah mk = new MataKuliah(kode, nama, sks, dosen, kapasitas);

        System.out.println("Kode Mata Kuliah: " + mk.getKode());
        System.out.println("Nama Mata Kuliah: " + mk.getNama());
        System.out.println("SKS Mata Kuliah: " + mk.getSks());
        System.out.println("Nama Dosen: " + mk.getDosen());
        System.out.println("Kapasitas Kuliah: " + mk.getKapasitas());

        mk.tambahKapasitas(tambahan);

        System.out.println("Total Revisi Kapasitas Kuliah: " + mk.getKapasitas());

    }
}
