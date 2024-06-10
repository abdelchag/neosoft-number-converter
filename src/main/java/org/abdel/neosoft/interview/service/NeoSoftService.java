package org.abdel.neosoft.interview.service;


import java.util.Map;

public class NeoSoftService {

    private static final Map<Integer, String> CASES = Map.of(
            3, "Neo",
            5, "So",
            7, "Ft"
    );


    public String convertNumber(int inputNumber) {
        StringBuilder sb = new StringBuilder();
        if (inputNumber % 3 == 0) {
            sb.append(CASES.get(3));
        }
        if (inputNumber % 5 == 0) {
            sb.append(CASES.get(5));
        }
        String inputString = String.valueOf(inputNumber);
        inputString.chars().map(Character::getNumericValue)
                .filter(CASES::containsKey)
                .forEach(c -> sb.append(CASES.get(c)));
        if (sb.isEmpty()) {
            sb.append(inputString);
        }

        return sb.toString();
    }
}