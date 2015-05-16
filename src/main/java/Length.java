
/**
 * Created by twer on 5/15/15.
 */
public class Length {
    public Length(int n, LengthUnit unit) {
        _value = n;
        _unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        int amountInBaseUnit = _unit.getAmountInBaseUnit(_value);
        int amountInBaseUnitOther = ((Length) obj)._unit.getAmountInBaseUnit(((Length) obj)._value);
        return amountInBaseUnit == amountInBaseUnitOther;
    }

    private int _value;
    private final LengthUnit _unit;
}
