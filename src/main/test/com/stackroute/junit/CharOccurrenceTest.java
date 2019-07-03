package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.CharOccurrence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharOccurrenceTest
{
   CharOccurrence occurrenceTest;
    @Before
    public void setUp() throws Exception
    {
        occurrenceTest = new CharOccurrence();
    }

    @Test
    public void testForGivenStringReturnOfOccurence()
    {
        int str=occurrenceTest.countOccurrence("java is java again java again",'a');
       assertEquals(10,str);
    }
    @Test
    public void testForGivenStringNoAlphabet()
    {
     int str=occurrenceTest.countOccurrence("it is test",'z');
     assertEquals(0,str);

    }

    @Test
    public void testForGivenStringAsCapitalLetter()
    {
     int str=occurrenceTest.countOccurrence("IT IS A CAT",'a');
     assertEquals(2,str);

    }

    @After
    public void tearDown() throws Exception
    {
        occurrenceTest = null;
    }



}