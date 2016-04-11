/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad8;

import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class Zad8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pesel = JOptionPane.showInputDialog("Podaj swój nr pesel");
        if(pesel.length()!=11){
            JOptionPane.showMessageDialog(null, "Błędny nr pesel");
            return;
        }
        String rok = pesel.substring(0, 2);
        String miesiac = pesel.substring(2,4);
        String dzien = pesel.substring(4, 6);
        boolean po2000 = Integer.parseInt(miesiac)>12;
        
        if(po2000){
            int miesiacPo2000 = Integer.parseInt(miesiac)-20;
            JOptionPane.showMessageDialog(null, "Twoja data urodzenia: \n"+dzien+"."+miesiacPo2000+".20"+rok+" r.");
        }
        else
            JOptionPane.showMessageDialog(null, "Twoja data urodzenia: \n"+dzien+"."+miesiac+".19"+rok+" r.");
            
        
    }
    
}
