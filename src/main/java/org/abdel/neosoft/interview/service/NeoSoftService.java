package org.abdel.neosoft.interview.service;


import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class NeoSoftService {

    private static final Map<Integer, String> CASES_CONTENT = Map.of(
            3, "Neo",
            5, "So",
            7, "Ft"
    );

    private static final List<Integer> CASES_DIVIDER = Arrays.asList(3, 5);


    public String convertNumber(int inputNumber) {
        StringBuilder sb = new StringBuilder();

        CASES_DIVIDER.stream()
                .filter(d -> inputNumber % d == 0)
                .forEach(d -> sb.append(CASES_CONTENT.get(d)));

        String inputString = String.valueOf(inputNumber);
        inputString.chars().map(Character::getNumericValue)
                .filter(CASES_CONTENT::containsKey)
                .forEach(c -> sb.append(CASES_CONTENT.get(c)));
        if (sb.isEmpty()) {
            sb.append(inputString);
        }

        return sb.toString();
    }
}