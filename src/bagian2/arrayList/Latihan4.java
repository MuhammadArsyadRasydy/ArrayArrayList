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
public class Latihan4 {
    public static void main(String[] args) {
        ArrayList<String> buah = new ArrayList<>();
        buah.add("Apel");
        buah.add("Mangga");
        buah.add("Jeruk");
        System.out.println("Awal: " + buah);

        buah.add(1, "Pisang");
        System.out.println("Sisip: " + buah);

        buah.set(0, "Anggur"); 
        System.out.println("Ganti: " + buah);

        buah.remove("Jeruk"); 
        System.out.println("Hapus:" + buah);
        
        System.out.println("Ada Apel?: " + buah.contains("Apel"));
        System.out.println("Jumlah : " + buah.size());
    }
}
