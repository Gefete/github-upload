/*
Alumne: Gerard Fernández Tejada
Curs: CFGS 1r DAM 
Modul: M3 "Programació"
Professor: Isabel Ruiz
Data: 13/10/2021
Nom de la Practica: A9.0.4

Generar 50 números aleatoris compresos entre 1 i 15.
Mostra'ls per la pantalla.
 */
//package m3_a9_0_4_fernandez_gerdard;
    import java.util.Random;
public class M3_A9_0_4_Fernandez_Gerdard {
    
    public static void main(String[] args) {
        Random aleatorio=new Random();
        int num= 0;
        int contador=1;
        final int repeticiones=50;
        //Genera un numero aleatorio en cada repeticion
        while (contador<=repeticiones){
            num= aleatorio.nextInt(15)+1;
            System.out.println("El numero aleatorio "+contador+" es: "+num);
            contador=contador+1;
        }
    }
    
}
