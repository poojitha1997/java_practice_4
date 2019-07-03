package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.ReplaceCharacter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


public class ReplaceCharacterTest
{
    ReplaceCharacter replaceCharacter;
    @Before
    public void setUp() throws Exception
    {
        replaceCharacter = new ReplaceCharacter();
    }

    @Test
    public void testForGivenStringReplace()
    {

        String str=replaceCharacter.replaceTheAlphabet("daily dry");
        assertEquals("faity fry",str);
    }
    @Test
    public void testForGivenStringNoAlphabet()
    {
        String str=replaceCharacter.replaceTheAlphabet("this is cat");
        assertNotNull("faity fry",str);
        //int str=occurrenceTest.countOccurrence("it is test",'z');
        //assertEquals(0,str);

    }

    @Test
    public void testForGivenStringAsCapitalLetter()
    {
        String str=replaceCharacter.replaceTheAlphabet("DAILY DRY");
        assertEquals("faity fry",str);
    }

    @After
    public void tearDown() throws Exception
    {
        replaceCharacter = null;
    }



}