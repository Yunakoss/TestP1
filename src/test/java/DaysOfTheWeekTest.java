
import m8Assignment.DaysOfTheWeek;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DaysOfTheWeekTest {

    @Test
    public void weekDaysTest() {
        DaysOfTheWeek weekDaysTest = new DaysOfTheWeek();
        String daysList = weekDaysTest.getDay(2);
        assertEquals("Monday",daysList);
    }

    @Test
    public void zeroTest(){
        DaysOfTheWeek zeroTest = new DaysOfTheWeek();
        String daysList = zeroTest.getDay(0);
        assertEquals("The number should be equal or larger than 1",daysList);
    }

    @Test
    public void lastTest(){
        DaysOfTheWeek lastTest = new DaysOfTheWeek();
        String daysList = lastTest.getDay(9);
        assertEquals("The number should be equal or smaller than 7",daysList);
    }
    @Test
    @DisplayName("Nullpointer Exception test")
    public void error1Test(){
        assertThrows(NullPointerException.class,()->{
            DaysOfTheWeek.getDay(null);
        });}
    private static Stream<Arguments> getPositiveDay() {
        return Stream.of(
                arguments(1, "Sunday"),
                arguments(2, "Monday"),
                arguments(3, "Tuesday"),
                arguments(4, "Wednesday"),
                arguments(5, "Thursday"),
                arguments(6, "Friday"),
                arguments(7, "Saturday")
        );
    }
    @ParameterizedTest
    @MethodSource("getPositiveDay")
    void PositiveDay(int dayNumber, String dayName) {
        assertEquals(dayName, DaysOfTheWeek.getDay(dayNumber));
    }
      }



