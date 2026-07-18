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
public class Latihan3 {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();

        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");

        System.out.println("Isi list : " + mahasiswa);
        System.out.println("Jumlah   : " + mahasiswa.size());
        System.out.println("Index 1  : " + mahasiswa.get(1));
    }
}