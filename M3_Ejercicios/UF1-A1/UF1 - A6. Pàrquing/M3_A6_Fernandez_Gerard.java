/*
Alumne: Gerard Fernández Tejada
Curs: CFGS 1r DAM 
Modul: M3 "Programació"
Professor: Isabel Ruiz
Data: 30/09/2021
Nom de la Practica: A4
package m3_a5_fernandez_gerard;


Dissenyeu un algorisme que calculi el preu de l’estada dins d’un pàrquing.
Cal que demani tant l’hora d’entrada com la de sortida enformat hora i minut (dos enters), 
les quals suposem que són del mateix dia.
Tenim 3 tarifes per calcular el preu de l’estada:
    Preu per minut (del minut 1 al 30) 0,057750 €.
    Preu per minut (del minut 31 al 120) 0,055 €.
    Preu per minut (a partir del minut 121) 0,050 €.
Màxim/dia 20,95€
 */
package m3_a6_fernandez_gerard;
    import java.util.Scanner;
public class M3_A6_Fernandez_Gerard {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int he, me, hs, ms, mstacion;
        double precio=0;
        //Intrduccion de datos (horas de entrada y salida)
        System.out.println("Ponga primero la hora y despues los minutos de la entrada: ");
        he= teclado.nextInt();
        me= teclado.nextInt();
        System.out.println("Ponga primero la hora y despues los minutos de la salida: ");
        hs= teclado.nextInt();
        ms= teclado.nextInt();
        //convertir horas a minutos
        mstacion=(hs*60+ms)-(he*60+me);
        //Sentencia para calcular tramos de horario
        if (mstacion<=30){
            precio=(double)mstacion*0.057750;
            }else if ((mstacion>30)&&(mstacion<=120)){
                precio=(double)(30*0.057750)+((mstacion-30)*0.055);
                }else if (mstacion>120){
                    precio=(double)(30*0.057750)+((90*0.055)+(mstacion-(30+90)*0.050));
                    if (precio>=20.95){
                        precio=20.95;
                        }
                    }
       
        System.out.println("Saldo a pagar: "+precio);
        System.out.println("ha estado estacionado durante: "+ ((double)mstacion/60)+" h\n(Maximo por dia 20.95€)");
    }
}
  
