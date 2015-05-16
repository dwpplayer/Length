public class LengthUnit {

    private LengthUnit(int convert_Factor) {
        _convert_Factor = convert_Factor;
    }


    int getAmountInBaseUnit(int amount) {
        return amount * _convert_Factor;
    }

    private int _convert_Factor;

    public static final int CONVERT_FACTOR_CENTIMETER = 1;
    public static final int CONVERT_FACTOR_METER = 100 * CONVERT_FACTOR_CENTIMETER;

    public static LengthUnit Meter = new LengthUnit(CONVERT_FACTOR_METER);
    public static LengthUnit CentiMeter = new LengthUnit(CONVERT_FACTOR_CENTIMETER);
}