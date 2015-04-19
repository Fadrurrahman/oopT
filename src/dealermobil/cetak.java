/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dealermobil;

/**
 *
 * @author Aam Hamli
 */
public class cetak {
    
 static void cetakMobil(Mobil mobil) {
        System.out.println(mobil.getmerk());
        System.out.println(mobil.gettype());
        System.out.println(mobil.getwarna());
        System.out.println(mobil.getharga());
       }
       static void cetakPembeli(Pembeli pembeli){
           System.out.println(pembeli.getnama());
           System.out.println(pembeli.getnoKtp());
           System.out.println(pembeli.getalamat());
           System.out.println(pembeli.getalamat());
           System.out.println(pembeli.getPembayaran());
       }
       static void cetakPetugas(Petugas petugas){
           System.out.println(petugas.getnama());
           System.out.println(petugas.getid());
           System.out.println(petugas.getAlamat());
       }
}
