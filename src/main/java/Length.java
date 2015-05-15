
/**
 * Created by twer on 5/15/15.
 */
public class Length {
    private final LengthUnit _unit;
    private final int CentiMeter_Con_Factor = 1;
    private final int Meter_Con_Factor = 100;

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
        if (_unit == LengthUnit.Meter)
        {
            return _value * Meter_Con_Factor;
        }
        else if(_unit == LengthUnit.CentiMeter)
        {
            return _value * CentiMeter_Con_Factor;
        }
        return 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private int _value;
}
