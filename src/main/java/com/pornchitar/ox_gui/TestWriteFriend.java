/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pornchitar.ox_gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class TestWriteFriend {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            Friend f1 = new Friend("Worawit", 43, "0881234567");
            Friend f2 = new Friend("Jakkaman", 45, "0881234568");
            System.out.println(f1);
            System.out.println(f2);
            File file = new File("friends.dat");
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(f1);
            oos.writeObject(f2);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestWriteFriend.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Error");
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(TestWriteFriend.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
