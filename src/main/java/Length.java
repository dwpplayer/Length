
/**
 * Created by twer on 5/15/15.
 */
public class Length {
    private final LengthUnit _unit;

    private LengthUnit lengthUnit;

    public Length(int n) {
        this(n, LengthUnit.Meter);
    }

    public Length() {
        this(0);
    }

    public Length(int n, LengthUnit unit) {
        _value = n;
        _unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if (obj instanceof Length)
            return getAmountInBaseUnit() == ((Length) obj).getAmountInBaseUnit();

        return  false;
    }

    private int getAmountInBaseUnit() {
        return _unit.getAmountInBaseUnit(_value);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private int _value;
}
