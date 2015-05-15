import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by twer on 5/15/15.
 */
public class LengthTest {
    @Test
    public void should_be_equal_when_compare_two_lengths(){
        assertEquals(new Length(), new Length());
    }

    @Test
    public void should_be_equal_when_compare_two_lenghts_with_same_value(){
        assertEquals(new Length(3), new Length(3));
    }

    @Test
    public void should_not_be_equal_when_compare_two_lengths_with_different_values(){
        assertNotEquals(new Length(2), new Length(1));
    }

    @Test
    public void should_be_equal_when_compare_two_lengths_with_same_values_and_same_unit()
    {
        assertEquals(new Length(5, LengthUnit.Meter), new Length(5, LengthUnit.Meter) );
    }

    @Test
    public void should_be_equal_when_compare_two_lengths_with_different_values_and_same_unit()
    {
        assertNotEquals(new Length(5, LengthUnit.Meter), new Length(95, LengthUnit.Meter));
    }

    @Test
    public void should_not_be_equal_when_compare_two_lengths_with_same_values_and_different_unit()
    {
        assertNotEquals(new Length(5, LengthUnit.Meter), new Length(5, LengthUnit.CentiMeter));
    }

}
