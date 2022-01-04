/*
Alumne: Gerard Fernández Tejada
Curs: CFGS 1r DAM 
Modul: M3 "Programació"
Professor: Isabel Ruiz
Data: 11/10/2021
Nom de la Practica: A9.0.2

Entra un número enter per teclat i mostra els valors que van des del número entrat fins a l'1.
 */
//package m3_a9_0_2_fernandez_gerard;
    import java.util.Scanner;
public class M3_A9_0_2_Fernandez_Gerard {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        System.out.print("Introduzca un numero y el programa hara una cuenta desde el valor introducido hasta 0:");
        valor= teclado.nextInt();
        //mientras valor sea mayor o igual a 0 se realizara el bucle
        while (valor>=0){
            System.out.println(valor);
            valor=valor-1;
        }
    }
    
}
