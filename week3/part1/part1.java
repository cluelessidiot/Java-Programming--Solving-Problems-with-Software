
/**
 * Write a description of part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import org.apache.commons.csv.*;;
public class part1 {
    
   public void tester(){
    FileResource fr = new FileResource();
    CSVParser parser = fr.getCSVParser();
   // System.out.println(countryInfo(parser,"Nauru"));
    printCountryInfo(parser,"cotton","flowers");
     System.out.println(numberOfExporters(parser,"cocoa"));
     //bigExporters  (parser,"$720,000,000");
     //System.out.println(comparator("$876","$999"));
     //bigExporters (parser,"$999,999,999,999");
    }
    String countryInfo (CSVParser parser,String country){
     for(CSVRecord record: parser){
        String countryData= record.get("Country");
        if(countryData.contains(country)){
           // System.out.println(record.get(0));
            return record.toString();
        }
        
        }   
    return "NOT FOUND";
    }
      void printCountryInfo (CSVParser parser,String item1,String item2){
     for(CSVRecord record: parser){
        String countryData= record.get("Exports");
        if(countryData.contains(item1) && countryData.contains(item2)){
            System.out.println(record.get(0));
            
        }
        
        }   

    }
      int numberOfExporters(CSVParser parser,String item){
     int ct=0;
          for(CSVRecord record: parser){
        String countryData= record.get("Exports");
        if(countryData.contains(item)){
            ct++;
          
        }
        
        }   
    return ct;
    }
    boolean comparator(String a,String b){
    int c1=a.length();
    int c2=b.length();
     //System.out.println("dfddd   "+a);
    if(c1>c2)
      return true;
    if(c1<c2)
       return false;
     for(int i=1;i<c1;i++){
        if(a.charAt(i)!=','){
        int n1=a.charAt(i);
        int n2=b.charAt(i);  
        if(n1>n2)
           return true;
        if(n1<n2)
           return false;
    }   
             
        }  
    return false;
    }
    
    
    
          void bigExporters  (CSVParser parser,String cost){
     for(CSVRecord record: parser){
        String countryData= record.get(2);
        if(comparator(countryData,cost)){
            String cname=record.get(0);
            System.out.println(cname+" "+ countryData);
        
        }
        
        }   

    }

    
    

}
