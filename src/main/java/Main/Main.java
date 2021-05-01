/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entity.*;
import Manager.InstructorManager;
import Manager.StudentManager;
import java.util.List;

/**
 *
 * @author kaan
 */

public class Main {

    public static void main(String[] args) {

        ogrencileriDene();
        System.out.println("----------------------");
        ogretmenleriDene();
    }

    public static void ogrencileriDene() {
        Student student1 = new Student();
        student1.setFirstname("Hüseyin");
        student1.setLastname("Kızıldağ");
        student1.setAlinanDers("Java OOP");

        Student student2 = new Student();
        student2.setFirstname("Kaan");
        student2.setLastname("Kızıldağ");
        student2.setAlinanDers("Java React kampı");

        StudentManager sm = new StudentManager();

        sm.girisYap(student2); // super classdan çağrılıyor
        sm.girisYap(student1);

        // basitçe liste oluşturmak için List.of() kullandım.
        sm.derseAl(List.of(student1, student2));
    }

    public static void ogretmenleriDene(){
        Instructor instructor1 = new Instructor();
        instructor1.setFirstname("Engin");
        instructor1.setVerilenDers("Java OOP");
        
        Instructor instructor2 = new Instructor();
        instructor2.setFirstname("Demiroğ");
        instructor2.setVerilenDers("Java React kampı");
        
        InstructorManager im = new InstructorManager();
        
        // super class üzerinden çalıştı.
        im.girisYap(List.of(instructor2, instructor1)); 
        im.dersVer(List.of(instructor2, instructor1));
        
    }
    
}
