import StaticClassEnumsExeptions.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @BeforeAll    //prepare for tests
    public static void classSetUp() {
        System.out.println("Before all method");
    }

    @AfterAll //after you make test, conclusion
    public static void classTearDown() {
        System.out.println("After all method");
    }

    @BeforeEach
    public void beforeTest() {
        System.out.println("Before each method");
    }

    @AfterEach
    public void afterTest() {
        System.out.println("After each method");
    }

    static Stream<Arguments> dataProvider(){
        return Stream.of(
                Arguments.of(2,2,4,Calculator.Type.SUMMARY),
                Arguments.of(4,2,2,Calculator.Type.DIVISION),
                Arguments.of(2,2,4,Calculator.Type.MULTIPLICATION),
                Arguments.of(5,2,3,Calculator.Type.SUBTRACTION)
        );
    }

    @ParameterizedTest
    @CsvSource ({"2,2,4,SUMMARY","4,2,2,DIVISION"})
    public void csvParamsTest(int a, int b, double expectedResult, Calculator.Type type){
        double actualResult = Calculator.calculate(a,b, type);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("dataProvider")//takes parameters from additional method
    public void methodSourceTest(double a, double b, double expectedResult, Calculator.Type type){
        double actualResult = Calculator.calculate(a,b, type);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, 0, 27, -76345934})
    public void summaryParamsTest(int a) {
        double b = 6;
        double expectedResult = b + a;
        double actualResult = Calculator.calculate(a, b, Calculator.Type.SUMMARY);
        assertNotNull(actualResult, "Summary result is incorrect");
    }

    @ParameterizedTest
    @EnumSource(Calculator.Type.class)
    public void CalculationTypesTest(Calculator.Type type) {
        double a = 25;
        double b = 6;

        double actualResult = Calculator.calculate(a, b, type);
        assertNotNull(actualResult);
        assertTrue(actualResult > 0);
    }

    @Test
    public void summaryTest() {
        double a = 5;
        double b = 6;
        double expectedResult = 11;

        double actualResult = Calculator.calculate(a, b, Calculator.Type.SUMMARY);

        assertEquals(expectedResult, actualResult);
        //added comment
    }

    @Test
    public void divisionTest() {
        double a = 10;
        double b = 2;
        double expectedResult = 5;

        double actualResult = Calculator.calculate(a, b, Calculator.Type.DIVISION);
        assertNotNull(actualResult, "null was returned");
        assertEquals(actualResult, expectedResult, "Division result is incorrect");
        assertTrue(expectedResult == actualResult);
        assertTrue(actualResult > 0);
        assertFalse(actualResult == 0);
    }

    @Test
    @DisplayName("Nullpointer Exception test")
    public void errorTest() {
        double a = 10;
        double b = 2;
        double expectedResult = 5;

        assertThrows(NullPointerException.class, () -> {
            Calculator.calculate(a, b, null);
        });

    }
}

