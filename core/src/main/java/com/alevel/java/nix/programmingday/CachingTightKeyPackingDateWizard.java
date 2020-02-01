package com.alevel.java.nix.programmingday;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CachingTightKeyPackingDateWizard extends SimpleDateWizard {

    private final Map<Integer, LocalDate> cache = new HashMap<>();

    @Override
    public LocalDate getDateOfYear(int year, int day) {
        return cache.computeIfAbsent(key(year, day), key -> super.getDateOfYear(year, day));
    }

    private static int key(int year, int day) {
        // year is -999 999 999 to 999 999 999
        // day is 1 to 366 (less than 512)
        // for most practical purposes, 9 bits for day and 23 for year should be enough
        int key = year << 9;
        key += day;
        return key;
    }

}
