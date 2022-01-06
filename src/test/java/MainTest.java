package ru.netology.SQRService;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'Square calculate, between numbers 200, 300',200,300,3",
                    "'Square calculate, between first number is square of 15 and other is 300',225,300,3",
                    "'Square calculate, between first and second numbers is square of 15',225,225,1",
                    "'Square calculate, between first number bigger then second number',300,200,0",
                    "'Square calculate, between first number bigger then second number',0,225,6",
                    "'Square calculate, between first number bigger then second number',200,289,3"
            }
    )
    void shoudSquareCalculate(String test, int firstNumber, int secondNumber, int expected) {
        Main service = new Main();
        int squares = service.square(firstNumber, secondNumber);
        assertEquals(expected, squares);
    }
}