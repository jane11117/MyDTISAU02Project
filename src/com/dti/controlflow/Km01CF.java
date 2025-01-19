/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dti.controlflow;

/**
 *
 * @author IT306PC
 */
public class Km01CF {
//psvp กด Tab
    public static void main(String[] args) {
        //แบบที่ 1 พิสูจน์ครั้งเดียวจริง เท็จไม่ทำ : if
        int a = 20;
        
        if( a > 5){
            System.out.println("Hello....");
        }
        System.out.println("+++++++++++++++++++++++++");
        //แบบที่ 2 พิสูจน์ครั้งเดียวจริงทำอย่าง เท็จทำอีกอย่าง : if-else
        int b = 100;
        if( b<80){
            System.out.println("Wow...");
        }else{
            System.out.println("Woo...");
        }
        //แบบที่ 3 พิสูจน์หลายครั้ง : if-else-if ,swich-case
        int c = 70;
        if(c > 80){
            System.out.println("111");
        }else if( c > 70){
            System.out.println("222");
        }else if( c > 60){
            System.out.println("333");
        }else{ //ไม่จำเป็นต้องมี if ทั้งนี้ขึ้นอยู่กับโจทย์
            System.out.println("555555555555");
        }
        System.out.println("+++++++++++++++++++++++++");
        int busNumber = 84;
        switch(busNumber){
            case 80 : System.out.println("Sanamlong"); 
                            break;
            case 57 : System.out.println("PATA");                
                            break;
            case 84 : System.out.println("Wat Rai King");        
                            break;
            case 81 : System.out.println("Siriraj");
                            break;
            default : System.out.println("Don't have data T_T");        
        }
    }
    
}
