package pro.skyhomework.calculator.calculatordemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.xml.bind.annotation.XmlType;

import static org.junit.jupiter.api.Assertions.*;
import static pro.skyhomework.calculator.calculatordemo.CalcServiceTestConstants.*;

class CalcServiceTest {
    CalcService calcService = new CalcService();

    @Test
    void isExistParametersWithDefaultvalues() {
        Boolean expected = calcService.isExistParameters(DEFAULT_VALUE, DEFAULT_VALUE);
        Assertions.assertFalse(expected);
    }

    @Test
    void isExistParametersWithAnyString() {
        Boolean expected = calcService.isExistParameters(NUM_TEST1, NUM_TEST2);
        assertTrue(expected);
        expected = calcService.isExistParameters(NUM_TEST3, NUM_TEST4);
        assertTrue(expected);
        expected = calcService.isExistParameters(ANY_STRING1, ANY_STRING2);
        assertTrue(expected);
    }

    @Test
    void isValidParameters() {
        Boolean expected = calcService.isValidParameters(NUM_TEST1, NUM_TEST2);
        assertTrue(expected);
        expected = calcService.isValidParameters(NUM_TEST3, NUM_TEST4);
        assertTrue(expected);
        expected = calcService.isValidParameters(WRONG_NUM_TEST6, NUM_TEST1);
        assertFalse(expected);
        expected = calcService.isValidParameters(NUM_TEST3, WRONG_NUM_TEST7);
        assertFalse(expected);
        expected = calcService.isValidParameters(WRONG_NUM_TEST5, WRONG_NUM_TEST7);
        assertFalse(expected);
    }

    @Test
    void plus() {
        String expected  = calcService.plus(NUM_TEST1, NUM_TEST2);
        String actual = NUM_TEST1 + " + " + NUM_TEST2 + " = " + Double.toString (Double.parseDouble(NUM_TEST1)+Double.parseDouble(NUM_TEST2));
        assertTrue(actual.equals(expected));

        expected  = calcService.plus(NUM_TEST3, NUM_TEST4);

        actual = NUM_TEST3 + " + " + NUM_TEST4 + " = " + Double.toString (Double.parseDouble(NUM_TEST3)+Double.parseDouble(NUM_TEST4));
        assertTrue(actual.equals(expected));
    }

    @Test
    void plusNotNonValidParameters() {
        String expected  = calcService.plus(WRONG_NUM_TEST5, NUM_TEST1);
        String actual = "Неверный формат данных переданных параметров";
        assertTrue(actual.equals(expected));

        expected  = calcService.plus(WRONG_NUM_TEST6, NUM_TEST3);
        actual = "Неверный формат данных переданных параметров";
        assertTrue(actual.equals(expected));

        expected  = calcService.plus(NUM_TEST2, WRONG_NUM_TEST7);
        actual = "Неверный формат данных переданных параметров";
        assertTrue(actual.equals(expected));
    }

    @Test
    void plusAllParametersExist() {
        String expected  = calcService.plus(NUM_TEST1, DEFAULT_VALUE);
        String actual = "Переданы не все параметры";
        assertTrue(actual.equals(expected));

        expected  = calcService.plus(DEFAULT_VALUE, DEFAULT_VALUE);
        actual = "Переданы не все параметры";
        assertTrue(actual.equals(expected));
    }

    @Test
    void minus() {
        String expected  = calcService.minus(NUM_TEST1, NUM_TEST2);
        String actual = NUM_TEST1 + " - " + NUM_TEST2 + " = " + Double.toString(Double.parseDouble(NUM_TEST1) - Double.parseDouble(NUM_TEST2));
        assertTrue(actual.equals(expected));

        expected  = calcService.minus(NUM_TEST3, NUM_TEST4);
        actual = NUM_TEST3 + " - " + NUM_TEST4 + " = " + Double.toString(Double.parseDouble(NUM_TEST3) - Double.parseDouble(NUM_TEST4));
        assertTrue(actual.equals(expected));
    }

    @Test
    void minusNotNonValidParameters() {
        String expected  = calcService.minus(WRONG_NUM_TEST5, NUM_TEST1);
        String actual = "Неверный формат данных переданных параметров";
        assertTrue(actual.equals(expected));

        expected  = calcService.minus(WRONG_NUM_TEST6, NUM_TEST3);
        actual = "Неверный формат данных переданных параметров";
        assertTrue(actual.equals(expected));

        expected  = calcService.minus(NUM_TEST2, WRONG_NUM_TEST7);
        actual = "Неверный формат данных переданных параметров";
        assertTrue(actual.equals(expected));
    }

