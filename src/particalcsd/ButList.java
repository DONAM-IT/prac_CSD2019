/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package particalcsd;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Đỗ O.O Nam
 */
public class ButList extends LinkedList<But> {
    
    Scanner sc = new Scanner(System.in);
    
    
    public void addBut() {
        But but = new But();
        but.input();
        
        if (this.add(but) == true) {
            System.err.println("Added Successfully");
        } else {
            System.err.println("Add failed");
        }
    }
    
    private int search(String id) {
        return this.indexOf(new But(id));
    }
    
    public void print() {
        for (But but : this) {
            System.out.println(but);
        }
    }
    
    public void printTrongLuong() {
        int trongluong2;
        
        System.out.println("Input Trong Luong Muốn Tìm ");
        System.out.println("Trong Luong :");
        trongluong2 = Integer.parseInt(sc.nextLine());
        
        for (But but : this) {
            int trongLuong = but.getTrongLuong();
            if (trongLuong <= trongluong2) {
                System.out.println(but);
            } 
        }
    }
    
    public boolean updateByID() {
        System.out.println("ID: ");
        String ID = sc.nextLine();
        
        for (But but : this) {
            if (but.getId().equalsIgnoreCase(ID)) {
                System.out.println("Nhà Sản Xuất: ");
                String NSX = sc.nextLine();
                System.out.println("SoLuong:");
                int soLuong = sc.nextInt();
                System.out.println("Trong Luong");
                int trongLuong = sc.nextInt();
                
                but.setTrongLuong(trongLuong);
                but.setSoLuong(soLuong);
                but.setNsx(NSX);
                return true;
            }
        }
      return false;
    }
}
