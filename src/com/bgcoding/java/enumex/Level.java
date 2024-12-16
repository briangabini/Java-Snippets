package com.bgcoding.java.enumex;

public enum Level {

    HIGH(1) {
        @Override
        public String normalize() {
            return HIGH.toString().toUpperCase();
        }
    },
    MEDIUM(2) {
        @Override
        public String normalize() {
            return MEDIUM.toString().toUpperCase();
        }
    },
    LOW(3) {
        @Override
        public String normalize() {
            return LOW.toString().toUpperCase();
        }
    };

    private int intValue;

    private Level(int intValue) {
        this.intValue = intValue;
    }

    public int getLevel() {
        return intValue;
    }

    public abstract String normalize();
}
