
/**
 * Write a description of part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class part4 {
    
    void reader(){
         URLResource ur = new URLResource("https://americanliterature.com/short-short-stories");
         for (String s : ur.words()) {
             System.out.println(s);
         }
    
    
    
    }

}
