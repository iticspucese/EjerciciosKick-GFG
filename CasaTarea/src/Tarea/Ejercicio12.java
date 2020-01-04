package Tarea;

public class Ejercicio12 {

	// función para imprimir el número de dígitos 
    static void findNumberOfDigits(long n, int base) 
    { 
          
        // Cálculo de registro utilizando cambio de base
        // propiedad y luego tomarlo  
        // piso y luego agregando 1.
        int dig = (int)(Math.floor( 
                        Math.log(n) / Math.log(base)) 
                        + 1);  
          
          
        // salida de impresión 
        System.out.println("El numero de digitos de "
                            + n + " en base " + base  
                            + " es " + dig); 
    } 
  
    // Método del conductor    
    public static void main(String[] args) 
    { 
        // tomando entradas 
        long n = 1446; 
        int base = 7; 
          
        // llamando al método 
        findNumberOfDigits(n, base); 
    } 
} 