package com.alevel.java.nix.programmingday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CachingTightKeyPackingDateWizardTest {

    private CachingTightKeyPackingDateWizard cachingTightKeyPackingDateWizard;

    @BeforeEach
    void setUp() {
        cachingTightKeyPackingDateWizard = new CachingTightKeyPackingDateWizard();
    }

    @Test
    void shouldCacheDates() {
        LocalDate date = cachingTightKeyPackingDateWizard.getDateOfYear(2018, 1);
        assertSame(date, cachingTightKeyPackingDateWizard.getDateOfYear(2018, 1));
    }

    @Test
    void shouldCalculateDates() {
        LocalDate date1 = cachingTightKeyPackingDateWizard.getDateOfYear(2018, 1);
        assertEquals(LocalDate.of(2018, 1, 1), date1);
        LocalDate date2 = cachingTightKeyPackingDateWizard.getDateOfYear(0, 32);
        assertEquals(LocalDate.of(0, 2, 1), date2);
    }
}