package com.sparta.grr;

import java.io.Serializable;

public enum Days implements Serializable {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static void main(String[] args) {
        Days dayOff = Days.FRIDAY;
        System.out.println(dayOff.compareTo(MONDAY));

    }
}
