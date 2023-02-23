package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            try {
                System.out.println("Nhập vào cạnh a: ");
                double a = input.nextDouble();

                System.out.println("Nhập vào cạnh b: ");
                double b = input.nextDouble();

                System.out.println("Nhập vào cạnh b: ");
                double c = input.nextDouble();

                if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b +c <= a) {
                    throw  new IllegalArgumentException("c");
                } else {
                    double perimeter = a + b + c;
                    double p = perimeter / 2;
                    double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    System.out.println("Chu vi của tam giác là: " + perimeter);
                    System.out.println("Diện tích của tam giác là: " + area);

                    if (a == b && b == c) {
                        System.out.println("Tam giác này là tam giác đều.");
                    } else if (a == b || a == c || b == c){
                        System.out.println("Tam giác này là tam giác cân.");
                    } else if(a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                        System.out.println("Tam gíac này là tam giác cân.");
                    } else {
                        System.out.println("Tam giác này là tam giác thường.");
                    }
                }
                input.close();

            } catch (IllegalArgumentException e) {
                System.out.println("Các cạnh nhập vào không hợp lệ!");
            }
    }
}