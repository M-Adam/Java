package zad6;

import javax.swing.JOptionPane;

public class Zad6 {

    public static void main(String[] args) {
        String[] marki = new String[3];
        for(int i=0; i<marki.length; i++)
            marki[i] = JOptionPane.showInputDialog("Podaj "+(i+1)+" markę");
        
        System.out.println();
        StringBuilder sb = new StringBuilder("");
        for(String str:marki)
            sb.append(str).append(" ");
        
        JOptionPane.showMessageDialog(null,"Przed zamianą: " + sb.toString());
        
        zamiana(marki);
    }
    
    private static void zamiana(String[] marki){
        StringBuilder sb;
        char temp;
        
        for(int i = 0; i<marki.length; i++){
            sb = new StringBuilder(marki[i]);
            temp = sb.charAt(0);
            sb.setCharAt(0, sb.charAt(2));
            sb.setCharAt(2, temp);
            marki[i] = sb.toString(); 
        }
        
        sb = new StringBuilder("");
        for(String str:marki)
            sb.append(str).append(" ");
        
        JOptionPane.showMessageDialog(null, "Po zamianie: "+sb.toString());
    } 
}