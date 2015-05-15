
/**
 * Created by twer on 5/15/15.
 */
public class Length {
    private final LengthUnit _unit;

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
        {
            Length other = ((Length)obj);
            if (_unit != other._unit)
                return false;

            return _value == ((Length) obj)._value;
        }

        return  false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private int _value;
}
