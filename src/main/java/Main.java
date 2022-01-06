package ru.netology.SQRService;
public class Main {
    public int square(int firsNumber, int secondNumber) {
        int counter = 0;
        int minNumber = 10;
        int maxNumber = 99;
        for (int a = minNumber; a <maxNumber; a++) {
            if (a * a >= firsNumber && a * a <= secondNumber) {
                counter++;
            }
        }
        return counter;
    }
}
