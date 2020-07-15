
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
        int endIndexTaa=dna.indexOf("TAA",startIndex+3);
        int endIndexTag=dna.indexOf("TAG",startIndex+3);
        int endIndexTga=dna.indexOf("TGA",startIndex+3);
        
        if(dna.indexOf("ATG")==-1 || (dna.indexOf("TAA",startIndex+3)==-1 && dna.indexOf("TAG",startIndex+3)==-1 && dna.indexOf("TGA",startIndex+3)==-1)){
            return "";
        }
        if(endIndexTaa==-1){
            endIndexTaa=Integer.MAX_VALUE;
        }
        if(endIndexTag==-1){
            endIndexTag=Integer.MAX_VALUE;
        }
        if(endIndexTaa==-1){
            endIndexTga=Integer.MAX_VALUE;
        }
        
        int minIndex=Math.min(endIndexTaa,Math.min(endIndexTag,endIndexTga));
        

        
        
       if( dna.substring(startIndex,minIndex+3).length()%3==0) 
                return dna.substring(startIndex,minIndex+3);
       return "";         
    }
    void  testSimpleGene(){
        String dna1="ACTACATAAAACACATATAT";
        String dna2="ACTGACACATGACGGCTACACATCATGATG";
        String dna3="ACAXATATTHTHTHTHAAAAAAAAAAA";
        String dna4="ACACTGTGTGATGAGAGGAGTGTGATTGAGAGAAG";
        String dna5="ACACTGTGTGATGAGAGGAGGTGATTAAGAGAAG";
        System.out.println( findSimpleGene(dna1));
        System.out.println( findSimpleGene(dna2));
        System.out.println( findSimpleGene(dna3));
        System.out.println( findSimpleGene(dna4));
        System.out.println( findSimpleGene(dna5));
        
        
        



    }

}
