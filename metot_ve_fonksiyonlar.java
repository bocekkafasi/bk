/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author FATMA
 */
public class metot_ve_fonksiyonlar {

    /**
     * @param args the command line arguments
     */
    
    static int f(int x){
            
            return x*5+10;
        }
    
    static int g(int x, int y){
        
        return x+y*5;
    }
    
    static void yaz(){
        
        String x;
        
        x=("Merhaba Emir :)");
        
        x=x.toUpperCase();
        System.out.println(x);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        yaz();
        System.out.println(f(10));
        System.out.println(g(5,3));
        System.out.println(f(g(2,2)));
        
        
        
        
}
    
}
