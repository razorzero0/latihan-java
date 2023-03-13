/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Arrays;
/**
 *
 * @author yayan
 */
public class JavaApplication1 {
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int tes = 10;
   System.out.println(tes+=10); 
   String tes2 = "aku";
      System.out.println(tes2+=" mahasiswa"); 
      String[][] nama = {{"yayan","rido"},{"yopi","sultan"}};
   for (int i = 0;i < nama.length;i++){
    for (int j = 0;j< nama[i].length ;j++){
       System.out.println(nama[i][j]); 
       
    }
   }
   
   String[] arr = {"yayan tampan","aa"};
   
       tes(arr);
           System.out.println(tes2(10));
           
              JavaApplication1 obj = new JavaApplication1();
    float angkaFLoat = obj.tes3((float)50.5);
    String huruf = "huruf";
    int angka = 99;
    
    System.out.printf("contoh float = %f \n String = %s \n angka = %d \n",angkaFLoat,huruf,angka);
    }
    
    /**
     *
     * @param args
     */
    
    private static void tes(String[] nama){
         for (String i : nama){
             System.out.println(i + " ok");
         }
         System.out.println(Arrays.toString(nama));
         
        double a = 5.5;
        double b = 5;
      
         System.out.println(a + b);
    }
    
    public static int tes2(int angka){
    if (angka >= 10){
        return angka;
    }else{
          return 0; 
    }
    
 
    }
    
    public float tes3(float i){
      float x = i;
     return x;
    }
    
}
  
    
    
    
    

