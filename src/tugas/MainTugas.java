/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
// Nama : [Muhammad Arsyad Rasydy]
// NPM  : [2210010509]

/**
 *
 * @author User
 */
public class MainTugas {
    public static void main(String[] args) {
        // 4. Menyimpan daftar mata kuliah dalam array String
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Struktur Data", "Basis Data"};
        System.out.println("Mata Kuliah Semester Ini:");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        // 3. Membuat objek KelasKuliah dan menambah 5 Mahasiswa
        KelasKuliah kelas = new KelasKuliah();
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "2301", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2302", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2303", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dewi", "2304", 75.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eko", "2305", 40.0));

        kelas.tampilkanSemua();
        System.out.println();

        // 5. Menampilkan rata-rata dan jumlah lulus
        System.out.println("Rata-rata nilai: " + kelas.hitungRataRata());
        System.out.println("Jumlah mahasiswa lulus: " + kelas.jumlahLulus());
        System.out.println();

        // 6. Menambah 1 objek baru dan menampilkan jumlah terbaru
        System.out.println("Menambahkan mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "2306", 80.0));
        System.out.println("Jumlah data mahasiswa terbaru: " + kelas.getJumlahData());
    }
}