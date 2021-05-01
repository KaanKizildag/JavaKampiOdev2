/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author kaan
 */
public class Instructor extends User{
    private String verilenDers;
    private int ogrenciSayisi;

    // sadece boş constructor kullanıyorum.
    
    public String getVerilenDers() {
        return verilenDers;
    }

    public void setVerilenDers(String verilenDers) {
        this.verilenDers = verilenDers;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }
    
    
    
}
