package com.alevel.java.nix.programmingday;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CachingKeyPackingDateWizard extends SimpleDateWizard {

    private final Map<Long, LocalDate> cache = new HashMap<>();

    @Override
    public LocalDate getDateOfYear(int year, int day) {
        return cache.computeIfAbsent(key(year, day), key -> super.getDateOfYear(getYear(key), getDay(key)));
    }

    private static long key(int year, int day) {
        long key = year;
        key <<= 32;
        key |= (day & 0xffffffffL);
        return key;
    }

    private static int getDay(long key) {
        return (int) (key); // last 32 bits
    }

    private static int getYear(long key) {
        return (int) (key >> 32); // first 32 bits
    }

}
