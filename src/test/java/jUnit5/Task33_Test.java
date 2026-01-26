package jUnit5;

import basicCommandForTesting.UniqueLangs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Task33_Test {

    private Set<String> testResult;

    @BeforeEach
    void setUpData() {
        UniqueLangs uniqueLangs = new UniqueLangs();
        testResult = uniqueLangs.setUniqueLangs();
    }

    @Test
    @DisplayName("setUniqueLangs method returns NOT null")
    void shouldReturnNotNull() {

        assertNotNull(
                testResult,
                "Languages should NOT be null"
        );
    }

    @Test
    @DisplayName("setUniqueLangs method returns only unique languages")
    void shouldReturnOnlyUniqueLanguages() {

        List<String> languagesList = new ArrayList<>(testResult);
        Set<String> checkSetLangs = new HashSet<>(languagesList);

        assertEquals(
                languagesList.size(),
                checkSetLangs.size(),
                "Languages set should contain only unique values"
        );
    }
}