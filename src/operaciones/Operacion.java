
package operaciones;


public class Operacion {
    
public int sumar (int numero1, int numero2){
int resultado =0;
resultado = numero1 + numero2;
return resultado;
}
    public int restar (int numero1, int numero2){
    int resultado =0;
    resultado = numero1 - numero2;
return resultado;
    }
    public int multiplicar (int numero1, int numero2){
    int resultado =0;
    resultado = numero1 * numero2;
return resultado;     
    }
    public int dividir (int numero1, int numero2){
    double resultado =0;
    resultado = (int) (numero1*1.0 / numero2);
return (int) resultado; 
    }
}