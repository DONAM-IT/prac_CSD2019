/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package particalcsd;

import java.util.Scanner;

/**
 *
 * @author Đỗ O.O Nam
 */
public class But {

    String id = "", nsx = "";
    int soLuong = 0, trongLuong = 0;

    Scanner sc = new Scanner(System.in);

    public But() {
    }

    public But(String id) {
        this.id = id;
    }

    public But(String id, String nsx, int soLuong, int trongLuong) {
        this.id = id;
        this.nsx = nsx;
        this.soLuong = soLuong;
        this.trongLuong = trongLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(int trongLuong) {
        this.trongLuong = trongLuong;
    }

    @Override
    public String toString() {
        return "But{" + "id=" + id + ", nsx=" + nsx + ", soLuong=" + soLuong + ", trongLuong=" + trongLuong + '}';
    }

    public void input() {
        System.out.println("Add new But");

        boolean proced = false;

        //input ID
        do {
            System.out.print("Input ID: ");
            id = sc.nextLine().trim();
            proced = (id.length() == 0);
            if (proced == true) {
                System.err.println("ID must be inputted");
            }
        } while (proced);

        do {
            System.out.print("Nhập NSX: ");
            nsx = sc.nextLine().trim();
            proced = (nsx.length() == 0);
            if (proced == true) {
                System.err.println("NSX must be inputted");
            }
        } while (proced);

        do {
            System.out.print("Nhập SỐ lƯỢNG: ");
            soLuong = Integer.parseInt(sc.nextLine());
            if (soLuong <= 0) {
                System.err.println("Number of số Lượng must be bigger than 0");
            }
        } while (soLuong <= 0);

        do {
            System.out.print("Nhập Trọng Lượng: ");;
            trongLuong = Integer.parseInt(sc.nextLine());
            if (trongLuong <= 0) {
                System.err.println("Trọng Lượng must be bigger than 0");
            }
        } while (trongLuong <= 0);

    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((But) obj).id);
    }
}
