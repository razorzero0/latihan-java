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
public class kalkulator {
 
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("masukka angka pertama");
        int bil1 = obj.nextInt();
        System.out.println("Pilih Operasi");
        System.out.println(" + = tambah \n - = kurang \n * = kali \n / = bagi");
        String cek = obj.next();
        System.out.println("masukka angka kedua");
        int bil2 = obj.nextInt();
         int hasil = 0;
         switch (cek){
             case ("+"): 
                 hasil = bil1 + bil2;
                 break;
             case("-"):
                hasil = bil1 - bil2;
                   break;
             case("*"):
                hasil = bil1 * bil2;
                   break;
             case("/"):
                 hasil = bil1 / bil2;
                    break;
    }
        System.out.printf("hasil dari %d %s %d adalah = %d \n",bil1,cek,bil2,hasil);
    }
    
}
