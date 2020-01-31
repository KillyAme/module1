package com.alevel.java.nix.programmingday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CachingKeyPackingDateWizardTest {

    private CachingKeyPackingDateWizard cachingKeyPackingDateWizard;

    @BeforeEach
    void setUp() {
        cachingKeyPackingDateWizard = new CachingKeyPackingDateWizard();
    }

    @Test
    void shouldCacheDates() {
        LocalDate date = cachingKeyPackingDateWizard.getDateOfYear(2018, 1);
        assertSame(date, cachingKeyPackingDateWizard.getDateOfYear(2018, 1));
    }

    @Test
    void shouldCalculateDates() {
        LocalDate date = cachingKeyPackingDateWizard.getDateOfYear(2018, 1);
        assertEquals(LocalDate.of(2018, 1, 1), date);
    }
}