package com.nordico.sfgpetclinic.model;

import com.nordico.sfgpetclinic.RepeatedTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;


public class RepeatedPersonTest  {

    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} of {totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
        // TODO - impl
    }

    @RepeatedTest(5)
    @DisplayName("My Repeated Test with DI")
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + " : " +
                repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
    }
}
