
/**
 * Write a description of part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class part1 {
    int findStopCodon(String dna,int startIndex,String endCodon){
        int endIndex=dna.indexOf(endCodon,startIndex+3);
        if(endIndex==-1 || (endIndex-startIndex)%3!=0){
            return dna.length();
        }
        else{
            //System.out.println(dna.substring(startIndex,endIndex+3));
         return endIndex;
        }
    
    
    
    
    }
    String findGene(String dna){
        dna=dna.toUpperCase();
        int startIndex=dna.indexOf("ATG");
        if(startIndex==-1){
            return "";
        }
        int endIndexTaa=findStopCodon(dna,0,"TAA");
        int endIndexTag=findStopCodon(dna,0,"TAG");
        int endIndexTga=findStopCodon(dna,0,"TGA");
        int minIndex=Math.min(endIndexTaa,Math.min(endIndexTag,endIndexTga));
        if(minIndex==dna.length())
           return "";
        else
            return dna.substring(startIndex,minIndex+3);
            
    
    }
    int howManyGenes(String dna){
        int startIndex=dna.indexOf("ATG");
        if(startIndex==-1){
            return 0;
        }
        int ct=0;
        while(true){
        int endIndexTaa=findStopCodon(dna,startIndex,"TAA");
        int endIndexTag=findStopCodon(dna,startIndex,"TAG");
        int endIndexTga=findStopCodon(dna,startIndex,"TGA");
        int minIndex=Math.min(endIndexTaa,Math.min(endIndexTag,endIndexTga));
        System.out.println("M:"+minIndex);
        if(minIndex==dna.length())
           return ct;
        else{
           ct=ct+1;
           System.out.println("DDD");
           startIndex=minIndex+3;
           if(startIndex>=dna.length())
             return ct;
        }   
        
        }
        
    
    
    
    }
    
    
    
    int howMany(String a,String b){
        int startIndex=0;
        int ct=0;
        while(true){
        
        int index=a.indexOf(b,startIndex);
        //System.out.println("index"+index);
         if(index==-1){
            return ct;
            }
            else{
                ct=ct+1;
                //System.out.println("ct"+);
                startIndex=index+b.length();
                if(startIndex+b.length()>a.length())
                  return ct;
            }
       }
    }
    void testHowMany(){
    
    System.out.println(howMany("aaaaaaaaaaa","a"));
    System.out.println(howMany("abaabaabaabaaba","aba"));
    System.out.println(howMany("aaaaaaaaaaa","q"));
    System.out.println(howMany("aaaaabaaaaaba","aba"));
    }
     void testHowManyGenes(){
         System.out.println(howManyGenes("ATGTAATAATGAAATAA"));
         System.out.println(howManyGenes("ATGTGTGTGTGTTAG"));
        }
    void testFindStopCodon(){
        
        System.out.println(findGene("ATACATATATGTGTGTGGATGATTAATAG"));
    }
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
