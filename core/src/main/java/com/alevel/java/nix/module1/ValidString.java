package com.alevel.java.nix.module1;

import java.util.Objects;

public class ValidString {
    String sourceLine;

    public ValidString(String sourceLine) {
        this.sourceLine = sourceLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidString that = (ValidString) o;
        return Objects.equals(sourceLine, that.sourceLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceLine);
    }

    @Override
    public String toString() {
        return sourceLine;
    }

    public boolean isValidString() {
        if (this.toString().isEmpty()) return true;
        for (int i = 0, length = this.toString().length(); i < length; i++) {
            if (this.toString().charAt(i) == '(') {
                if (this.toString().charAt(i + 1) == ')') continue;

            }
        }
        return false;
    }
}

