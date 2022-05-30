package br.com.aragy.iterator;

public class IteratorPatternDemo {  
    public static void main(String[] args) {  
        CollectionofDesignation cmpnyRepository = new CollectionofDesignation();  
         
        for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){  
            String designation = (String)iter.next();  
            System.out.println("Designation : " + designation);  
         }      
  }  
} 
    


