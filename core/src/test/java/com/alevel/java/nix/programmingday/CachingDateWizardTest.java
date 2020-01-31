package com.alevel.java.nix.programmingday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CachingDateWizardTest {

    private CachingDateWizard cachingDateWizard;

    @BeforeEach
    void setUp() {
        cachingDateWizard = new CachingDateWizard();
    }

    @Test
    void shouldCacheDates() {
        LocalDate date = cachingDateWizard.getDateOfYear(2018, 1);
        assertSame(date, cachingDateWizard.getDateOfYear(2018, 1));
    }

    @Test
    void shouldCalculateDates() {
        LocalDate date = cachingDateWizard.getDateOfYear(2018, 1);
        assertEquals(LocalDate.of(2018, 1, 1), date);
    }

}