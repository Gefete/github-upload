/*
Alumne: Gerard Fernández Tejada
Curs: CFGS 1r DAM 
Modul: M3 "Programació"
Professor: Isabel Ruiz
Data: 30/09/2021
Nom de la Practica: A4
package m3_a5_fernandez_gerard;


Necessitem un programa que ens ajudi a calcular el preu d’una entrada de cinema.
L’entrada normal val 5€ un dia laborable i un 10% més en cap de setmana. 
Els que tenen carnet jove tenen un descompte addicional del 15%.

Dissenyeu un algorisme que resolgui el problema preguntant si es tracta d’un dia laborable (L) o 
de cap de setmana (C) i si el client té Carnet Jove o no (S/N).
 */
//package m3_a5_fernandez_gerard;
import java.util.Scanner;

public class M3_A5_Fernandez_Gerard {

    public static void main(String[] args) {
        char c1, c2;
        //total= el precio con el descuento aplicado, real= precio sin descuento
        double total=5;
        Scanner teclado= new Scanner(System.in);
        System.out.print("Introduzca si el dia laborable (L) o no (F): ");
        c1= teclado.next().toUpperCase().charAt(0);
        System.out.print("Introduzca si el cliente tiene Carnet Jove (S) o no (N): ");
        c2= teclado.next().toUpperCase().charAt(0);
        
        
        if ((c1=='L' || c1=='F') && (c2=='S' || c2=='N')){
            //Si es dia laboral precio normal y si no es laborable (Fin de semana "F") habra un incremento en la tarifa
            if (c1=='L'){
                System.out.println("Precio normal"+ " 5€");
                }else{
                    total=5+(5*0.10);
                    System.out.println("Hay un incremento del 10% por ser fin de semana");
            }
            //Calculo descuento carnet Jove
            if (c2=='S'){
                total=5-(5*0.15);
                System.out.println("Descuento del 15% del 'Carnet Jove'");
                }else{
                    System.out.println("No se aplica el descuento del 'Carnet Jove'");
                }
            //Calculo para saber el 15% de descuento ante el incremento del 10% del fin de semana
            if ((c1=='F')&&(c2=='S')){
                    total=5+(5*0.10);
                    total=total - (total*0.15);
                }
            //Si los datos introducidos no son los que se piden, dara error
                }else{
                System.out.println("Error, Reinicie el programal");
            }
        System.out.println(total+"€");
        
    }
    
}
