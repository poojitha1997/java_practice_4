package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.SortParagraph;
import main.java.com.stackroute.junit.TransposeString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString transposeString;
    @Before
    public void setUp() throws Exception
    {
        transposeString = new TransposeString();
    }

    @Test
    public void testForGivenStringToReverseFail()
    {

        StringBuilder str = new StringBuilder("Go through Interface vs Abstract Class topics");
        str= transposeString.transpose(str);

        assertNotNull("fdjsnvcx jknmdscx jkm",str.toString());
    }
    @Test
    public void testForGivenStringToReverse()
    {
        StringBuilder str = new StringBuilder("Go through Interface vs Abstract Class topics");
        str= transposeString.transpose(str);

         assertEquals("scipot ssalC tcartsbA sv ecafretnI hguorht oG",str.toString());
    }

    @Test
    public void testForGivenStringisNull() {
        StringBuilder str = new StringBuilder("");
        str= transposeString.transpose(str);

        assertEquals("it is null",str.toString());}
        @After
        public void tearDown() throws Exception
        {
            transposeString = null;
        }



}