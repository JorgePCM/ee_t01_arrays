package ee_t02_pilas01;
import java.io.*;

public class agrupador {

	 public static void main(String [] args)throws java.io.IOException{
	  agrupador a=new agrupador();
	  
	  BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
		String cadena=br.readLine();
		int p=Integer.parseInt(cadena);
		Pilas pila=new Pilas(p);
	   while (cadena!=null){
		    cadena=br.readLine();
		    pila.push(cadena);
		    }	
	  
	  a.comprobar(pila);

	 }


	 public void comprobar(Pilas p){
	  int resultado=0;
	  char [] cadena;
	  int  [] cad;
	  String t=p.Pop();
	  
	  while(t!=null){
	   cadena =new char[t.length()];
	   cadena=t.toCharArray();
	   cad =new int[cadena.length];
	   int fin=cadena.length-1;
	   
	   for(int o=0;o<cadena.length;o++){
	     System.out.print(cadena[o]);
	     
	   }
	   for(int l=0;l<cadena.length;l++){
	    if (cadena[l]=='{'){
	       cad[l]=1; 
	    }else if(cadena[l]=='['){
	      cad[l]=2;
	    }else if(cadena[l]=='('){
	     cad[l]=3;
	    }else if(cadena[l]=='}'){
	     cad[l]=1;
	    }else if(cadena[l]==']'){
	     cad[l]=2;
	    }else if(cadena[l]==')'){
	     cad[l]=3;
	    }
	    
	   }
	   
	   
	   for(int i=0;i<cad.length/2;i++){
	   
	    if(cad[i]==cad[fin]){
	     resultado++;
	     }
	     fin--;
	   }
	   System.out.println();
	   
	   if (resultado==cadena.length/2){
	    System.out.println("Si");
	    }else{
	    System.out.println("NO");
	    }
	   
	   t=p.Pop();
	   resultado=0;
	  }
	  
	  }

	}
