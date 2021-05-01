/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Entity.Student;
import Entity.User;
import java.util.List;

/**
 *
 * @author kaan
 */
public class StudentManager extends UserManager {

    public void dersAl(Student student) {
        System.out.println(String.format(
                "%s isimli öğrenci %s dersine giriş yaptı",
                student.getFirstname(),
                student.getAlinanDers()));
    }

    public void derseAl(List<Student> students) {
        for (Student student : students) {
            this.dersAl(student);
        }
    }
}
