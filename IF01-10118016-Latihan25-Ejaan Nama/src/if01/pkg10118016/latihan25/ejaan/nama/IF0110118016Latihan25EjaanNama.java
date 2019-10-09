/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan25.ejaan.nama;
import java.util.Scanner;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Ejaan Nama
 */

public class IF0110118016Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        
        //masukkan
        System.out.print("Masukkan nama depan anda : ");
        Scanner tempNama = new Scanner(System.in);
        nama = tempNama.nextLine();
               
        // proses
        char ejaan [] = nama.toCharArray();
        
        //keluaran
        for(int i = 0; i < ejaan.length ; i++){
            System.out.println("Huruf Ke - " + (i+1) + " : " + ejaan[i]);
        }
    }
    
}
