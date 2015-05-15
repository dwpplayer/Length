
/**
 * Created by twer on 5/15/15.
 */
public class Length {
    public Length(int n) {
        _value = n;
    }

    public Length() {
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if (obj instanceof Length)
            return _value == ((Length) obj)._value;

        return  false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private int _value;
}
