/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dealermobil;

/**
 *
 * @author Aam Hamli
 */
public class Alamat {

    private String jalan;
    private String kota;
    private String prov;
    
    public void setJalan(String jalan){
        this.jalan=jalan;
    }
    public void setKota(String kota){
        this.kota=kota;
    }
    public void setProv(String prov){
        this.prov=prov;
    }
    
    public String getJalan(){
        return jalan;
    }
    public String getKota(){
        return kota;
    }
    public String getProv(){
        return prov;
    }
}
