package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
    double a, e, d, m, p;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut elma domates muz ve patlicanin kilolarini KG cinsinden sirasiyla giriniz: ");
        a=input.nextDouble();
        e=input.nextDouble();
        d=input.nextDouble();
        m=input.nextDouble();
        p=input.nextDouble();
    double tA=armut*a, tE=e*elma, tD=d*domates, tM=m*muz, tP=p*patlican;
    double total = tA+tE+tD+tM+tP;
        System.out.println("Toplam ucret: " +total);
    }
}
