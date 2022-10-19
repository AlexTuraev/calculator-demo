package pro.skyhomework.calculator.calculatordemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.skyhomework.calculator.calculatordemo.CalcServiceTestConstants.*;

public class CalcServiceParameterizedTest {
    CalcService calcService = new CalcService();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void testCalcServiceMethods(String param1, String param2, String expectedMessage) {
        String result = calcService.plus(param1, param2);
        assertEquals(result, expectedMessage);

        result = calcService.minus(param1, param2);
        assertEquals(result, expectedMessage);

        result = calcService.multiply(param1, param2);
        assertEquals(result, expectedMessage);

        result = calcService.divide(param1, param2);
        assertEquals(result, expectedMessage);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMethodPlus")
    public void testCalcServiceMethodPlus(String param1, String param2, String expectedMessage) {
        String result = calcService.plus(param1, param2);
        assertEquals(result, expectedMessage);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMethodMinus")
    public void testCalcServiceMethodMinus(String param1, String param2, String expectedMessage) {
        String result = calcService.minus(param1, param2);
        assertEquals(result, expectedMessage);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMethodMultiply")
    public void testCalcServiceMethodMultiply(String param1, String param2, String expectedMessage) {
        String result = calcService.multiply(param1, param2);
        assertEquals(result, expectedMessage);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMethodDivide")
    public void testCalcServiceMethodDivide(String param1, String param2, String expectedMessage) {
        String result = calcService.divide(param1, param2);
        assertEquals(result, expectedMessage);
    }

    public static Stream <Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(DEFAULT_VALUE, DEFAULT_VALUE, MESSAGE_NEED_PARAMETERS),
                Arguments.of(NUM_TEST1, DEFAULT_VALUE, MESSAGE_NEED_PARAMETERS),
                Arguments.of(NUM_TEST2, DEFAULT_VALUE, MESSAGE_NEED_PARAMETERS),
                Arguments.of(WRONG_NUM_TEST5, WRONG_NUM_TEST6, MESSAGE_NOT_VALID_PARAMETERS),
                Arguments.of(WRONG_NUM_TEST7, NUM_TEST2, MESSAGE_NOT_VALID_PARAMETERS),
                Arguments.of(NUM_TEST3, WRONG_NUM_TEST6, MESSAGE_NOT_VALID_PARAMETERS),
                Arguments.of(NUM_TEST1, WRONG_NUM_TEST7, MESSAGE_NOT_VALID_PARAMETERS)
        );
    }

    public static Stream <Arguments> provideParamsForMethodPlus() {
        return Stream.of(
                Arguments.of(NUM_TEST1, NUM_TEST2, NUM_TEST1 + " + " + NUM_TEST2 + " = "
                        + Double.toString (Double.parseDouble(NUM_TEST1)+Double.parseDouble(NUM_TEST2))
                ),
                Arguments.of(NUM_TEST2, NUM_TEST3, NUM_TEST2 + " + " + NUM_TEST3 + " = "
                        + Double.toString (Double.parseDouble(NUM_TEST2)+Double.parseDouble(NUM_TEST3))
                ),
                Arguments.of(NUM_TEST4, NUM_TEST1, NUM_TEST4 + " + " + NUM_TEST1 + " = "
                        + Double.toString (Double.parseDouble(NUM_TEST4)+Double.parseDouble(NUM_TEST1))
                )
        );
    }

    public static Stream <Arguments> provideParamsForMethodMinus() {
        return Stream.of(
                Arguments.of(NUM_TEST1, NUM_TEST2, NUM_TEST1 + " - " + NUM_TEST2 + " = "
                        + Double.toString (Double.parseDouble(NUM_TEST1)-Double.parseDouble(NUM_TEST2))
                ),
                Arguments.of(NUM_TEST2, NUM_TEST3, NUM_TEST2 + " - " + NUM_TEST3 + " = "
                        + Double.toString (Double.parseDouble(NUM_TEST2)-Double.parseDouble(NUM_TEST3))
                ),
                Arguments.of(NUM_TEST4, NUM_TEST1, NUM_TEST4 + " - " + NUM_TEST1 + " = "
                        + Double.toString (Double.parseDouble(NUM_TEST4)-Double.parseDouble(NUM_TEST1))
                )
        );
    }

    public static Stream <Arguments> provideParamsForMethodMultiply() {
        return Stream.of(
                Arguments.of(NUM_TEST1, NUM_TEST2, NUM_TEST1 + " * " + NUM_TEST2 + " = "
                        + Double.toString (Double.parseDouble(NUM_TEST1)*Double.parseDouble(NUM_TEST2))
                ),
                Arguments.of(NUM_TEST2, NUM_TEST3, NUM_TEST2 + " * " + NUM_TEST3 + " = "
                        + Double.toString (Double.parseDouble(NUM_TEST2)*Double.parseDouble(NUM_TEST3))
                ),
                Arguments.of(NUM_TEST4, NUM_TEST1, NUM_TEST4 + " * " + NUM_TEST1 + " = "
                        + Double.toString (Double.parseDouble(NUM_TEST4)*Double.parseDouble(NUM_TEST1))
                )
        );
    }

    public static Stream <Arguments> provideParamsForMethodDivide() {
        return Stream.of(
                Arguments.of(NUM_TEST1, NUM_TEST2, NUM_TEST1 + " / " + NUM_TEST2 + " = "
                        + Double.toString (Double.parseDouble(NUM_TEST1)/Double.parseDouble(NUM_TEST2))
                ),
                Arguments.of(NUM_TEST2, NUM_TEST3, NUM_TEST2 + " / " + NUM_TEST3 + " = "
                        + Double.toString (Double.parseDouble(NUM_TEST2)/Double.parseDouble(NUM_TEST3))
                ),
                Arguments.of(NUM_TEST4, NUM_TEST1, NUM_TEST4 + " / " + NUM_TEST1 + " = "
                        + Double.toString (Double.parseDouble(NUM_TEST4)/Double.parseDouble(NUM_TEST1))
                )
        );
    }
}
