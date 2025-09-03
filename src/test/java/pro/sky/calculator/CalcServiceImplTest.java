package pro.sky.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcServiceImplTest {
    private List<Double> nums;
    private CalcServiceImpl calcService;

    @BeforeEach
    public void setUp() {
        nums = new ArrayList<>(List.of(12.3, 32.4, 54.7, 0.0));
        calcService = new CalcServiceImpl();
    }


    @Test
    public void plus() {
        String expected = nums.get(0) + " + " + nums.get(1) + " = " + (nums.get(0) + nums.get(1));
        String actual = calcService.plus(nums.get(0), nums.get(1));

        assertEquals(expected, actual);
    }

    @Test
    public void minus() {
        String expected = nums.get(0) + " - " + nums.get(1) + " = " + (nums.get(0) - nums.get(1));
        String actual = calcService.minus(nums.get(0), nums.get(1));

        assertEquals(expected, actual);
    }

    @Test
    public void multiply() {
        String expected = nums.get(0) + " * " + nums.get(1) + " = " + (nums.get(0) * nums.get(1));
        String actual = calcService.multiply(nums.get(0), nums.get(1));

        assertEquals(expected, actual);
    }

    @Test
    public void divide() {
        String expected = nums.get(0) + " / " + nums.get(1) + " = " + (nums.get(0) / nums.get(1));
        String actual = calcService.divide(nums.get(0), nums.get(1));

        assertEquals(expected, actual);
    }

    @Test
    public void divideByZeroArgument() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calcService.divide(nums.get(3), nums.get(3)));

        assertEquals("На ноль делить нельзя!", exception.getMessage());

    }
}
