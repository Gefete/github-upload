/*
Alumne: Gerard Fernández Tejada
Curs: CFGS 1r DAM 
Modul: M3 "Programació"
Professor: Isabel Ruiz
Data: 11/10/2021
Nom de la Practica: A8.3

A la següent taula es mostren les categories a les quals pertanyen els signes del zodíac:
Foc             Terra           Aire            Aigua
1-Aries         2-Capricorn	3-Balança	4-Cranc
5-Lleó          6-Taure         7-Aquari	8-Escorpió
9-Sagitari	10-Verge	11-Bessons	12-Peixos
Es vol escriure un programa que:
a) Mostri el llistat dels signes del zodíac, amb els seus números associats.
b) Demani per teclat un número (dada enter) associat a un signe del zodíac.
c) Mostri la categoria a la qual pertany el signe del zodíac seleccionat.
Nota: Si el número introduït per l'usuari, no està associat a cap signe del zodíac, es mostrarà el missatge: "ERROR: <número> no associat a cap signe.".
 */
//package m3_a8_3_fernandez_gerard;
    import java.util.Scanner;
public class M3_A8_3_Fernandez_Gerard {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int num;
        System.out.println("Foc             Terra           Aire            Aigua\n" +
                           "1-Aries         2-Capricornio	3-Libra 	4-Cáncer\n" +
                           "5-Leo           6-Tauro         7-Acuario	8-Escorpio\n" +
                           "9-Sagitario	10-Virgo	11-Géminis	12-Piscis");
        System.out.print("Introduzca numeros del 1 al 12 para escoger un signo zodíaco y su elemento: ");
        num= teclado.nextInt();
        switch (num){
            case 1:
                System.out.println("Elemento Fuego, signo zodíaco Aries");
                break;
            case 2:
                System.out.println("Elemento Tierra, signo zodíaco Capricornio");
                break;
            case 3:
                System.out.println("Elemento Aire, signo zodíaco Libra");
                break;
            case 4:
                System.out.println("Elemento Agua, signo zodíaco Cáncer");
                break;
            case 5:
                System.out.println("Elemento Fuego, signo zodíaco Leo");
                break;
            case 6:
                System.out.println("Elemento Tierra, signo zodíaco Tauro");
                break;
            case 7:
                System.out.println("Elemento Aire, signo zodíaco Acuario");
                break;
            case 8:
                System.out.println("Elemento Agua, signo zodíaco Escorpio");
                break;
            case 9:
                System.out.println("Elemento Fuego, signo zodíaco Sagitario");
                break;
            case 10:
                System.out.println("Elemento Tierra, signo zodíaco Virgo");
                break;
            case 11:
                System.out.println("Elemento Aire, signo zodíaco Géminis");
                break;
            case 12:
                System.out.println("Elemento Agua, signo zodíaco Piscis");
                break;
            default:
                System.out.println("Error, los numeros permitidos son de 1 a 12");
              
        }
    }
    
}
