package za.ac.cput.osman;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Malikah Osmen on 2016-03-06.
 */
public class TestArrayContent {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testArray() throws Exception {
        Integer intObj = new Integer();

        int[] expectedArray = {1,3,5,7,9,11};

        int[] resultArray = {1,3,5,7,9,11};
        //int[] resultArray = intObj.getIntArray({1,3,5,7,9});
        Assert.assertArrayEquals(expectedArray, resultArray);
    }
}
