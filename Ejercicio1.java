package ciclos;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //LEE LOS DATOS
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2, resultado = 0;

        System.out.println("Ingrese el primer numero:  ");
        num1 = entrada.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        num2 = entrada.nextInt();

        if (num1 < 0 && num2 < 0) {
         for(int i = 0; i < -num2; i++){
            resultado += num1;
         }
        }
        else if (num1 < 0){
            for (int i = 0; i < num2; ++i ){
                resultado += num1;
            }
        }
        else if (num2 < 0){
            for (int i = 0; i < num1; i++){
                resultado += num2;
            }
        }
        else{
            for(int i = 0; i < num2; i++){
                resultado += num1;
            }
        }
        System.out.println(num1 + " multiplicado por  " + num2 + " = " + resultado);
        entrada.close();    
    }


}
