/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;

import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class Zad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String imie = JOptionPane.showInputDialog("Podaj imie");
        String nazwisko = JOptionPane.showInputDialog("Podaj nazwisko");
        JOptionPane.showMessageDialog(null, "Nazywasz sie "+imie+" "+nazwisko+".");
    }
    
}
