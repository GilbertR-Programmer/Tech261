package com.sparta.pcw.codesmellsrefactoring;

public class Address {
    private int houseNo = 0;
    private String street = "";
    private String town = "";

    public Address(int houseNo, String street, String town) {
        this.houseNo = houseNo;
        this.street = street;
        this.town = town;
    }

    @Override
    public String toString() {
        return String.format(
                "Address: %s %s, %s",
                houseNo,
                street,
                town
        );
    }

    public boolean isComplete() {
        return houseNo >= 0 &&
                !street.isEmpty() &&
                !town.isEmpty();
    }
}