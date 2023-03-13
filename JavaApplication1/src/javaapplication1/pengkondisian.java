/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
 
/**
 *
 * @author yayan
 */
public class pengkondisian {
    
  public static void  main(String[] args){
             int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else if (time <= 20) {
  System.out.println("Good evening.");
}else{
   System.out.println("Good night.");  
}

 

//ternary
String hasil = (time > 18 ) ? "Good day" : "Good Evening";
System.out.println(hasil);

switch(time){
    case (18):
         System.out.println("Good day.");
         break;
    case (20):
        System.out.println("Good devening.");
         break;
}


  }
    

}
