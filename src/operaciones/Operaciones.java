
package operaciones;

import java.util.Scanner;
public class Operaciones {
    
    

    public static void main(String[] args) {   
    Operacion ejercicio = new Operacion();        
    Scanner leer = new Scanner(System.in); 
    int numero1, numero2, resultado, opcion;
    boolean taller = true;
    while (taller){ 
          
        System.out.println("\n");
        System.out.println("---Menu---");   
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("---Salir---");
        System.out.println("Elija la Opcion");
        opcion = leer.nextInt();
                
                if (opcion == 5){
                    System.out.println("TERMINAR");
                    break;
                }else{
        switch (opcion){
            
        case 1:
        System.out.println("Ingrese el primer numero :");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero :");
        numero2 = leer.nextInt();
        resultado = ejercicio.sumar(numero1, numero2);
        System.out.println("La Suma es :"+resultado);
        break;
        
        case 2:
        System.out.println("Ingrese el primer numero :");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero :");
        numero2 = leer.nextInt();
        resultado = ejercicio.restar(numero1, numero2);
        System.out.println("La Resta Da :"+resultado);
        break;                 
                            
        case 3:
        System.out.println("Ingrese el primer numero :");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero :");
        numero2 = leer.nextInt();
        resultado = ejercicio.multiplicar(numero1, numero2);
        System.out.println("La multiplicacion Da :"+resultado);
        break;   
        
        case 4:
        System.out.println("Ingrese el primer numero :");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero :");
        numero2 = leer.nextInt();
        resultado = ejercicio.dividir(numero1, numero2);
        System.out.println("La Division Da :"+resultado);
        break;  
        
        default:
            System.out.println("Eleccion Invalida"); 
            
        }  
                }
    }
//Main
    }
    
}
