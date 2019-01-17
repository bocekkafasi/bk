/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans_project1;

import java.util.Scanner;

//0-100 arası hem 3 hem de 7'ye bölünebilen sayılar
/**
 *
 * @author vuralfat
 */

public class fibonacci_fonk {

    
static void fibonacci(int x){
        int onceki=0;
        int sonraki=1;
        
        System.out.print(sonraki+" ");
     
        for(int i=0;i<=x;i++){
            
           
            int toplam= onceki+sonraki;
            onceki=sonraki;
            sonraki=toplam;
            System.out.print(toplam+" ");
}
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Lütfen sınırı giriniz");
        Scanner sinir = new Scanner(System.in);
        int sinir1 = sinir.nextInt();
        
            fibonacci(sinir1);
        }
      
        
        
    }
    
    

