package com.ads;

/**
 * Clase que implementa funcionalidades básicas de una calculadora
 */
public class Calculator {
    

    public int sum(int a, int b) {
        return a + b;
    }
    

    public int subtract(int a, int b) {
        return a - b;
    }
    

    public int multiply(int a, int b) {
        return a * b;
    }
    

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
    
    /**
     * Calcula a elevado a la potencia b
     */
    public double power(double a, double b) {
        return Math.pow(a, b);
    }
    
    /**
     * Calcula la raíz cuadrada de un número
     */
    public double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }
    
    /**
     * Devuelve el valor absoluto de un número
     */
    public double absolute(double a) {
        return Math.abs(a);
    }
    
    /**
     * Calcula el módulo de a dividido por b
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede calcular el módulo con divisor cero");
        }
        return a % b;
    }
} 