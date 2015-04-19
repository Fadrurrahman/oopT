/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dealermobil;

/**
 *
 * @author Aam Hamli
 */
public class Mobil {

    private String type;
    private String merk;
    private String warna;
    private int harga;
    
   boolean equals(Mobil mobil) {
        return merk.equals(mobil.merk)
                && type.equals(mobil.type)
                && warna.equals(mobil.warna)
                && harga==mobil.harga;
   }
   void setmerk(String merk){
       if (merk.length()<= 50){
           this.merk = merk;
       }
   }
   void settype(String type){
       this.type = type;
   }
   void setwarna(String warna)throws Exception{
       if(warna.length() == 7){
       for (int i= 0 ; i<7 ; i++){
       if(i==0){
           if(!Character.isDigit(warna.charAt(i))){
               this.warna=warna;
               return;
           }
           
          else { throw new Exception("karakter pertaman harus hastag(#)");
           
          }
       }
       }
       }else {
           throw new Exception("salah");
       }
   }
   void setharga(int harga)throws Exception{
       if(harga>0){
       this.harga = harga;
   }else {
           throw new Exception ("harga tidak boleh negatif");
       }
   }
       
   
   String getmerk(){
       return merk;
   }
   String gettype(){
       return type;
   }
   String getwarna(){
       return warna;
   }
   int getharga(){
       return harga;
   }

}
