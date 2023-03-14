/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_super;

/**
 *
 * @author invitado
 */
public class EVA2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal anima1=new Animal("firulais",7);
        Mamifero mamifero1=new Mamifero("negro","njja",4);
        Canes can1=new Canes();
        can1.
    }
    
}



class Animal{
    private String nombre;
    private int peso;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("Its alive constructor 2");
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
    
    
    public Animal(){
        System.out.println("Its alive");
    }
    
    public void respirar(){
        System.out.println("Puedo respirar");
    }
}



class Mamifero extends Animal{
    private String colorPelo;

    public Mamifero(String colorPelo, String nombre, int peso) {
        super(nombre, peso);//llamada al constructor de la super clase
        this.colorPelo = colorPelo;
        System.out.println("Soy un amifero constructor 2");
    }

    public Mamifero(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    public Mamifero(){
        //super : es como this. pero apunta a constructores y metodos de la super clase, clase padre creo, ve las cosas del padre
//        primero llamar al constructor de la superclase
        super();//llamada al constructor default
        System.out.println("Soy un amifero");
    }
}


class Canes extends Mamifero{

    public Canes() {
        super();
        
        System.out.println("Soy un can");
    }
    
}