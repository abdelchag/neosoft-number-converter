package org.abdel.neosoft.interview.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NetSoftServiceTest {

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "3,NeoNeo",
            "5,SoSo",
            "7,Ft",
            "9,Neo",
            "51,NeoSo",
            "53,SoNeo",
            "33,NeoNeoNeo",
            "27,NeoFt",
            "15,NeoSoSo"
    })
    public void shouldReturnValueWhenGiven(int givenNumber, String expectedResult) {
        // Given
        NeoSoftService service = new NeoSoftService();
        // When
        String actualResult = service.convertNumber(givenNumber);
        // Then
        Assertions.assertEquals(actualResult, expectedResult);
    }


}
