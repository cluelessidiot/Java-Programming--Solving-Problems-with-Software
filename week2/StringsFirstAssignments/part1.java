
/**
 * Write a description of part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class part1 {
    
    String findSimpleGene(String dna){
        String subString=null;
        dna=dna.toUpperCase();
        int startIndex=dna.indexOf("ATG");
        int endIndex=dna.indexOf("TAA",startIndex+3);
        if(dna.indexOf("ATG")==-1 || dna.indexOf("TAA",startIndex+3)==-1 ){
            return "";
        }
        

        
        
       if( dna.substring(startIndex,endIndex+3).length()%3==0) 
                return dna.substring(startIndex,endIndex+3);
       return "";         
    }
    void  testSimpleGene(){
        String dna1="ACTACATAAAACACATATAT";
        String dna2="ACTGACACATGACGGCTACACATCATGATG";
        String dna3="ACAXATATTHTHTHTHAAAAAAAAAAA";
        String dna4="ACACTGTGTGATGAGAGGAGTGTGATTAAGAGAAG";
        String dna5="ACACTGTGTGATGAGAGGAGGTGATTAAGAGAAG";
        System.out.println( findSimpleGene(dna1));
        System.out.println( findSimpleGene(dna2));
        System.out.println( findSimpleGene(dna3));
        System.out.println( findSimpleGene(dna4));
        System.out.println( findSimpleGene(dna5));
        
        
        



    }

}
