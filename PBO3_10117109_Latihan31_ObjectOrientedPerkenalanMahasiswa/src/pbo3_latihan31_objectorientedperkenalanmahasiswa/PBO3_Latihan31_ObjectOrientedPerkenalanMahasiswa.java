/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_latihan31_objectorientedperkenalanmahasiswa;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Memperkenalkan mahasiswa melalui data yang ada 
 */
public class PBO3_Latihan31_ObjectOrientedPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswi mhs1 = new Mahasiswi();
        mhs1.nim = "10117109";
        mhs1.nama = "STEFANUS SAPUTRA";
        mhs1.perkenalanDiri (mhs1.nim, mhs1.nama);
        
        Mahasiswi mhs2 = new Mahasiswi();
        mhs2.nim = "10117107";
        mhs2.nama = "MUHAMD BARIQ";
        mhs2.perkenalanDiri (mhs2.nim, mhs2.nama);
    }
    
}
