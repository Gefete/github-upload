//Entra un número enter per teclat i mostra els valors que van d'1 fins al número entrat.
//package m3_a9.pkg0.pkg1_fernandez_gerard;
    import java.util.Scanner;
public class M3_A901_Fernandez_Gerard {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, contador=1;
        
        System.out.print("Introduzca un numero y el programa hara una cuenta desde 1 hasta el valor que ponga: ");
        valor= teclado.nextInt();
        //mientras contador sea menor o igual se realizara el bucle
        while (contador<=valor){
            System.out.println(contador);
            contador=contador+1;
        }
    }
    
}
