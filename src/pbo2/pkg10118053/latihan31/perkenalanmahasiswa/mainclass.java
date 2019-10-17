/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118053.latihan31.perkenalanmahasiswa;

/**
 *
 * @author 
 * NAMA     : Kevin Alvian
 * KELAS    : IF-2
 * NIM      : 10118053
 */
public class mainclass {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nim = "10118053";
        mhs.nama = "Kevin Alvian";
        
        mhs.perkenalkanDiri();
        
        mhs.nim = "10110270";
        mhs.nama = "Indra Tiola";
        
        mhs.perkenalkanDiri();
        
        mhs.nim = "10110271";
        mhs.nama = "Robi Tanzil Ganefi";
        
        mhs.perkenalkanDiri();
        
        mhs.nim = "10110269";
        mhs.nama = "Muhammad Nur Awaludin";
        
        mhs.perkenalkanDiri();
        

    }
    
}
