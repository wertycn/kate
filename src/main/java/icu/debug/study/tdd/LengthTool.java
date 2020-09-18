package icu.debug.study.tdd;

public class LengthTool {

    private final float inchAmount;
    private final double error = 0.00000001;

    public LengthTool(float amount, Unit unit) {
        this.inchAmount = unit.getInchAmount(amount);
    }

    @Override
    public boolean equals(Object object) {
        LengthTool lengthTool = (LengthTool) object;
        return lengthTool.inchAmount - this.inchAmount < error;
    }

    public float toUnit(Unit unit) {
        return unit.getUnitAmount(this.inchAmount, unit);
    }

    //public Integer toUnit(Unit unit) {
    //    return
    //}

}
