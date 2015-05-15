public class LengthUnit {
    private static final int CentiMeter_Con_Factor = 1;
    private static final int Meter_Con_Factor = 100;

    private int _convert_Factor = 0;


    public LengthUnit(int convert_Factor) {
        _convert_Factor = convert_Factor;
    }

    int getAmountInBaseUnit(int amount) {
        return amount * _convert_Factor;
    }

    public static LengthUnit Meter = new LengthUnit(Meter_Con_Factor);
    public static LengthUnit CentiMeter = new LengthUnit(CentiMeter_Con_Factor);
}