/*
Alumne: Gerard Fernández Tejada
Curs: CFGS 1r DAM 
Modul: M3 "Programació"
Professor: Isabel Ruiz
Data: 12/10/2021
Nom de la Practica: A9.0.3

Entra per teclat 8 números i per cada un d'ells mostrar el missatge:
El número ? és positiu/negatiu/zero
 */
//package m3_a9_0_3_fernandez_gerard;

    import java.util.Scanner;
public class M3_A9_0_3_Fernandez_Gerard {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int contador=1, valor;
        //Contador empieza por el numero 1 y con cada repeticion incrementa en 1 su valor, para terminar la repeticion
        //tiene que llegar al numero 8
        while (contador<=8){
            System.out.print("Introduce el valor "+contador+": ");
            valor= teclado.nextInt();
            //en esta sentencia se separa valor positivo, negativo o 0
            if(valor>0){
                System.out.println("    - Numero positivo");
                }else if (valor==0){
                    System.out.println("    - El numero es zero");
                }else{
                    System.out.println("    - El numero es negativo");
            }
            contador=contador+1;
        }
        System.out.println("\nFin del programa");
    }
    
}
