package za.ac.cput.osman;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Malikah Osmen on 2016-03-06.
 */
public class TestTruth {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testName() throws Exception {
        Truth t = new Truth();
        //String expected = "Malikah";
        String result = t.isTrueStr("Malikah");
        boolean bool = false;

        if(result == "Malikah" )
        {
            bool = true;
        }else{
            bool = false;
        }
        Assert.assertTrue( bool );

    }
}
