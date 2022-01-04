/*
Alumne: Gerard Fernández Tejada
Curs: CFGS 1r DAM 
Modul: M3 "Programació"
Professor: Isabel Ruiz
Data: 7/10/2021
Nom de la Practica: A7

Escriu un programa que demani una quantitat entera de diners (en cèntims d'euro) i 
mostri per pantalla la quantitat mínima de monedes necessària per lliurar aquesta quantitat. 
Les monedes poden ser de 1, 2,5,10,20,50,100,200  cèntims d'euro.
 */
//package m3_a7_fernandez_gerard;
    import java.util.Scanner;
  
public class M3_A7_Fernandez_Gerard {
    
    public static void main(String[] args) {
       
        Scanner teclado= new Scanner(System.in);
        int cent, result=0; //cent son los centimos que se introducen, result hace los calculos para saber cuantos centimos nos quedan
        double total; //Total registra los centimos y los pasa a €, este valor es para mantener los centimos introducidos
        System.out.print("Inserte en centimos de euro : ");
        cent= teclado.nextInt();
        total=(double)cent/100;
        //Va pasando los centimos a Euros y despues con los centimos que quedan, dice en que monedas de centimo pueden pagarse
        if (cent>0){
            if (cent>=100){
                result=cent/100;
                System.out.println("  moneda/s de un euro: "+result);
                cent=cent-(result*100);
            }
            if((cent<=99)&&(cent>=50)){
                    result=cent/50;
                    System.out.println("  moneda/s de 50 centimos: "+result);
                    cent=cent-50;
            }           
            if((cent<50)&&(cent>=20)){
                    result=cent/20;
                    System.out.println("  moneda/s de 20 centimos: "+result);
                    cent=cent-(result*20);
            }            
            if((cent<20)&&(cent>=10)){
                    result=cent/10;
                    System.out.println("  moneda/s de 10 centimos: "+result);
                    cent=cent-10;
            }             
            if((cent<10)&&(cent>=5)){
                    result=cent/5;
                    System.out.println("  moneda/s de 5  centimos: "+result);
                    cent=cent-5;
            }            
            if((cent<5)&&(cent>=2)){
                    result=cent/2;
                    System.out.println("  moneda/s de 2  centimos: "+result);
                    cent=cent-(result*2);
            }           
            if((cent<2)&&(cent>=1)){
                    result=cent/1;
                    System.out.println("  moneda/s de 1  centimos: "+result);
                    cent=cent-1;
            }    
        }else{
            System.out.println("Error");
        } 
        
        System.out.println("En total son: "+total+"€");
    }
    
}
