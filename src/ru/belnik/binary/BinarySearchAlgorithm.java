package ru.belnik.binary;

public class BinarySearchAlgorithm {
    private int[] arrayNumbers = new int[100];
    private int start = 0;
    private int mid = arrayNumbers.length / 2 - 1;
    private int end = arrayNumbers.length - 1;
    private static final String less = "-";
    private static final String more = "+";
    private static final String equally = "=";
    public static final String END = "Спасибо за игру!";

    {
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = i + 1;
        }
    }

    public String search(String userResult) {
        int result = 0;

        mid = (start + end) / 2;

        if (userResult.equals("")) {
            return arrayNumbers[mid] + "";

        } else if (userResult.equals(less)) {
            start = mid;
            mid = (start + end) / 2;
            result= arrayNumbers [mid];
            return result + "";

        } else if (userResult.equals(more)) {
            end = mid;
            mid = (start + end) / 2;
            result = arrayNumbers[mid];
            return result + "";

        } else if (userResult.equals(equally)) {
            return END;

        } else {
            return "Это не знак сравнения, попробуйте ещё раз!";
        }
    }
}
