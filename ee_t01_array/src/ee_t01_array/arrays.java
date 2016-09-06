package ee_t01_array;

import java.io.*;
import java.util.*;


public class arrays
{
    
    public static void main(String [] args)throws java.io.IOException
    {
      
      BufferedReader br = new BufferedReader(new FileReader("numero.txt"));
      String cadena=br.readLine();
      int p=Integer.parseInt(cadena);
      int[] numeros=new int[p];  
      int i =0;
       
      while (cadena!=null && i<numeros.length){
        cadena=br.readLine();
        numeros[i]=Integer.parseInt(cadena);
        i++;
       }
      
      for(int o=numeros.length-1;o>=0;o--){
       System.out.println(numeros[o]);
        
      }
      
      br.close();
     
     
      
    }

   
   
}