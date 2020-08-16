/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package particalcsd;

/**
 *
 * @author Đỗ O.O Nam
 */
public class ButManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu mn = new Menu();
        System.out.printf("\n");
        System.out.println("============Pen MANAGEMENT============");
        mn.add("--------Add new But--------");
        mn.add("--------Search but based on trọng lượng người dùng nhập--------");
        mn.add("----------------Update By ID-----------");
        mn.add("--------List all but--------");
        mn.add("Thanks. Goodbye.");
        
        ButList list = new ButList();
        int userChoice;
        
        do {            
            userChoice = mn.getUserChoice();
            switch (userChoice) {
                case 1: list.addBut(); break;
                case 2: list.printTrongLuong(); break;
                case 3: boolean suc = list.updateByID();
                if(suc) System.out.println("Thanh cong");
                else System.out.println("That bai");
                
                  break;
                case 4: list.print(); break;
            }
        } while (userChoice >= 0 && userChoice < 5);
    }
    
}
