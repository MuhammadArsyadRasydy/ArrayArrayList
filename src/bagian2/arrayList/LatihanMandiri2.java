/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arrayList;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class LatihanMandiri2 {
    public static void main(String[] args) {
        // 1. Daftar belanja
        System.out.println("== No 1: Daftar Belanja ==");
        ArrayList<String> daftarBelanja = new ArrayList<>();
        daftarBelanja.add("Sabun");
        daftarBelanja.add("Sampo");
        daftarBelanja.add("Pasta Gigi");
        daftarBelanja.add("Sikat Gigi");
        
        daftarBelanja.remove(1); 
        
        System.out.println("Isi list     : " + daftarBelanja);
        System.out.println("Jumlah akhir : " + daftarBelanja.size());

        // 2. Menampilkan nilai terbesar
        System.out.println("\n== No 2: Nilai Terbesar ==");
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(70); 
        nilai.add(95); 
        nilai.add(60); 
        nilai.add(88); 
        nilai.add(75);
        
        int max = nilai.get(0);
        for (int n : nilai) {
            if (n > max) max = n;
        }
        System.out.println("Nilai Terbesar: " + max);

        // 3. Nama diawali huruf A
        System.out.println("\n== No 3: Awalan Huruf A ==");
        ArrayList<String> nama = new ArrayList<>();
        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ayu");
        nama.add("Citra");
        nama.add("Adit");
        nama.add("Doni");
        
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}
