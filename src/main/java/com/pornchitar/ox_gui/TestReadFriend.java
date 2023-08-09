/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pornchitar.ox_gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class TestReadFriend {
    public static void main(String[] args){
        FileInputStream fis = null;
        try {
            File file = new File("friends1.dat");
            fis = new FileInputStream(file);
            ObjectInputStream ois  = new ObjectInputStream(fis);
            Friend f1 = (Friend)ois.readObject();
            Friend f2 = (Friend)ois.readObject();
            System.out.println(f1);
            System.out.println(f2);
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!!!");
        } catch (IOException ex) {
            System.out.println("IO Error!!!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Error!!!");
        } finally {
            try {
                if(fis!=null){
                    fis.close();
                }
                
            } catch (IOException ex) {
                Logger.getLogger(TestReadFriend.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
