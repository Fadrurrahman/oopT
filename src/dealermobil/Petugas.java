/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dealermobil;

/**
 *
 * @author Aam Hamli
 */
public class Petugas {

    private String nama;
    private String id;
    private Alamat alamat;
    
    void setnama(String nama){
        this.nama=nama;
    }
    void setid(String id){
        this.id=id;
    }
    public Alamat getAlamat() {
        return alamat;
    }
    String getnama(){
        return nama;
    }
    String getid(){
        return id;
    }
    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
}
