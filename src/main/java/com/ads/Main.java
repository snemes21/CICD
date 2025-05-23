package com.ads;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("Calculadora avanzada");
        System.out.println("------------------------");
        System.out.println("Operaciones básicas:");
        System.out.println("Suma: 5 + 3 = " + calculator.sum(5, 3));
        System.out.println("Resta: 10 - 4 = " + calculator.subtract(10, 4));
        System.out.println("Multiplicación: 6 * 7 = " + calculator.multiply(6, 7));
        System.out.println("División: 20 / 4 = " + calculator.divide(20, 4));
        
        System.out.println("\nOperaciones avanzadas:");
        System.out.println("Potencia: 2^3 = " + calculator.power(2, 3));
        System.out.println("Raíz cuadrada: √16 = " + calculator.squareRoot(16));
        System.out.println("Valor absoluto: |-5| = " + calculator.absolute(-5));
        System.out.println("Módulo: 17 % 5 = " + calculator.modulo(17, 5));
        
        System.out.println("\nManejo de errores:");
        try {
            System.out.println("División por cero: " + calculator.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            System.out.println("Raíz cuadrada de número negativo: " + calculator.squareRoot(-9));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}