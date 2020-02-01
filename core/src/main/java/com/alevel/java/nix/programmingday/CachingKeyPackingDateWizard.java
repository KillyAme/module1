package com.alevel.java.nix.programmingday;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CachingKeyPackingDateWizard extends SimpleDateWizard {

    private final Map<Long, LocalDate> cache = new HashMap<>();

    @Override
    public LocalDate getDateOfYear(int year, int day) {
        return cache.computeIfAbsent(key(year, day), key -> super.getDateOfYear(year, day));
    }

    private static long key(int year, int day) {
        long key = year;
        key <<= 32;
        key |= (day & 0xffffffffL);
        return key;
    }

}
