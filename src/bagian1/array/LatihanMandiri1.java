/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

/**
 *
 * @author User
 */
public class LatihanMandiri1 {
    public static void main(String[] args) {
        // 1. Array suhu harian
        System.out.println("== No 1: Suhu Harian ==");
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};
        double max = suhu[0];
        double min = suhu[0];
        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
        System.out.println("Suhu Tertinggi: " + max);
        System.out.println("Suhu Terendah : " + min);

        // 2. Array nama hari lebih dari 5 huruf
        System.out.println("\n== No 2: Nama Hari ==");
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }

        // 3. Menghitung jumlah angka genap
        System.out.println("\n== No 3: Angka Genap ==");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;
        for (int a : angka) {
            if (a % 2 == 0) genap++;
        }
        System.out.println("Jumlah bilangan genap: " + genap);
    }
}