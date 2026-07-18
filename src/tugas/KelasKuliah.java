/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                jumlah++;
            }
        }
        return jumlah;
    }
    
    public int getJumlahData() {
        return daftarMahasiswa.size();
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Mahasiswa ==");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa m = daftarMahasiswa.get(i);
            String status = m.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.println((i + 1) + ". " + m.getNama() + " (" + m.getNpm() + ") - Nilai: " + m.getNilai() + " [" + status + "]");
        }
    }
}
