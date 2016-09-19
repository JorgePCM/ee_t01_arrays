package ee_t02_pilas01;

public class Pilas {
String []pila;
Integer tope;
Integer tam;

public Pilas(Integer tamanio){
tope=-1;
pila=new String[tamanio];
tam=tamanio-1;	
}

public void push(String dato){
if(tope<tam){
tope++;
pila[tope]=dato;
}else{
System.out.println("Desbordamiento");
}		
}

public String Pop(){
String resultado="";
if(tope>-1){
resultado=pila[tope];
tope--;
}else{
return null;	
}
return resultado;
}

public String peek(){
String resultado="";
if(tope>-1){
resultado=pila[tope];	
}else{
System.out.println("Subdesbordamiento");	
}
return resultado;
}



}