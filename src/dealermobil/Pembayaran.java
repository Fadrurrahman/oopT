/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dealermobil;

import java.util.Date;
/**
 *
 * @author Aam Hamli
 */
public class Pembayaran {

    private String jenis;
    private String cara;
    private Date tanggalpembelian;
    
    public void setTanggal(Date tanggalpembelian) {
        this.tanggalpembelian = tanggalpembelian;
    }
   
    void setJenis(String jenis){
        this.jenis = jenis;
    }
    void setCara(String cara){
        this.cara=cara;
    }
    public Date getTanggal(){
       return tanggalpembelian;
    }
    String getJenis(){
        return jenis;
    }
    String getCara(){
        return cara;
    }
}

