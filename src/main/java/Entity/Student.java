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
public class Student extends User{
    private String alinanDers;
    private String dersNotu;

    public String getAlinanDers() {
        return alinanDers;
    }

    public void setAlinanDers(String alinanDers) {
        this.alinanDers = alinanDers;
    }

    public String getDersNotu() {
        return dersNotu;
    }

    public void setDersNotu(String dersNotu) {
        this.dersNotu = dersNotu;
    }
    
    
    
}
