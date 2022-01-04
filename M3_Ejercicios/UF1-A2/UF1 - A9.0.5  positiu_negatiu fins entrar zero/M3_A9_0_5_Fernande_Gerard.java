/*
Alumne: Gerard Fernández Tejada
Curs: CFGS 1r DAM 
Modul: M3 "Programació"
Professor: Isabel Ruiz
Data: 13/10/2021
Nom de la Practica: A9.0.5

Entrar per teclat una seqüència de números, quan es acabada en 0 acaba el programa, i per cada un d'ells mostrar el missatge: El número ? és positiu/negatiu.
 */
//package m3_a9_0_5_fernande_gerard;
    import java.util.Scanner;
public class M3_A9_0_5_Fernande_Gerard {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num=5, contador;
        
            while (num!=0){
                System.out.print("Introduce un numero: ");
                num=teclado.nextInt();
                if (num>0){
                    System.out.println("El numero introducido es positivo \n");
                    
                }else if(num<0){
                    System.out.println("El numero introducido es negativo\n");
                }else{
                    System.out.println("Fin del programa");
                }
                    
            }
    }
    
}
