/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pornchitar.ox_gui;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Friend {
    private int id;
    private String name;
    private int age;
    private String tel;
    private static int lastID;

    public Friend(String name, int age, String tel) {
        this.id = lastID++;
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age<0) {
            throw new Exception();
        }
        
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Friend{" + "id=" + id + ", name=" + name + ", age=" + age + ", tel=" + tel + '}';
    }

    
    public static void main(String[] args) {
        try {
            Friend f1 = new Friend( "Pom", 70 , "01234567");
            f1.setAge(-1);
            System.out.println(f1.toString());
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
}
