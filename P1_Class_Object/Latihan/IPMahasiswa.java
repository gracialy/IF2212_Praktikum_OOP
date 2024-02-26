/**
 * IPMahasiswa.java
 * Kelas IPMahasiswa merupakan sebuah kelas yang memodelkan seorang mahasiswa ITB.
 * @author 
 */

public class IPMahasiswa {
    // Deklarasi atribut
    private Mahasiswa mahasiswa;
    private Double ipk;

    /**
     * Konstruktor
     * @param mahasiswa
     * @param ipk
     * Apabila ipk > 4.00 atau <= 0.00, maka IPK secara default akan diganti menjadi 0.00 
     */
    public IPMahasiswa(Mahasiswa mahasiswa, Double ipk){
        this.mahasiswa = mahasiswa;

        ubahIpk(ipk);
    }

    /**
     * Getter mahasiswa
     * @return mahasiswa
     */
    public Mahasiswa getMahasiswa(){
        return mahasiswa;
    }

    /**
     * Getter ipk
     * 
     * @return ipk
     */
    public Double getIpk(){
        return ipk;
    }

    /**
     * Method untuk mengganti IPK
     * @param ipk sebagai nilai IPK baru
     */
    public void ubahIpk(Double ipk){
        if (ipk > 4.00 || ipk <= 0.00) this.ipk = 0.00;
        else this.ipk = ipk;
    }

    /**
     * Method untuk mengembalikan informasi kemungkinan cumlaude
     * IPK dinyatakan cumlaude apabila >= 3.5
     */
    public Boolean isCumLaude(){
        return ipk >= 3.5;
    }

    /**
     * Method untuk menghitung kemungkinan agar mendapat gelar cumlaude
     * Asumsi: jumlah maksimal SKS satu mahasiswa adalah 144
     * Apabila IPK Cumlaude, maka return 0.0
     * Apabila IPK tidak cumlaude, maka untuk menghitung diffToCumlaude adalah
     * totalCumlaude dikurangi SKS mahasiswa dikali IPK saat ini kemudian dibagi dengan sisa SKS yang dapat diambil
     */

     // totalCumlaude - sks * ipk / sks
    public Double avgDiffToCumLaude(){
        Double totalCumLaude = 3.5 * 144;

        if (isCumLaude()) return 0.0;
        else return (totalCumLaude - mahasiswa.getSks() *  ipk) / (144 - mahasiswa.getSks());
    }
}