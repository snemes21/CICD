package com.ads;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Calculator
 */
@DisplayName("Test de la clase Calculator")
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test para suma de números")
    void testSum() {
        assertEquals(8, calculator.sum(5, 3), "5 + 3 debería ser 8");
        assertEquals(0, calculator.sum(-5, 5), "-5 + 5 debería ser 0");
        assertEquals(-8, calculator.sum(-5, -3), "-5 + (-3) debería ser -8");
    }

    @Test
    @DisplayName("Test para resta de números")
    void testSubtract() {
        assertEquals(6, calculator.subtract(10, 4), "10 - 4 debería ser 6");
        assertEquals(-1, calculator.subtract(5, 6), "5 - 6 debería ser -1");
        assertEquals(0, calculator.subtract(3, 3), "3 - 3 debería ser 0");
    }

    @Test
    @DisplayName("Test para multiplicación de números")
    void testMultiply() {
        assertEquals(42, calculator.multiply(6, 7), "6 * 7 debería ser 42");
        assertEquals(0, calculator.multiply(0, 5), "0 * 5 debería ser 0");
        assertEquals(-12, calculator.multiply(4, -3), "4 * (-3) debería ser -12");
    }

    @Test
    @DisplayName("Test para división de números")
    void testDivide() {
        assertEquals(5.0, calculator.divide(20, 4), "20 / 4 debería ser 5.0");
        assertEquals(2.5, calculator.divide(5, 2), "5 / 2 debería ser 2.5");
        assertEquals(0.0, calculator.divide(0, 5), "0 / 5 debería ser 0.0");
    }

    @Test
    @DisplayName("Test para división por cero")
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        }, "Dividir por cero debería lanzar ArithmeticException");
        
        String expectedMessage = "No se puede dividir por cero";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage), 
                   "El mensaje de excepción debería contener '" + expectedMessage + "'");
    }
    
    @Test
    @DisplayName("Test para potencia")
    void testPower() {
        assertEquals(8.0, calculator.power(2, 3), "2^3 debería ser 8.0");
        assertEquals(1.0, calculator.power(5, 0), "5^0 debería ser 1.0");
        assertEquals(0.25, calculator.power(2, -2), "2^(-2) debería ser 0.25");
        assertEquals(1.0, calculator.power(1, 100), "1^100 debería ser 1.0");
    }
    
    @Test
    @DisplayName("Test para raíz cuadrada")
    void testSquareRoot() {
        assertEquals(4.0, calculator.squareRoot(16), "√16 debería ser 4.0");
        assertEquals(0.0, calculator.squareRoot(0), "√0 debería ser 0.0");
        assertEquals(1.5, calculator.squareRoot(2.25), "√2.25 debería ser 1.5");
    }
    
    @Test
    @DisplayName("Test para raíz cuadrada de número negativo")
    void testSquareRootNegative() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.squareRoot(-4);
        }, "Raíz cuadrada de número negativo debería lanzar ArithmeticException");
        
        String expectedMessage = "No se puede calcular la raíz cuadrada de un número negativo";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage), 
                  "El mensaje de excepción debería contener '" + expectedMessage + "'");
    }
    
    @Test
    @DisplayName("Test para valor absoluto")
    void testAbsolute() {
        assertEquals(5.0, calculator.absolute(5), "|5| debería ser 5.0");
        assertEquals(7.0, calculator.absolute(-7), "|-7| debería ser 7.0");
        assertEquals(0.0, calculator.absolute(0), "|0| debería ser 0.0");
    }
    
    @Test
    @DisplayName("Test para módulo")
    void testModulo() {
        assertEquals(2, calculator.modulo(17, 5), "17 % 5 debería ser 2");
        assertEquals(0, calculator.modulo(10, 5), "10 % 5 debería ser 0");
        assertEquals(0, calculator.modulo(0, 5), "0 % 5 debería ser 0");
    }
    
    @Test
    @DisplayName("Test para módulo con divisor cero")
    void testModuloWithZeroDivisor() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.modulo(5, 0);
        }, "Módulo con divisor cero debería lanzar ArithmeticException");
        
        String expectedMessage = "No se puede calcular el módulo con divisor cero";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage), 
                  "El mensaje de excepción debería contener '" + expectedMessage + "'");
    }
} 