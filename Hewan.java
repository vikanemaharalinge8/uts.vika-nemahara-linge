/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahewan;

/**
 *
 * @author ITBI 27
 */
public class Hewan {
    String nama;
    String jeniskelamin;
    int umur;
    
   public Hewan(String nama, String jeniskelamin,int umur){
    this.nama= nama;
    this.jeniskelamin= jeniskelamin;
    this.umur=umur;
    }
   
   void tampilkanInformasiHewan(){ 
    System.out.println("Nama Hewan: " + nama);
    System.out.println("Jenis Kelamin: " + jeniskelamin);
    System.out.println("Umur Hewan: " + umur);  
    }
}

