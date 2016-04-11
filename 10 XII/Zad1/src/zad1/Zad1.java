package zad1;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javax.swing.JOptionPane;

public class Zad1 {

  
    public static void main(String[] args) {
        Map<String, TimeZone> map = new HashMap<String, TimeZone>();
        
        String[] availableIDs = TimeZone.getAvailableIDs();
        for(String str:availableIDs){
            TimeZone zone = TimeZone.getTimeZone(str);
            String city = null;
            try{
                city = str.substring(str.indexOf("/")+1);
                if(city.contains("/"))
                    city=city.substring(city.indexOf("/")+1);
            }
            catch(IndexOutOfBoundsException exc){
                city = str;
            }
            finally{
                map.put(city, zone);
            }
        }
        
        int count = 0;
        for(Map.Entry<String, TimeZone> entrySet:map.entrySet()){
            System.out.println(entrySet.getKey() +" "+ entrySet.getValue());
            count++;
            if(count == 15) 
                break;
        }
        
               
        String miasto = JOptionPane.showInputDialog("Podaj miasto");
        DateFormat formatCzasu = DateFormat.getTimeInstance();
        TimeZone strefa = map.get(miasto);
        if(strefa == null)
            JOptionPane.showMessageDialog(null, "Nie ma takiego miasta");
        else{
            formatCzasu.setTimeZone(strefa);
            Date teraz = new Date();
            JOptionPane.showMessageDialog(null, "Czas: "+formatCzasu.format(teraz));
        }
       
       
    }
    
}
