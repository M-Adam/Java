package zad1;

import javax.swing.JOptionPane;


public class Zad1 {

    
    public static void main(String[] args) {
         
        while(true){
            String input = JOptionPane.showInputDialog("Podaj cyfrę z zakresu 0-9");
                            
            String output;
            switch(input){
                case "1": 
                    output = "jeden";
                    break;
                case "2": 
                    output = "dwa";
                    break;
                case "3": 
                    output = "trzy";
                    break;
                case "4": 
                    output = "cztery";
                    break;
                case "5": 
                    output = "pięć";
                    break;
                case "6": 
                    output = "sześć";
                    break;
                case "7": 
                    output = "siedem";
                    break;
                case "8": 
                    output = "osiem";
                    break;
                case "9": 
                    output = "dziewięć";
                    break;
                default:
                    return;
            }
            JOptionPane.showMessageDialog(null, output);
        }
    }
}