/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans_project1;

import java.util.Scanner;

// 90+ AA
// 80-90 BB
// 70-80 CC
// 70- F

/**
 *
 * @author vuralfat
 */
public class for_if_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      
        System.out.println("Lütfen notunuzu giriniz");
        Scanner s = new Scanner(System.in);
        int not = s.nextInt();
        
        if(not>=90) {
            System.out.println("AA");
        }
        else if(not>=80){
                
            System.out.println("BB");

                
        }
        else if(not>=70){
            System.out.println("CC");
        }
        else{
            System.out.println("F");
        }
        
        
      
    }
    }
    

