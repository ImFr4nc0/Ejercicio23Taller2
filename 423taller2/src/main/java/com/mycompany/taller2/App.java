/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller2;


import java.util.*;

/**
 *
 * @author jorge
 */
public class App {

    public static void main(String[] args) {
        double a,b,c,x1,x2;
        Scanner ent=new Scanner(System.in);
        System.out.print("ingresa a:");
        a=ent.nextDouble();
        System.out.print("ingresa b:");
        b=ent.nextDouble();
        System.out.print("ingresa c:");
        c=ent.nextDouble();
        x1=((-1*b)+(Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a);
        x2=((-1*b)-(Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
