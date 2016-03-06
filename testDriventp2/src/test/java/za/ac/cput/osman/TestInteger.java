package za.ac.cput.osman;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

/**
 * Created by Malikah Osmen on 2016-03-05.
 */
public class TestInteger
{
    @Before
    public void before()
    {
        System.out.println("This is in the before class");
    }

    @Test
    public void testInt()
    {
        Integer num = new Integer();
        Assert.assertEquals(10, num.addInt(5,5));
    }

    @Test
    public void testTestInt() throws Exception {

    }
}