    @Test
    void minusAllParametersExist() {
        String expected  = calcService.minus(NUM_TEST1, DEFAULT_VALUE);
        String actual = "Переданы не все параметры";
        assertTrue(actual.equals(expected));

        expected  = calcService.minus(DEFAULT_VALUE, DEFAULT_VALUE);
        actual = "Переданы не все параметры";
        assertTrue(actual.equals(expected));
    }

    @Test
    void multiply() {
        String expected  = calcService.multiply(NUM_TEST1, NUM_TEST2);
        String actual = NUM_TEST1 + " * " + NUM_TEST2 + " = " + Double.toString(Double.parseDouble(NUM_TEST1) * Double.parseDouble(NUM_TEST2));
        assertTrue(actual.equals(expected));

        expected  = calcService.multiply(NUM_TEST3, NUM_TEST4);
        actual = NUM_TEST3 + " * " + NUM_TEST4 + " = " + Double.toString(Double.parseDouble(NUM_TEST3) * Double.parseDouble(NUM_TEST4));
        assertTrue(actual.equals(expected));
    }

    @Test
    void multiplyNotNonValidParameters() {
        String expected  = calcService.multiply(WRONG_NUM_TEST5, NUM_TEST1);
        String actual = "Неверный формат данных переданных параметров";
        assertTrue(actual.equals(expected));

        expected  = calcService.multiply(WRONG_NUM_TEST6, NUM_TEST3);
        actual = "Неверный формат данных переданных параметров";
        assertTrue(actual.equals(expected));

        expected  = calcService.multiply(NUM_TEST2, WRONG_NUM_TEST7);
        actual = "Неверный формат данных переданных параметров";
        assertTrue(actual.equals(expected));
    }

    @Test
    void multiplyAllParametersExist() {
        String expected  = calcService.multiply(NUM_TEST1, DEFAULT_VALUE);
        String actual = "Переданы не все параметры";
        assertTrue(actual.equals(expected));

        expected  = calcService.multiply(DEFAULT_VALUE, DEFAULT_VALUE);
        actual = "Переданы не все параметры";
        assertTrue(actual.equals(expected));
    }

    @Test
    void divide() {
        String expected  = calcService.divide(NUM_TEST1, NUM_TEST2);
        String actual = NUM_TEST1 + " / " + NUM_TEST2 + " = " + Double.toString(Double.parseDouble(NUM_TEST1) / Double.parseDouble(NUM_TEST2));
        assertTrue(actual.equals(expected));

        expected  = calcService.divide(NUM_TEST3, NUM_TEST4);
        actual = NUM_TEST3 + " / " + NUM_TEST4 + " = " + Double.toString(Double.parseDouble(NUM_TEST3) / Double.parseDouble(NUM_TEST4));
        assertTrue(actual.equals(expected));
    }

    @Test
    void divideAllParametersExist() {
        String expected  = calcService.divide(NUM_TEST1, DEFAULT_VALUE);
        String actual = "Переданы не все параметры";
        assertTrue(actual.equals(expected));

        expected  = calcService.divide(DEFAULT_VALUE, DEFAULT_VALUE);
        actual = "Переданы не все параметры";
        assertTrue(actual.equals(expected));
    }

    @Test
    void divideNotNonValidParameters() {
        String expected  = calcService.divide(WRONG_NUM_TEST5, NUM_TEST1);
        String actual = "Неверный формат данных переданных параметров";
        assertTrue(actual.equals(expected));

        expected  = calcService.divide(WRONG_NUM_TEST6, NUM_TEST3);
        actual = "Неверный формат данных переданных параметров";
        assertTrue(actual.equals(expected));

        expected  = calcService.divide(NUM_TEST2, WRONG_NUM_TEST7);
        actual = "Неверный формат данных переданных параметров";
        assertTrue(actual.equals(expected));
    }

    @Test
    void divideExceptionTest() {
        assertThrows(IllegalArgumentException.class, ()->calcService.divide(NUM_TEST1, NUM_ZERO));
    }
}