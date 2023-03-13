/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author yayan
 */
public class input {
    
    public static void main(String[] input){
        Scanner myobj = new Scanner(System.in);
        System.out.println("masukkan nama");
        String nama = myobj.nextLine();
          System.out.println("masukkan umur");
        int umur = myobj.nextInt();
           System.out.println("nama kamu " + nama + "\n" + "umur kamu " + umur);
  

    }
    
    
}
