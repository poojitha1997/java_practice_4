package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.ReplaceCharacter;
import main.java.com.stackroute.junit.SortParagraph;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

public class SortParagraphTest
{
    SortParagraph sortParagraph;
    @Before
    public void setUp() throws Exception
    {
        sortParagraph = new SortParagraph();
    }

    @Test
    public void testForGivenStringReplace()
    {

      String str=sortParagraph.sortThePara("Go through Interface vs Abstract Class topics");
        assertEquals("[Abstract, Class, Go, Interface, through, topics, vs]",str);
    }
    @Test
    public void testForGivenStringReplaceIsWrong()
    {
        String str=sortParagraph.sortThePara("Go through Interface vs Abstract Class topics");
        assertNotNull("[Abstract, Go, Class, Interface, through, topics, vs]",str);
    }

    @Test
    public void testForGivenStringisNull()
    {
        String str=sortParagraph.sortThePara("");
        assertNotNull("null",str);    }

    @After
    public void tearDown() throws Exception
    {
        sortParagraph = null;
    }




}