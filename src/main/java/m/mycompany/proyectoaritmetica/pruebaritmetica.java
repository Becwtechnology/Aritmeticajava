
package m.mycompany.proyectoaritmetica;

/**
 * /**
    //Creacion del objeto tipo aritmetica
    
    Aritmetica almacenar = new Aritmetica();
    almacenar.a= 10;
    almacenar.b= 3;
    int resultado = almacenar.sumar();
    
    System.out.println("Resultado: " + resultado);
          
    
    //Creacion de un segundo objeto
    
    Aritmetica almacenar2 = new Aritmetica(4,2);
    System.out.println("Resultado2: " + almacenar2.sumar());
    
   
    }*/
  
 /** 
 * @author Becw Tehnology
 */
public class pruebaritmetica {
    
    public static void main(String[] args) {
   
    //variables locales
    int operandoA = 6;   
    int operandoB = 2;
    
    //crear un objeto de la clase aritmetcia enviando argumentos
    Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);
    
   //Imprimir el valor de los operandos
   System.out.println("OperandoA =" + operandoA);
   System.out.println("OperandoB =" + operandoB);     
        
   //imprimimos la suma de las variables
   System.out.println("\nSuma de ambos valores =" + objeto1.sumar()); 
        
   //imprimimos la resta de las variables
   System.out.println("\nResta de ambos valores =" + objeto1.restar());      
        
   //imprimimos la multiplicacion de las variables
   System.out.println("\nMultiplicacion de ambos valores =" + objeto1.multiplicar());      
        
   //imprimimos la suma de las variables
   System.out.println("\nDivision de ambos valores =" + objeto1.dividir());      
        
        
        
        
        
}
    }