package za.ac.cput.osman;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Malikah Osmen on 2016-03-06.
 */
public class TestFailingTest {
    @Before
    public void setUp() throws Exception{


    }

    @Test
    public void testFail() throws Exception{
        FailingTest fTest = new FailingTest();
        Assert.assertNotSame("What is this", fTest.nameFail());
    }
}
