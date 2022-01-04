/*
Alumne: Gerard Fernández Tejada
Curs: CFGS 1r DAM 
Modul: M3 "Programació"
Professor: Isabel Ruiz
Data: 30/09/2021
Nom de la Practica: A4
 */
/*
Volem jugar a un joc consistent en fer una aposta d’una quantitat concreta d’euros. Llençarem un dau.
El joc consisteix en el següent :
a. Si surt un nombre senar ho perdem tot.
b. Si surt 2 guanyem el triple del que hem apostat.
c. Si surt 4 guanyem el doble del que hem apostat.
d. Si surt 6 perdem la meitat del que hem apostat.

El programa ens ha de preguntar quants euros apostem, fer la tirada i informar del saldo final del jugador
*/

package M3_A4_Fernandez_Gerard;
    import java.util.Scanner;
    import java.util.Random;

public class M3_A4_Fernandez_Gerard 
{

    public static void main(String[] args)
    {
       //Variables definidas
       int dado;
       double dinero, total=0;
       //Definir lectura de teclado y numero aleatorio
       Random aleatorio=new Random();
       Scanner teclado = new Scanner(System.in);
       
       //Lectura de dinero
       System.out.print
        (
            "Por favor ingrese la cantidad de dinero que apostara: "
        );
       dinero=teclado.nextDouble();
       //generacion de numero aleatorio
       dado= aleatorio.nextInt(6)+1;
       
       //Sentencia para saber el multiplicador o restar
       if (dado%2!=0)
       {
            System.out.println//resultado diferente a 0 equivale a perder
            (
                "\nPierde todo lo apostado"
            );
            total=0;
       }
            else if(dado==2)//Si sale un 2 en el dado, se multiplicara por 3
            {
                System.out.println
                (
                    "multiplicador triple"
                );
                total=dinero*3;
            }
                else if(dado==4)//Si sale un 4 en el dado, se multiplicara por 2
                {
                    System.out.println
                    (
                        "multiplicador doble"
                    );
                    total=dinero*2;
                }
                    else if(dado==6)//Si sale un 6 en el dado, se divide a la mitad
                    {
                        System.out.println
                        (
                            "¡¡¡Que pena!!! pierde la mitad"
                        );
                        total=dinero/2;
                    }
                    
       System.out.println
       (
            "El dinero apostado a sido: "+dinero+
            "€\nEl dado a sacado un: "+dado+
            "\nEl resultado de la apuesta es: "+total+"€"
       );
    }
}

