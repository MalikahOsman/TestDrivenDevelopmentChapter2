package za.ac.cput.osman;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Malikah Osmen on 2016-03-06.
 */
public class TestFalse {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testName() throws Exception
    {

            False f = new False();

            String result = f.isFalseStr("Osman");
            boolean bool = true;

            if(result == "Osman" )
            {
                bool = false;
            }else{
                bool = true;
            }
            Assert.assertFalse( bool );

        }
}