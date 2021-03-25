package com.company;

public class Command {
    private SnackType snackType;
    private int subType;
    private int amount;

    public Command(SnackType snackType, int subType, int amount) {
        this.setSnackType(snackType);
        this.setSubType(subType);
        this.setAmount(amount);
    }

    public SnackType getSnackType() {
        return snackType;
    }

    public void setSnackType(SnackType snackType) {
        this.snackType = snackType;
    }

    public int getSubType() {
        return subType;
    }

    public void setSubType(int subType) {
        this.subType = subType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
