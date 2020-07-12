
/**
 * Write a description of part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class part3 {
 boolean   twoOccurrences(String a,String b){
     int first=b.indexOf(a);
     if(first==-1){
        return false;
        }
     int second=b.indexOf(a,first+a.length());   
          if(second==-1){
        return false;
        }
    
    
    return true;
    } 
    void testTwoOccurrences(){
    System.out.println(twoOccurrences("a","banana"));
    System.out.println(twoOccurrences( "atg", "ctgtatgta"));
    System.out.println(twoOccurrences("by", "A story by Abby Long") );
    }
}
