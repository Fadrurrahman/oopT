/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dealermobil;

import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Aam Hamli
 */
public class DealerMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil mobil1=new Mobil();
        mobil1.setmerk("Ferrari");
        mobil1.settype("FR1");
        try { 
            mobil1.setharga(10000000);
            mobil1.setwarna("#f0f0f0");
         
        } catch (Exception e) {
            System.out.println("Terjadi Error: " + e.getMessage());
            }
        
       Pembeli pembeli1=new Pembeli();
       pembeli1.setnama("Brad Mcsquid");
       try{
       pembeli1.setnoKtp("897");
       }catch (Exception r){
           System.out.println("terjadi error" + r.getMessage());
       }
        Alamat alamatPembeli = new Alamat();
        alamatPembeli.setJalan("Otista NO.64 C");
        alamatPembeli.setKota("Jakarta");
        alamatPembeli.setProv("DKI Jakarta");
       pembeli1.setAlamat(alamatPembeli);
       
       Pembayaran pembayaran1=new Pembayaran();
       pembayaran1.setJenis("cash");
       pembayaran1.setCara("Visa");
       pembayaran1.setTanggal(new Date());
       pembeli1.setPembayaran(pembayaran1);
       //pembeli1.setTanggal(new Date());

        
       Petugas petugas1=new Petugas();
       petugas1.setnama("Jenko");
       petugas1.setid("K2D15H6");
       Alamat alamatPetugas = new Alamat();
       alamatPetugas.setJalan("kebon nanas");
       alamatPetugas.setKota("Jakarta");
       alamatPetugas.setProv("DKI Jakarta");
       petugas1.setAlamat(alamatPetugas);
        
               
       
        Date waktu;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2015);
        cal.set(Calendar.MONTH, Calendar.APRIL);
        cal.set(Calendar.DATE, 14);
        waktu = cal.getTime();

        
       cetakMobil(mobil1);
       cetakPembeli(pembeli1); 
       cetakPetugas(petugas1);
       //cetakPembayaran(pembayaran1);
    
       static void cetakMobil(Mobil mobil) {
        System.out.println("Pembelian");
        System.out.println(mobil.getmerk());
        System.out.println(mobil.gettype());
        System.out.println(mobil.getwarna());
        System.out.println(mobil.getharga());
        System.out.println();
       }
       static void cetakPembeli(Pembeli pembeli){
           System.out.println("Pembeli");
           System.out.println(pembeli.getnama());
           System.out.println(pembeli.getnoKtp());
           System.out.println(pembeli.getalamat());
           System.out.println(pembeli.getPembayaran());
          // System.out.println(pembeli.getTanggal());
           System.out.println();
       }
       static void cetkPembayaran(Pembayaran bayar){
           System.out.println("pembayaran");
           System.out.println(bayar.getJenis());
           System.out.println(bayar.getCara());
           System.out.println(bayar.getTanggal());
       }
       static void cetakPetugas(Petugas petugas){
           System.out.println("Petugas");
           System.out.println(petugas.getnama());
           System.out.println(petugas.getid());
           System.out.println(petugas.getAlamat());
           System.out.println();
       }   
       
      
}
