
package m.mycompany.proyectoaritmetica;

/**
  * @author Becw Technology
 */
public class Aritmetica {
 
    //atributos a nivel global de la clase
    int a;
    int b;
    

    
    //2.-Contructor vacio se debe de llamar exactamente igual que la clase
    
    public Aritmetica() {
       System.out.println("Ejecutando contructor vacio");  
        }
    
    //4.-Constructor con argumentos
    public Aritmetica(int a, int b) {
       this.a= a;
       this.b= b;
           } 
    
    
    //1.-Creacion de un metodo
    //(Realizar la suma de los argumentos y poner el resultado en una variable)
    //Modificador de acceso(public),tipo de regreso(int),nombre del metodo(sumar)
    //Argumentos separados por coma (int a,int):
    
    public int sumar(){
           return this.a + this.b;
    }
    
    public int restar(){
           return this.a - this.b;
    }
    
    public int multiplicar(){
            return this.a * this.b;
    }
    
    public int dividir(){
            return this.a / this.b;
    }
    
    
    
}
