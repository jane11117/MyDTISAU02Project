package com.dti.controlflow;

//คำสั่ง break; และ continue; ใน Loop
//break ในลูปทำงานเมื่อไรจบ Loop
//continue ในลูปทำงานเมื่อไร จบรอบนั้นไปรอบต่อไปเลย
public class Km03CF {

    public static void main(String[] args) {
        for (int c = 1; c <= 5; c = c + 1) {
            if (c == 3) {
                break;
            }
            System.out.println(c + "_Hey...");
        }
        System.out.println("++++++++++++++++++++++++++++");
        for (int c = 1; c <= 5; c = c + 1) {
            if (c == 3) {
                continue;
            }
            System.out.println(c + "_Hum...");
        }
    }
}
