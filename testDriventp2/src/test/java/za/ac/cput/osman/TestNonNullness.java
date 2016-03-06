package za.ac.cput.osman;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Malikah Osmen on 2016-03-06.
 */
public class TestNonNullness {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testNonNullness() throws Exception {

        NonNullness nonNull = new NonNullness();
        Assert.assertNotNull(nonNull.information());
    }
}
