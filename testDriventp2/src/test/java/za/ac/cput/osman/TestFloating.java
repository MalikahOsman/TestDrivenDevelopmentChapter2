package za.ac.cput.osman;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

/**
 * Created by Malikah Osmen on 2016-03-05.
 */
public class TestFloating {
    @Before
    public void before()
    {
        System.out.println("This is the test floating points class");
    }
    @Test(timeout =100)
    public void testFloat()
    {
        FloatingPoint float1 = new FloatingPoint();
        Assert.assertEquals(15.4f, float1.addFloat(11.2f,4.2f),0);
    }
}
