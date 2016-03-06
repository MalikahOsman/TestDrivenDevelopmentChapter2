package za.ac.cput.osman;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Malikah Osmen on 2016-03-06.
 */
public class TestObjectEquality{
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testObject() throws Exception {
        ObjectEquality obj1 = new ObjectEquality("Malikah", "Osman", 21);
        ObjectEquality obj2 = new ObjectEquality("Malikah", "Osman", 21);
        //Assert.assertSame("Malikah","Osman", 21, (obj1.getFirstName(), obj1.getLastName(), obj1.getAge()));
        /*Assert.assertEquals("Malikahs", obj1.getFirstName());
        Assert.assertEquals("Osmans", obj1.getLastName());
        Assert.assertEquals(22, obj1.getAge(), 0);*/
        //Assert.assertNotSame(obj1, obj2);
        Assert.assertEquals(obj1, obj1);

    }
}
