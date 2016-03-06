package za.ac.cput.osman;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Malikah Osmen on 2016-03-06.
 */
public class TestObjectIdentity {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testName() throws Exception {
        ObjectIdentity id1 = new ObjectIdentity();
        ObjectIdentity id2 = id1;

        Assert.assertSame(id1, id2);
        System.out.println("The two objects points to exactly the same memory allocation, making it identical");
    }
}
