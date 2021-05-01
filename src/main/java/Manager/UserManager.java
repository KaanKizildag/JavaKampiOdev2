/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Entity.User;
import java.util.List;

/**
 *
 * @author kaan
 */
public class UserManager {
    
    public void girisYap(User user){
        System.out.println(user.getFirstname() + " sisteme giriş yaptı");
    }
    
    public void girisYap(List<User> users){
        for(User user : users){
            this.girisYap(user);
        }
    }
    
}
