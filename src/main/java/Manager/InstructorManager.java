/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Entity.Instructor;
import java.util.List;

/**
 *
 * @author kaan
 */
public class InstructorManager extends UserManager{

    public void dersVer(Instructor instructor){
        System.out.println(String.format("%s hoca %s dersine girdi",
                instructor.getFirstname(),
                instructor.getVerilenDers()));
    }

    public void dersVer(List<Instructor> instructors){
        for(Instructor instructor : instructors){
            this.dersVer(instructor);
        }
    }
    
}
