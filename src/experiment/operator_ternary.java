/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package experiment;


/**
 *
 * @author WIN 10
 */
public class operator_ternary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int angka = 10;
        String hasil;

        // Gunakan operator ternary untuk menentukan nilai 'hasil'
        hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        // Cetak hasil
        System.out.println("Angka ini adalah " + hasil);
    }
    
}
