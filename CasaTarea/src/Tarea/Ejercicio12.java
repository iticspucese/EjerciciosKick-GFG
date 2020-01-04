package Tarea;

public class Ejercicio12 {

	// funci�n para imprimir el n�mero de d�gitos 
    static void findNumberOfDigits(long n, int base) 
    { 
          
        // C�lculo de registro utilizando cambio de base
        // propiedad y luego tomarlo  
        // piso y luego agregando 1.
        int dig = (int)(Math.floor( 
                        Math.log(n) / Math.log(base)) 
                        + 1);  
          
          
        // salida de impresi�n 
        System.out.println("El numero de digitos de "
                            + n + " en base " + base  
                            + " es " + dig); 
    } 
  
    // M�todo del conductor    
    public static void main(String[] args) 
    { 
        // tomando entradas 
        long n = 1446; 
        int base = 7; 
          
        // llamando al m�todo 
        findNumberOfDigits(n, base); 
    } 
} 