package com.sau.workshop;

import java.util.Scanner;

public class WorkshopCF01 {
    // สร้างเมนูให้ผู้ใช้เลือก 1, 2 หรือ 3 หากเลือกไม่ใช่ 1 2 3 แสดงข้อความขอบคุณและจบโปรแกรม
    //กรณีเลือก 1 คำนวณพื้นที่สี่เหลี่ยม ป้อนกว้าง ยาว คำนวณ แสดงผล (กว้าง * ยาว)
    //กรณีเลือก 1 คำนวณพื้นที่สามเหลี่ยม ป้อนฐาน สูง คำนวณ แสดงผล (ฐาน * สูง /2 )
    //กรณีเลือก 1 คำนวณพื้นที่วงกลม ป้อนรัศมี คำนวณ แสดงผล (PI * รัศมี²)
    
    public static void main(String[] args) {
        int menu;
        double wi, lo, ba, hi, ra, areaSqure, areaTriangle,areaCircle ;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("+++++++++++++++++++++++");
        System.out.println("          Shape Area Program");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("1. Square Area");
        System.out.println("2. Triangle Area");
        System.out.println("3. Circle Area");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Select menu: ");
        menu = sc.nextInt();
        System.out.println("+++++++++++++++++++++++");
        if(menu == 1){
            //คำนวณพื้นที่สี่เหลี่ยม
            System.out.println("Input Width: ");
            wi = sc.nextDouble();
            System.out.println("Input long: ");
            lo = sc.nextDouble();
            areaSqure = wi * lo;
            System.out.println("Area square is :" + areaSqure);
        }else if( menu == 2 ){
            //คำนวณพื้นที่สี่เหลี่ยม
            System.out.println("Input base: ");
            ba = sc.nextDouble();
            System.out.println("Input hight: ");
            hi = sc.nextDouble();
            areaTriangle = ba * hi / 2;
            System.out.println("Area triangle is :" + areaTriangle);
        }else if( menu == 3 ){
            //คำนวณพื้นที่วงกลม
            System.out.println("Input radius: ");
           ra = sc.nextDouble();
            areaCircle = Math.PI * Math.pow(ra, 2);
            System.out.println("Area circle is :" + areaCircle);
        }else{
            System.out.println("Thank you na ja ^_^");
        }
        System.out.println("++++++++++++++++++++++++");
        
    }
}
