/*
Alumne: Gerard Fernández Tejada
Curs: CFGS 1r DAM 
Modul: M3 "Programació"
Professor: Isabel Ruiz
Data: 06/10/2021
Nom de la Practica: A8.2

Introduir un valor numèric entre 1 i 12, que correspon a un mes de l'any. Visualitzar els dies que té el mes introduït. Detectar els errors.
 */
//package m3_a8_2_fernandez_gerard;
    import java.util.Scanner;
public class M3_A8_2_Fernandez_Gerard {

    public static void main(String[] args) {


        int mes;
        Scanner teclado = new Scanner(System.in);   
         
        System.out.println("Escoge un mes (introducir en formato numero del mes)");
        System.out.println("[1] Enero\n[2] Febrero\n[3] Marzo\n"
                + "[4] Abril\n[5] Mayo\n[6] Junio\n"
                + "[7] Julio\n[8] Agosto\n[9] Septiembre\n"
                + "[10] Octubre\n[11] Noviembre\n[12] Diciembre");      
        System.out.print("Selecciona una opción:");
        mes = teclado.nextInt();
        //Introducimos el Switch, buscara el valor hasta que de con el, luego hara un break para terminar el Switch
        switch(mes) {      
            case 1:
                System.out.print("Enero tiene de\n 1  | 2  | 3  | 4  | 5  | 6\n 7  | 8  | 9  | 10 | 11 | 12\n 13 | 14 | 15 | 16 | 17 | 18\n 19 | 20 | 21 | 22 | 23 | 24 \n 25 | 26 | 27 | 28 | 29 | 30 | 31 dias");              
                break;            
            case 2:
                System.out.print("Febrero tiene de\n 1  | 2  | 3  | 4  | 5  | 6\n 7  | 8  | 9  | 10 | 11 | 12\n 13 | 14 | 15 | 16 | 17 | 18\n 19 | 20 | 21 | 22 | 23 | 24 \n 25 | 26 | 27 | 28 | 29 | 30 dias");                
                break;
            case 3:
                System.out.print("Marzo tiene de\n 1  | 2  | 3  | 4  | 5  | 6\n 7  | 8  | 9  | 10 | 11 | 12\n 13 | 14 | 15 | 16 | 17 | 18\n 19 | 20 | 21 | 22 | 23 | 24 \n 25 | 26 | 27 | 28 | 29 | 30 | 31 dias");              
                break;            
            case 4:
                System.out.print("Abril tiene de\n 1  | 2  | 3  | 4  | 5  | 6\n 7  | 8  | 9  | 10 | 11 | 12\n 13 | 14 | 15 | 16 | 17 | 18\n 19 | 20 | 21 | 22 | 23 | 24 \n 25 | 26 | 27 | 28 | 29 | 30 dias");                
                break;   
            case 5:
                System.out.print("Mayo tiene de\n 1  | 2  | 3  | 4  | 5  | 6\n 7  | 8  | 9  | 10 | 11 | 12\n 13 | 14 | 15 | 16 | 17 | 18\n 19 | 20 | 21 | 22 | 23 | 24 \n 25 | 26 | 27 | 28 | 29 | 30 | 31 dias");              
                break;            
            case 6:
                System.out.print("Junio tiene de\n 1  | 2  | 3  | 4  | 5  | 6\n 7  | 8  | 9  | 10 | 11 | 12\n 13 | 14 | 15 | 16 | 17 | 18\n 19 | 20 | 21 | 22 | 23 | 24 \n 25 | 26 | 27 | 28 | 29 | 30 dias");                
                break;   
            case 7:
                System.out.print("Julio tiene de\n 1  | 2  | 3  | 4  | 5  | 6\n 7  | 8  | 9  | 10 | 11 | 12\n 13 | 14 | 15 | 16 | 17 | 18\n 19 | 20 | 21 | 22 | 23 | 24 \n 25 | 26 | 27 | 28 | 29 | 30 | 31 dias");              
                break;            
            case 8:
                System.out.print("Agosto tiene de\n 1  | 2  | 3  | 4  | 5  | 6\n 7  | 8  | 9  | 10 | 11 | 12\n 13 | 14 | 15 | 16 | 17 | 18\n 19 | 20 | 21 | 22 | 23 | 24 \n 25 | 26 | 27 | 28 | 29 | 30 | 31 dias");                
                break;   
            case 9:
                System.out.print("Septiembre tiene de\n 1  | 2  | 3  | 4  | 5  | 6\n 7  | 8  | 9  | 10 | 11 | 12\n 13 | 14 | 15 | 16 | 17 | 18\n 19 | 20 | 21 | 22 | 23 | 24 \n 25 | 26 | 27 | 28 | 29 | 30 dias");              
                break;            
            case 10:
                System.out.print("Octubre tiene de \n 1  | 2  | 3  | 4  | 5  | 6\n 7  | 8  | 9  | 10 | 11 | 12\n 13 | 14 | 15 | 16 | 17 | 18\n 19 | 20 | 21 | 22 | 23 | 24 \n 25 | 26 | 27 | 28 | 29 | 30 | 31 dias");                
                break;    
            case 11:
                System.out.print("Noviembre tiene de\n 1  | 2  | 3  | 4  | 5  | 6\n 7  | 8  | 9  | 10 | 11 | 12\n 13 | 14 | 15 | 16 | 17 | 18\n 19 | 20 | 21 | 22 | 23 | 24 \n 25 | 26 | 27 | 28 | 29 | 30 dias");              
                break;            
            case 12:
                System.out.print("Diciembre tiene de\n 1  | 2  | 3  | 4  | 5  | 6\n 7  | 8  | 9  | 10 | 11 | 12\n 13 | 14 | 15 | 16 | 17 | 18\n 19 | 20 | 21 | 22 | 23 | 24 \n 25 | 26 | 27 | 28 | 29 | 30 | 31 dias");                
                break;   
            default:  
                System.out.println("Error, esta opción no existe reinicie el programa");
        }      
        System.out.println("\nFin del programa");
    }
    
}
