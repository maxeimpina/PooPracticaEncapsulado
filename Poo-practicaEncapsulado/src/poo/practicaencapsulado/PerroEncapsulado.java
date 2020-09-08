/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.practicaencapsulado;




/**
 *
 * @author maxi
 */
public class PerroEncapsulado {
     //Atributos
 private int patas=4;                //cantidad de patas por defecto
 private boolean pulgas=false;       //nos dira si tiene o no pulgas
 private String color= "";
 private final String [] colores = {"blanco", "negro", "marron"};



// genera del string colores un numero aleatorio 
// que sera el color instanciado

/*
String [] colores = {"blanco", "negro", "marron"};  //vector de colores posibles
Random seleccion = new Random();                    
int posiciondecolor = seleccion.nextInt(3);

    //Atributo color
private String color= colores[posiciondecolor]; //ya seteado en el constructor ppal
*/
 
   //Constructor ppal
 public PerroEncapsulado(){
    this.patas=4;
    this.pulgas=false;
    this.color="blanco"; 
 }
 
public void SetPatas(int patas){
    if ((patas > 0) && patas < 5){
    this.patas=patas;
    } 
}

public void SetPulgas(boolean pulgas){
    if (pulgas == true){
       this.pulgas=true;
    }else{
       this.pulgas=false;
    }
}

public void SetColor(String color){
  
    if (validarcolor(color) == true){
        this.color = color;
        }
    }
    

public boolean validarcolor(String color){
    for (int indice=0; indice <= colores[indice].length(); indice ++){
        if (!colores[indice].equals(color)){ 
        } else {
            return true;
        }
    }
    return false;
}
        
public int GetPatas(){
    return patas; 
}

public boolean GetPulgas(){
    return pulgas;
    } 

public String GetColor(){
    return color;
}    


    //Metodo para emitir ladrido
public void ladrar(){
    String ladrido="¡¡Guau Guau!!";
    System.out.println (ladrido);
}    


    //Metodo para dejar al perro con pulgas
public boolean espulgoso(boolean pulgas){
    if (pulgas == false){ 
        pulgas = true;
        return pulgas;
    } else {
        return pulgas;
    }       
}

}
        
