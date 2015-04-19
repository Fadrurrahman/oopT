/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dealermobil;

/**
 *
 * @author Aam Hamli
 */
public class Pembeli {
    
    private String nama;
    private String noKtp;
    private Alamat alamat;
    private Pembayaran pembayaran;
  
   
    public void setnama(String nama){
        this.nama=nama;
    }
    public void setnoKtp(String noKtp)throws Exception{
        try{
            Integer.parseInt(noKtp);
        }catch(Exception e) {
            throw new Exception ("noKtp harus berupa angka");
        }
        this.noKtp=noKtp;
    }
    public void setAlamat(Alamat alamat){
        this.alamat=alamat;
    }
    public void setPembayaran(Pembayaran pembayaran){
        this.pembayaran=pembayaran;
    }
    
    String getnama(){
        return nama;
    }
    String getnoKtp(){
        return noKtp;
    }
    public Alamat getalamat(){
        return alamat;
    }
    public Pembayaran getPembayaran(){
        return pembayaran;
    }
}
