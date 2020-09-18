package icu.debug.study.tdd;

public class Unit {
    public static Unit Inch = new Unit(1);
    public static Unit Yard = new Unit(36);
    public static Unit Foot = new Unit(12);
    private final Integer rateToInches;

    private Unit(Integer rate) {
        rateToInches = rate;
    }

    public float getInchAmount(float amount) {
        return amount * rateToInches;
    }

    public float getUnitAmount(float inchAmount, Unit unit) {
        return inchAmount / unit.rateToInches;
    }
}
