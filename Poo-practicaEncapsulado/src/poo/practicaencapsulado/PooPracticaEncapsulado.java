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
public class PooPracticaEncapsulado {
    public static void main(String[] args) {
              
String separador="------------------------------------------------------";   
            
/*
se instancia y se crean objetos de la clase perro        
*/

PerroEncapsulado firulais, snoopy,dinamita;

firulais = new PerroEncapsulado();
snoopy = new PerroEncapsulado();
dinamita = new PerroEncapsulado();


firulais.SetPatas(5); //setea x sobrecarga ya que no entra en el seteo x ser >4
firulais.SetPulgas(false);
firulais.SetColor("marron");

System.out.println(separador);

System.out.println("Los atributos del perro firulais son:");
System.out.println("Cantidad de patas: "+firulais.GetPatas());
System.out.println("¿Tiene pulgas?: "+firulais.GetPulgas());
System.out.println("¿Que color posee?: "+ firulais.GetColor());

firulais.ladrar();

System.out.println(separador);

snoopy.SetPatas(3); 
snoopy.SetPulgas(false);
snoopy.SetColor("blanco");

System.out.println("Los atributos del perro snoopy son:");
System.out.println("Cantidad de patas: "+snoopy.GetPatas());
System.out.println("¿Tiene pulgas?: "+snoopy.GetPulgas());
System.out.println("¿Que color posee?: "+ snoopy.GetColor());

System.out.println(separador);

System.out.println("Llamando al metodo para hacer pulgoso a snoopy:");
System.out.println("¿Tiene pulgas?: "+snoopy.espulgoso(snoopy.GetPulgas()) );
snoopy.ladrar();

System.out.println(separador);


dinamita.SetPatas(2); 
dinamita.SetPulgas(true);
dinamita.SetColor("negro");

System.out.println("Los atributos del perro dinamita son:");
System.out.println("Cantidad de patas: "+dinamita.GetPatas() );
System.out.println("¿Tiene pulgas?: "+dinamita.GetPulgas() );
System.out.println("¿Que color posee?: "+ dinamita.GetColor() );
dinamita.ladrar();
dinamita.ladrar();
dinamita.ladrar();

System.out.println(separador);

  
}
}