package ru.belnik.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkWithConsole {
    private String result;
    private boolean isSuccessfully = false;

    public String getUserNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        result = reader.readLine();

        return result;
    }
}
